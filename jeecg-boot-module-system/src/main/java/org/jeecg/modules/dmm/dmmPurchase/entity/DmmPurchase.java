package org.jeecg.modules.dmm.dmmPurchase.entity;

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
 * @Description: 采购主表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Data
@TableName("dmm_purchase")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="dmm_purchase对象", description="采购主表")
public class DmmPurchase {
    
	/**主键*/
	@TableId(type = IdType.UUID)
    @ApiModelProperty(value = "主键")
	private String id;
	/**采购类型(1.订单采购  2.公司日常采购   3.固定资产采购)*/
	@Excel(name = "采购类型(1.订单采购  2.公司日常采购   3.固定资产采购)", width = 15)
    @ApiModelProperty(value = "采购类型(1.订单采购  2.公司日常采购   3.固定资产采购)")
	private Integer purchaseType;
	/**采购状态(1.已申请   2.已到货    3已核销)*/
	@Excel(name = "采购状态(1.已申请   2.已到货    3已核销)", width = 15)
    @ApiModelProperty(value = "采购状态(1.已申请   2.已到货    3已核销)")
	private Integer purchaseStatus;
	/**采购单合计价格*/
	@Excel(name = "采购单合计价格", width = 15)
    @ApiModelProperty(value = "采购单合计价格")
	private java.math.BigDecimal totalPrice;
	/**申请时间*/
	@Excel(name = "申请时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "申请时间")
	private Date applyTime;
	/** 到货时间*/
	@Excel(name = " 到货时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = " 到货时间")
	private Date receiveTime;
	/**核销时间*/
	@Excel(name = "核销时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "核销时间")
	private Date closeAcountTime;
	/**期望到货时间*/
	@Excel(name = "期望到货时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "期望到货时间")
	private Date expectTime;
	/**申请人*/
	@Excel(name = "申请人", width = 15)
    @ApiModelProperty(value = "申请人")
	private Integer applyStaffId;
	/**执行人*/
	@Excel(name = "执行人", width = 15)
    @ApiModelProperty(value = "执行人")
	private Integer staffId;
	/**进货备注*/
	@Excel(name = "进货备注", width = 15)
    @ApiModelProperty(value = "进货备注")
	private String purchaseMarks;
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
