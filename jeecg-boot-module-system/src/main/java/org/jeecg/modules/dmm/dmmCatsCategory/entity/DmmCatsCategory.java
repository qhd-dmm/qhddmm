package org.jeecg.modules.dmm.dmmCatsCategory.entity;

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
 * @Description: 猫咪分类表
 * @Author: jeecg-boot
 * @Date:   2019-05-27
 * @Version: V1.0
 */
@Data
@TableName("dmm_cats_category")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="dmm_cats_category对象", description="猫咪分类表")
public class DmmCatsCategory {
    
	/**主键*/
	@TableId(type = IdType.UUID)
    @ApiModelProperty(value = "主键")
	private String id;
	/**父级分类id*/
	@Excel(name = "父级分类id", width = 15)
    @ApiModelProperty(value = "父级分类id")
	private Integer parentId;
	/**分类名称*/
	@Excel(name = "分类名称", width = 15)
    @ApiModelProperty(value = "分类名称")
	private String catName;
	/**分类排序号*/
	@Excel(name = "分类排序号", width = 15)
    @ApiModelProperty(value = "分类排序号")
	private Integer catSort;
	/**删除标识*/
	@Excel(name = "删除标识", width = 15,dicCode="data_status")
	@Dict(dicCode = "data_status")
    @ApiModelProperty(value = "删除标识   -1删除   1未删除")
	private Integer dataStatus;
	/**显示状态*/
	@Excel(name = "显示状态", width = 15,dicCode="is_show")
	@Dict(dicCode = "is_show")
    @ApiModelProperty(value = " 0隐藏 1显示")
	private Integer isShow;
	/**分类描述*/
	@Excel(name = "分类描述", width = 15)
    @ApiModelProperty(value = "分类描述")
	private String description;
	/**创建时间*/
	@Excel(name = "创建时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
	private Date createTime;
}
