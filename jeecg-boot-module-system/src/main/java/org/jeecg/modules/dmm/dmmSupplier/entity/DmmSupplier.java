package org.jeecg.modules.dmm.dmmSupplier.entity;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: 供应商表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Data
@TableName("dmm_supplier")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="dmm_supplier对象", description="供应商表")
public class DmmSupplier {
    
	/**供应商主键*/
	@TableId(type = IdType.UUID)
    @ApiModelProperty(value = "供应商主键")
	private String id;
	/**供应商编号*/
	@Excel(name = "供应商编号", width = 15)
    @ApiModelProperty(value = "供应商编号")
	private String supplierCode;
	/**供应商名称*/
	@Excel(name = "供应商名称", width = 15)
    @ApiModelProperty(value = "供应商名称")
	private String supplierName;
	/**供应商手机*/
	@Excel(name = "供应商手机", width = 15)
    @ApiModelProperty(value = "供应商手机")
	private String supplierPhone;
	/**供应商地址*/
	@Excel(name = "供应商地址", width = 15)
    @ApiModelProperty(value = "供应商地址")
	private String address;
	/**供应商状态    0停用  1启用*/
	@Excel(name = "供应商状态    0停用  1启用", width = 15)
    @ApiModelProperty(value = "供应商状态    0停用  1启用")
	private Integer supplierStatus;
	/**供应商登陆名*/
	@Excel(name = "供应商登陆名", width = 15)
    @ApiModelProperty(value = "供应商登陆名")
	private String loginName;
	/**供应商登陆密码*/
	@Excel(name = "供应商登陆密码", width = 15)
    @ApiModelProperty(value = "供应商登陆密码")
	private String loginPwd;
	/**供应商类型   1.活体 2.食品用品  3服务商*/
	@Excel(name = "供应商类型   1.活体 2.食品用品  3服务商", width = 15)
    @ApiModelProperty(value = "供应商类型   1.活体 2.食品用品  3服务商")
	private Integer supplierType;
	/**是否合格   0不合格   1合格*/
	@Excel(name = "是否合格   0不合格   1合格", width = 15)
    @ApiModelProperty(value = "是否合格   0不合格   1合格")
	private Integer qualifiedStatus;
	/**删除标志    -1已删除   1未删除*/
	@Excel(name = "删除标志    -1已删除   1未删除", width = 15)
    @ApiModelProperty(value = "删除标志    -1已删除   1未删除")
	private Integer dateStatus;
	/**创建人*/
	@Excel(name = "创建人", width = 15)
    @ApiModelProperty(value = "创建人")
	private String createBy;
	/**创建时间*/
	@Excel(name = "创建时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
	private Date createTime;
	/**修改人*/
	@Excel(name = "修改人", width = 15)
    @ApiModelProperty(value = "修改人")
	private String updateBy;
	/**修改时间*/
	@Excel(name = "修改时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "修改时间")
	private Date updateTime;
}
