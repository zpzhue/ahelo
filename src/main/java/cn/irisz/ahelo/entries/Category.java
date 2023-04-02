package cn.irisz.ahelo.entries;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 博客分类表
 * @TableName blog_category
 */
@TableName(value ="blog_category")
@Accessors(chain = true)
@Data
public class Category implements Serializable {
    /**
     * 文章分类ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 分类值
     */
    private String name;

    /**
     * 分类名称
     */
    private String displayName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 是否逻辑删除
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}