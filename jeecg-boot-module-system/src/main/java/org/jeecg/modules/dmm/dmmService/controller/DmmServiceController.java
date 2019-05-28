package org.jeecg.modules.dmm.dmmService.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.aspect.annotation.AutoLog;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.dmm.dmmService.entity.DmmService;
import org.jeecg.modules.dmm.dmmService.service.IDmmServiceService;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;

import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

 /**
 * @Description: 增值服务表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Slf4j
@Api("增值服务表")
@RestController
@RequestMapping("/dmmService/dmmService")
public class DmmServiceController {
	@Autowired
	private IDmmServiceService dmmServiceService;
	
	/**
	  * 分页列表查询
	 * @param dmmService
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "增值服务表-分页列表查询")
	@ApiOperation(value="增值服务表-分页列表查询", notes="增值服务表-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<DmmService>> queryPageList(DmmService dmmService,
									  @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
									  @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
									  HttpServletRequest req) {
		Result<IPage<DmmService>> result = new Result<IPage<DmmService>>();
		QueryWrapper<DmmService> queryWrapper = QueryGenerator.initQueryWrapper(dmmService, req.getParameterMap());
		Page<DmmService> page = new Page<DmmService>(pageNo, pageSize);
		IPage<DmmService> pageList = dmmServiceService.page(page, queryWrapper);
		result.setSuccess(true);
		result.setResult(pageList);
		return result;
	}
	
	/**
	  *   添加
	 * @param dmmService
	 * @return
	 */
	@AutoLog(value = "增值服务表-添加")
	@ApiOperation(value="增值服务表-添加", notes="增值服务表-添加")
	@PostMapping(value = "/add")
	public Result<DmmService> add(@RequestBody DmmService dmmService) {
		Result<DmmService> result = new Result<DmmService>();
		try {
			dmmServiceService.save(dmmService);
			result.success("添加成功！");
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			result.error500("操作失败");
		}
		return result;
	}
	
	/**
	  *  编辑
	 * @param dmmService
	 * @return
	 */
	@AutoLog(value = "增值服务表-编辑")
	@ApiOperation(value="增值服务表-编辑", notes="增值服务表-编辑")
	@PutMapping(value = "/edit")
	public Result<DmmService> edit(@RequestBody DmmService dmmService) {
		Result<DmmService> result = new Result<DmmService>();
		DmmService dmmServiceEntity = dmmServiceService.getById(dmmService.getId());
		if(dmmServiceEntity==null) {
			result.error500("未找到对应实体");
		}else {
			boolean ok = dmmServiceService.updateById(dmmService);
			//TODO 返回false说明什么？
			if(ok) {
				result.success("修改成功!");
			}
		}
		
		return result;
	}
	
	/**
	  *   通过id删除
	 * @param id
	 * @return
	 */
	@AutoLog(value = "增值服务表-通过id删除")
	@ApiOperation(value="增值服务表-通过id删除", notes="增值服务表-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<DmmService> delete(@RequestParam(name="id",required=true) String id) {
		Result<DmmService> result = new Result<DmmService>();
		DmmService dmmService = dmmServiceService.getById(id);
		if(dmmService==null) {
			result.error500("未找到对应实体");
		}else {
			boolean ok = dmmServiceService.removeById(id);
			if(ok) {
				result.success("删除成功!");
			}
		}
		
		return result;
	}
	
	/**
	  *  批量删除
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "增值服务表-批量删除")
	@ApiOperation(value="增值服务表-批量删除", notes="增值服务表-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<DmmService> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		Result<DmmService> result = new Result<DmmService>();
		if(ids==null || "".equals(ids.trim())) {
			result.error500("参数不识别！");
		}else {
			this.dmmServiceService.removeByIds(Arrays.asList(ids.split(",")));
			result.success("删除成功!");
		}
		return result;
	}
	
	/**
	  * 通过id查询
	 * @param id
	 * @return
	 */
	@AutoLog(value = "增值服务表-通过id查询")
	@ApiOperation(value="增值服务表-通过id查询", notes="增值服务表-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<DmmService> queryById(@RequestParam(name="id",required=true) String id) {
		Result<DmmService> result = new Result<DmmService>();
		DmmService dmmService = dmmServiceService.getById(id);
		if(dmmService==null) {
			result.error500("未找到对应实体");
		}else {
			result.setResult(dmmService);
			result.setSuccess(true);
		}
		return result;
	}

  /**
      * 导出excel
   *
   * @param request
   * @param response
   */
  @RequestMapping(value = "/exportXls")
  public ModelAndView exportXls(HttpServletRequest request, HttpServletResponse response) {
      // Step.1 组装查询条件
      QueryWrapper<DmmService> queryWrapper = null;
      try {
          String paramsStr = request.getParameter("paramsStr");
          if (oConvertUtils.isNotEmpty(paramsStr)) {
              String deString = URLDecoder.decode(paramsStr, "UTF-8");
              DmmService dmmService = JSON.parseObject(deString, DmmService.class);
              queryWrapper = QueryGenerator.initQueryWrapper(dmmService, request.getParameterMap());
          }
      } catch (UnsupportedEncodingException e) {
          e.printStackTrace();
      }

      //Step.2 AutoPoi 导出Excel
      ModelAndView mv = new ModelAndView(new JeecgEntityExcelView());
      List<DmmService> pageList = dmmServiceService.list(queryWrapper);
      //导出文件名称
      mv.addObject(NormalExcelConstants.FILE_NAME, "增值服务表列表");
      mv.addObject(NormalExcelConstants.CLASS, DmmService.class);
      mv.addObject(NormalExcelConstants.PARAMS, new ExportParams("增值服务表列表数据", "导出人:Jeecg", "导出信息"));
      mv.addObject(NormalExcelConstants.DATA_LIST, pageList);
      return mv;
  }

  /**
      * 通过excel导入数据
   *
   * @param request
   * @param response
   * @return
   */
  @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
  public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
      MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
      Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
      for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
          MultipartFile file = entity.getValue();// 获取上传文件对象
          ImportParams params = new ImportParams();
          params.setTitleRows(2);
          params.setHeadRows(1);
          params.setNeedSave(true);
          try {
              List<DmmService> listDmmServices = ExcelImportUtil.importExcel(file.getInputStream(), DmmService.class, params);
              for (DmmService dmmServiceExcel : listDmmServices) {
                  dmmServiceService.save(dmmServiceExcel);
              }
              return Result.ok("文件导入成功！数据行数:" + listDmmServices.size());
          } catch (Exception e) {
              log.error(e.getMessage(),e);
              return Result.error("文件导入失败:"+e.getMessage());
          } finally {
              try {
                  file.getInputStream().close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
      return Result.ok("文件导入失败！");
  }

}
