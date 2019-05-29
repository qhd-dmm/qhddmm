package org.jeecg.modules.dmm.dmmOrderBill.entity;

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
import org.jeecg.common.aspect.annotation.Dict;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: 订单明细表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Data
@TableName("dmm_order_bill")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="dmm_order_bill对象", description="订单明细表")
public class DmmOrderBill {
    
	/**清单表主键*/
	@TableId(type = IdType.UUID)
    @ApiModelProperty(value = "清单表主键")
	private String id;
	/**订单表*/
	@Excel(name = "订单表", width = 15)
    @ApiModelProperty(value = "订单表")
	private String orderId;
	/**清单类型*/
	@Excel(name = "清单类型", width = 15,dicCode="bill_type")
	@Dict(dicCode = "bill_type")
    @ApiModelProperty(value = "清单类型(1.活体  2.商品   3.服务   4.套餐 )")
	private Integer billType;
	/**是否赠礼*/
	@Excel(name = "是否赠礼", width = 15)
    @ApiModelProperty(value = "是否赠礼")
	private Integer isGift;
	/**供应商id*/
	@Excel(name = "供应商id", width = 15)
    @ApiModelProperty(value = "供应商id")
	private Integer supplierId;
	/**商品id*/
	@Excel(name = "商品id", width = 15)
    @ApiModelProperty(value = "商品id")
	private Integer goodsId;
	/**商品数量*/
	@Excel(name = "商品数量", width = 15)
    @ApiModelProperty(value = "商品数量")
	private Integer num;
	/**清单价格*/
	@Excel(name = "清单价格", width = 15)
    @ApiModelProperty(value = "清单价格")
	private java.math.BigDecimal totalPrice;
	/**清单备注*/
	@Excel(name = "清单备注", width = 15)
    @ApiModelProperty(value = "清单备注")
	private String billRemarks;
	/**退款状态*/
	@Excel(name = "退款状态", width = 15,dicCode="refund_status")
	@Dict(dicCode = "refund_status")
    @ApiModelProperty(value = "0.未发生退款       1.退款中       2退款完成")
	private Integer refundStatus;
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
