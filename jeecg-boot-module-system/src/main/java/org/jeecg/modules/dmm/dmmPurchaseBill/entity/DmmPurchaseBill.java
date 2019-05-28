package org.jeecg.modules.dmm.dmmPurchaseBill.entity;

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
 * @Description: 采购清单表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Data
@TableName("dmm_purchase_bill")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="dmm_purchase_bill对象", description="采购清单表")
public class DmmPurchaseBill {
    
	/**主键*/
	@TableId(type = IdType.UUID)
    @ApiModelProperty(value = "主键")
	private String id;
	/**采购单id*/
	@Excel(name = "采购单id", width = 15)
    @ApiModelProperty(value = "采购单id")
	private String purchaseId;
	/**货品id*/
	@Excel(name = "货品id", width = 15)
    @ApiModelProperty(value = "货品id")
	private String goodsId;
	/**货品名称*/
	@Excel(name = "货品名称", width = 15)
    @ApiModelProperty(value = "货品名称")
	private String goodsName;
	/**清单备注*/
	@Excel(name = "清单备注", width = 15)
    @ApiModelProperty(value = "清单备注")
	private String remarks;
	/**采购清单数量*/
	@Excel(name = "采购清单数量", width = 15)
    @ApiModelProperty(value = "采购清单数量")
	private Integer num;
	/**采购清单单价*/
	@Excel(name = "采购清单单价", width = 15)
    @ApiModelProperty(value = "采购清单单价")
	private java.math.BigDecimal price;
	/**采购小计*/
	@Excel(name = "采购小计", width = 15)
    @ApiModelProperty(value = "采购小计")
	private java.math.BigDecimal totalPrice;
	/**供货商id*/
	@Excel(name = "供货商id", width = 15)
    @ApiModelProperty(value = "供货商id")
	private String supplierId;
	/**供货商名称*/
	@Excel(name = "供货商名称", width = 15)
    @ApiModelProperty(value = "供货商名称")
	private String supplierName;
	/**经手人姓名*/
	@Excel(name = "经手人姓名", width = 15)
    @ApiModelProperty(value = "经手人姓名")
	private String staffName;
	/**期望到货时间*/
	@Excel(name = "期望到货时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "期望到货时间")
	private Date expectTime;
	/**到货时间*/
	@Excel(name = "到货时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "到货时间")
	private Date arrivalTime;
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
