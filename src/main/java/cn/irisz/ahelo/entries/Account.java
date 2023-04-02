package cn.irisz.ahelo.entries;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户表
 * &#064;TableName  sys_account
 */
@TableName(value ="sys_account")
@Data
public class Account implements Serializable {
    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 前端显示名字
     */
    private String displayName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 是否管理员
     */
    private Integer isAdmin;

    /**
     * 用户是否激活
     */
    private Integer isActive;

    /**
     * 用户加入时间
     */
    private LocalDateTime dateJoined;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 上次登录时间
     */
    private LocalDateTime lastLogin;

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