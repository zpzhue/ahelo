package cn.irisz.ahelo.entries;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 博客标签表
 * @TableName blog_tag
 */
@TableName(value ="blog_tag")
@Data
public class Tag implements Serializable {
    /**
     * 文章标签ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 文章标签值
     */
    private String name;

    /**
     * 文章标签名称
     */
    private String displayName;

    /**
     * 文章标签颜色
     */
    private String color;

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