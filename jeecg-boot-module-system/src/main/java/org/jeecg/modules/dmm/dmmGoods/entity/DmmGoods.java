package org.jeecg.modules.dmm.dmmGoods.entity;

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
 * @Description: 商品表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Data
@TableName("dmm_goods")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="dmm_goods对象", description="商品表")
public class DmmGoods {
    
	/**商品表主键*/
	@TableId(type = IdType.UUID)
    @ApiModelProperty(value = "商品表主键")
	private String id;
	/**商品编号*/
	@Excel(name = "商品编号", width = 15)
    @ApiModelProperty(value = "商品编号")
	private String goodsCode;
	/**商品货号*/
	@Excel(name = "商品货号", width = 15)
    @ApiModelProperty(value = "商品货号")
	private String productNo;
	/**商品名称*/
	@Excel(name = "商品名称", width = 15)
    @ApiModelProperty(value = "商品名称")
	private String goodsName;
	/**商品图片地址*/
	@Excel(name = "商品图片地址", width = 15)
    @ApiModelProperty(value = "商品图片地址")
	private String goodsImg;
	/**市场价格*/
	@Excel(name = "市场价格", width = 15)
    @ApiModelProperty(value = "市场价格")
	private java.math.BigDecimal marketPrice;
	/**门店价*/
	@Excel(name = "门店价", width = 15)
    @ApiModelProperty(value = "门店价")
	private java.math.BigDecimal shopPrice;
	/**预警库存*/
	@Excel(name = "预警库存", width = 15)
    @ApiModelProperty(value = "预警库存")
	private Integer warnStock;
	/**商品总库存*/
	@Excel(name = "商品总库存", width = 15)
    @ApiModelProperty(value = "商品总库存")
	private Integer goodsStock;
	/**单位表id*/
	@Excel(name = "单位表id", width = 15)
    @ApiModelProperty(value = "单位表id")
	private Integer goodsUnit;
	/**促销信息*/
	@Excel(name = "促销信息", width = 15)
    @ApiModelProperty(value = "促销信息")
	private Object goodsTips;
	/**是否上架	0:不上架 1:上架*/
	@Excel(name = "是否上架	0:不上架 1:上架", width = 15)
    @ApiModelProperty(value = "是否上架	0:不上架 1:上架")
	private Integer isSale;
	/**是否热销产品	0:否 1:是*/
	@Excel(name = "是否热销产品	0:否 1:是", width = 15)
    @ApiModelProperty(value = "是否热销产品	0:否 1:是")
	private Integer isHot;
	/**商品分类ID路径*/
	@Excel(name = "商品分类ID路径", width = 15)
    @ApiModelProperty(value = "商品分类ID路径")
	private String goodsCatPath;
	/**最后一级商品分类ID	*/
	@Excel(name = "最后一级商品分类ID	", width = 15)
    @ApiModelProperty(value = "最后一级商品分类ID	")
	private Integer goodsCatId;
	/**品牌Id*/
	@Excel(name = "品牌Id", width = 15)
    @ApiModelProperty(value = "品牌Id")
	private Integer brandId;
	/**商品描述	*/
	@Excel(name = "商品描述	", width = 15)
    @ApiModelProperty(value = "商品描述	")
	private String goodsDesc;
	/**商品状态	-1:违规 0:未审核 1:已审核*/
	@Excel(name = "商品状态	-1:违规 0:未审核 1:已审核", width = 15)
    @ApiModelProperty(value = "商品状态	-1:违规 0:未审核 1:已审核")
	private Integer goodsStatus;
	/**总销售量*/
	@Excel(name = "总销售量", width = 15)
    @ApiModelProperty(value = "总销售量")
	private Integer saleNum;
	/**上架时间*/
	@Excel(name = "上架时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "上架时间")
	private Date saleTime;
	/**删除标志	-1:删除 1:有效*/
	@Excel(name = "删除标志	-1:删除 1:有效", width = 15)
    @ApiModelProperty(value = "删除标志	-1:删除 1:有效")
	private Integer dataStatus;
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
