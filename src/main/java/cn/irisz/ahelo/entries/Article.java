package cn.irisz.ahelo.entries;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 博客文章表
 * @TableName blog_article
 */
@TableName(value ="blog_article")
@Data
public class Article implements Serializable {
    /**
     * 文章ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 阅读量
     */
    private Long readCount;

    /**
     * 文章状态
     */
    private Integer status;

    /**
     * 文章作者ID
     */
    private Integer authorId;

    /**
     * 文章分类ID
     */
    private Integer categoryId;

    /**
     * 文章所属开发语言
     */
    private Integer languageId;

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