package org.jeecg.modules.dmm.dmmUserRank.entity;

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
 * @Description: 会员等级表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Data
@TableName("dmm_user_rank")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="dmm_user_rank对象", description="会员等级表")
public class DmmUserRank {
    
	/**主键*/
	@TableId(type = IdType.UUID)
    @ApiModelProperty(value = "主键")
	private String id;
	/**会员等级名称*/
	@Excel(name = "会员等级名称", width = 15)
    @ApiModelProperty(value = "会员等级名称")
	private String rankName;
	/**开始积分*/
	@Excel(name = "开始积分", width = 15)
    @ApiModelProperty(value = "开始积分")
	private Integer startScore;
	/**结束积分*/
	@Excel(name = "结束积分", width = 15)
    @ApiModelProperty(value = "结束积分")
	private Integer endScore;
	/**折扣*/
	@Excel(name = "折扣", width = 15)
    @ApiModelProperty(value = "折扣")
	private Integer rebate;
	/**用户等级图标*/
	@Excel(name = "用户等级图标", width = 15)
    @ApiModelProperty(value = "用户等级图标")
	private String userrankImg;
	/** 删除标志 -1:删除 1:有效*/
	@Excel(name = " 删除标志 -1:删除 1:有效", width = 15)
    @ApiModelProperty(value = " 删除标志 -1:删除 1:有效")
	private Integer dataFlag;
	/**创建时间*/
	@Excel(name = "创建时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
	private Date createTime;
}
