package cn.irisz.ahelo.controller.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@Schema(name = "登录返回结果")
public class LoginResult {
    @Schema(description = "用户ID")
    private Integer id;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "角色")
    private List<String> roles;

    @Schema(description = "访问接口的Token")
    private String accessToken;

    @Schema(description = "过期时间")
    private Long expires;
}
