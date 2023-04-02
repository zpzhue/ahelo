package cn.irisz.ahelo.controller.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@Schema(description = "登录接口参数")
public class LoginSchema {
    @NotEmpty
    @Schema(description = "用户名")
    private String username;

    @NotEmpty
    @Schema(description = "密码")
    private String password;
}
