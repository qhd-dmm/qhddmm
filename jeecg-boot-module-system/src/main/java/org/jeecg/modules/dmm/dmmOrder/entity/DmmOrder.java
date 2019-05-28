package org.jeecg.modules.dmm.dmmOrder.entity;

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
 * @Description: 订单主表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Data
@TableName("dmm_order")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="dmm_order对象", description="订单主表")
public class DmmOrder {
    
	/**订单(商品)主键*/
	@TableId(type = IdType.UUID)
    @ApiModelProperty(value = "订单(商品)主键")
	private String id;
	/**订单状态(1.待付款  2.待发货  3.待收货   4.交易完成  5.交易关闭)*/
	@Excel(name = "订单状态(1.待付款  2.待发货  3.待收货   4.交易完成  5.交易关闭)", width = 15)
    @ApiModelProperty(value = "订单状态(1.待付款  2.待发货  3.待收货   4.交易完成  5.交易关闭)")
	private Integer orderStatus;
	/**收货方式	0:送货上门 1:自提*/
	@Excel(name = "收货方式	0:送货上门 1:自提", width = 15)
    @ApiModelProperty(value = "收货方式	0:送货上门 1:自提")
	private Integer deliverType;
	/**客户id*/
	@Excel(name = "客户id", width = 15)
    @ApiModelProperty(value = "客户id")
	private String customId;
	/**清单总金额*/
	@Excel(name = "清单总金额", width = 15)
    @ApiModelProperty(value = "清单总金额")
	private java.math.BigDecimal billMoney;
	/**运费*/
	@Excel(name = "运费", width = 15)
    @ApiModelProperty(value = "运费")
	private java.math.BigDecimal deliverMoney;
	/**订单总金额  包括运费*/
	@Excel(name = "订单总金额  包括运费", width = 15)
    @ApiModelProperty(value = "订单总金额  包括运费")
	private java.math.BigDecimal totalMoney;
	/**实际订单总金额 进行各种折扣之后的金额*/
	@Excel(name = "实际订单总金额 进行各种折扣之后的金额", width = 15)
    @ApiModelProperty(value = "实际订单总金额 进行各种折扣之后的金额")
	private java.math.BigDecimal realTotalMoney;
	/**支付方式  0:货到付款 1:先款后货*/
	@Excel(name = "支付方式  0:货到付款 1:先款后货", width = 15)
    @ApiModelProperty(value = "支付方式  0:货到付款 1:先款后货")
	private Integer payType;
	/**支付来源  1:现金，2：支付宝  3微信*/
	@Excel(name = "支付来源  1:现金，2：支付宝  3微信", width = 15)
    @ApiModelProperty(value = "支付来源  1:现金，2：支付宝  3微信")
	private Integer payFrom;
	/**是否支付定金 0:未支付 1:已支付*/
	@Excel(name = "是否支付定金 0:未支付 1:已支付", width = 15)
    @ApiModelProperty(value = "是否支付定金 0:未支付 1:已支付")
	private Integer isPayFront;
	/**是否支付尾款	0:未支付 1:已支付*/
	@Excel(name = "是否支付尾款	0:未支付 1:已支付", width = 15)
    @ApiModelProperty(value = "是否支付尾款	0:未支付 1:已支付")
	private Integer isPayAll;
	/**收货人姓名*/
	@Excel(name = "收货人姓名", width = 15)
    @ApiModelProperty(value = "收货人姓名")
	private String userName;
	/**收件人地址*/
	@Excel(name = "收件人地址", width = 15)
    @ApiModelProperty(value = "收件人地址")
	private String userAddress;
	/**收件人手机*/
	@Excel(name = "收件人手机", width = 15)
    @ApiModelProperty(value = "收件人手机")
	private String userPhone;
	/**所得积分*/
	@Excel(name = "所得积分", width = 15)
    @ApiModelProperty(value = "所得积分")
	private Integer orderScore;
	/**是否需要发票   1:需要 0:不需要*/
	@Excel(name = "是否需要发票   1:需要 0:不需要", width = 15)
    @ApiModelProperty(value = "是否需要发票   1:需要 0:不需要")
	private Integer isInvoice;
	/**发票抬头*/
	@Excel(name = "发票抬头", width = 15)
    @ApiModelProperty(value = "发票抬头")
	private String invoiceClient;
	/**订单来源	0:门店 1:微信*/
	@Excel(name = "订单来源	0:门店 1:微信", width = 15)
    @ApiModelProperty(value = "订单来源	0:门店 1:微信")
	private Integer orderSrc;
	/**收货时间*/
	@Excel(name = "收货时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "收货时间")
	private Date receiveTime;
	/**发货时间*/
	@Excel(name = "发货时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "发货时间")
	private Date deliveryTime;
	/**订单描述(针对于发猫前的进展信息)*/
	@Excel(name = "订单描述(针对于发猫前的进展信息)", width = 15)
    @ApiModelProperty(value = "订单描述(针对于发猫前的进展信息)")
	private String orderDescription;
	/**订单备注*/
	@Excel(name = "订单备注", width = 15)
    @ApiModelProperty(value = "订单备注")
	private String orderRemarks;
	/**所属员工id*/
	@Excel(name = "所属员工id", width = 15)
    @ApiModelProperty(value = "所属员工id")
	private Integer staffId;
	/**0.未发生退款       1.退款中       2退款完成*/
	@Excel(name = "0.未发生退款       1.退款中       2退款完成", width = 15)
    @ApiModelProperty(value = "0.未发生退款       1.退款中       2退款完成")
	private Integer refundStatus;
	/**快递公司ID*/
	@Excel(name = "快递公司ID", width = 15)
    @ApiModelProperty(value = "快递公司ID")
	private String expressId;
	/**快递号*/
	@Excel(name = "快递号", width = 15)
    @ApiModelProperty(value = "快递号")
	private String expressNo;
	/**是否包含套餐 1是  -1不是*/
	@Excel(name = "是否包含套餐 1是  -1不是", width = 15)
    @ApiModelProperty(value = "是否包含套餐 1是  -1不是")
	private Integer ifSetMeal;
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
