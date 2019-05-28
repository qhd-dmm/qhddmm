package org.jeecg.modules.dmm.dmmUser.entity;

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
 * @Description: 会员表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Data
@TableName("dmm_user")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="dmm_user对象", description="会员表")
public class DmmUser {
    
	/**主键*/
	@TableId(type = IdType.UUID)
    @ApiModelProperty(value = "主键")
	private String id;
	/**登陆名*/
	@Excel(name = "登陆名", width = 15)
    @ApiModelProperty(value = "登陆名")
	private String loginName;
	/**密码*/
	@Excel(name = "密码", width = 15)
    @ApiModelProperty(value = "密码")
	private String loginPwd;
	/**0保密  1男 2女*/
	@Excel(name = "0保密  1男 2女", width = 15)
    @ApiModelProperty(value = "0保密  1男 2女")
	private Integer userSex;
	/**昵称*/
	@Excel(name = "昵称", width = 15)
    @ApiModelProperty(value = "昵称")
	private String nickName;
	/**真实姓名*/
	@Excel(name = "真实姓名", width = 15)
    @ApiModelProperty(value = "真实姓名")
	private String trueName;
	/**出生日期*/
	@Excel(name = "出生日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "出生日期")
	private Date brithday;
	/**用户头像地址*/
	@Excel(name = "用户头像地址", width = 15)
    @ApiModelProperty(value = "用户头像地址")
	private String userPhoto;
	/**用户手机*/
	@Excel(name = "用户手机", width = 15)
    @ApiModelProperty(value = "用户手机")
	private String userPhone;
	/**用户积分*/
	@Excel(name = "用户积分", width = 15)
    @ApiModelProperty(value = "用户积分")
	private Integer userScore;
	/**用户剩余积分*/
	@Excel(name = "用户剩余积分", width = 15)
    @ApiModelProperty(value = "用户剩余积分")
	private Integer userSurplusScore;
	/**用户编号*/
	@Excel(name = "用户编号", width = 15)
    @ApiModelProperty(value = "用户编号")
	private String userCode;
	/**收入水平(1:0-2000    2:2000-5000   3:5000-1w   4:1w+)*/
	@Excel(name = "收入水平(1:0-2000    2:2000-5000   3:5000-1w   4:1w+)", width = 15)
    @ApiModelProperty(value = "收入水平(1:0-2000    2:2000-5000   3:5000-1w   4:1w+)")
	private Integer income;
	/**职业 1.学生 2白领 3个体*/
	@Excel(name = "职业 1.学生 2白领 3个体", width = 15)
    @ApiModelProperty(value = "职业 1.学生 2白领 3个体")
	private Integer profession;
	/**推荐人id*/
	@Excel(name = "推荐人id", width = 15)
    @ApiModelProperty(value = "推荐人id")
	private String refereeUser;
	/**会员等级id*/
	@Excel(name = "会员等级id", width = 15)
    @ApiModelProperty(value = "会员等级id")
	private String rankId;
	/**用户账号状态 0:停用 1:启用*/
	@Excel(name = "用户账号状态 0:停用 1:启用", width = 15)
    @ApiModelProperty(value = "用户账号状态 0:停用 1:启用")
	private Integer userStatus;
	/**	-1:删除 1:有效*/
	@Excel(name = "	-1:删除 1:有效", width = 15)
    @ApiModelProperty(value = "	-1:删除 1:有效")
	private Integer dataFlag;
	/**创建时间*/
	@Excel(name = "创建时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
	private Date createTime;
}
