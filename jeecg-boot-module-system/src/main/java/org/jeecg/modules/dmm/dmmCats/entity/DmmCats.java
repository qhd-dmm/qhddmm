package org.jeecg.modules.dmm.dmmCats.entity;

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
 * @Description: 猫咪表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Data
@TableName("dmm_cats")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="dmm_cats对象", description="猫咪表")
public class DmmCats {
    
	/**猫咪主键*/
	@TableId(type = IdType.UUID)
    @ApiModelProperty(value = "猫咪主键")
	private String id;
	/**猫咪编号*/
	@Excel(name = "猫咪编号", width = 15)
    @ApiModelProperty(value = "猫咪编号")
	private String code;
	/**猫咪名称*/
	@Excel(name = "猫咪名称", width = 15)
    @ApiModelProperty(value = "猫咪名称")
	private String name;
	/**猫咪公母   0未知  1公  2母*/
	@Excel(name = "猫咪公母  1公  2母", width = 15, dicCode="sex")
	@Dict(dicCode = "sex")
    @ApiModelProperty(value = "猫咪公母   0未知  1公  2母")
	private Integer sex;
	/**体重(kg)*/
	@Excel(name = "体重(kg)", width = 15)
    @ApiModelProperty(value = "体重(kg)")
	private Double weight;
	/**出生日期*/
	@Excel(name = "出生日期", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "出生日期")
	private Date birthday;
	/**猫咪描述(疫苗情况，血统情况以及其他情况描述 )*/
	@Excel(name = "猫咪描述(疫苗情况，血统情况以及其他情况描述 )", width = 15)
    @ApiModelProperty(value = "猫咪描述(疫苗情况，血统情况以及其他情况描述 )")
	private String description;
	/**猫咪分类id*/
	@Excel(name = "猫咪分类id", width = 15)
    @ApiModelProperty(value = "猫咪分类id")
	private String categoryId;
	/**所属会员id*/
	@Excel(name = "所属会员id", width = 15)
    @ApiModelProperty(value = "所属会员id")
	private String belongingUserId;
	/**所属供应商id*/
	@Excel(name = "所属供应商id", width = 15)
    @ApiModelProperty(value = "所属供应商id")
	private String belongingSupplierId;
	/**删除标识  -1删除   1未删除*/
	@Excel(name = "删除标识  -1删除   1未删除", width = 15,dicCode="data_status")
	@Dict(dicCode = "data_status")
    @ApiModelProperty(value = "删除标识  -1删除   1未删除")
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
