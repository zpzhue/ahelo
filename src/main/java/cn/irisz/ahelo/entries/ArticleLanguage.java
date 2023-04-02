package cn.irisz.ahelo.entries;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 文章开发语言类型表
 * @TableName blog_article_language
 */
@TableName(value ="blog_article_language")
@Data
public class ArticleLanguage implements Serializable {
    /**
     * 开发语言记录ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 文章开发语言类型
     */
    private String language;

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