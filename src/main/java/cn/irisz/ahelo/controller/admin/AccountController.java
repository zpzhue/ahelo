package cn.irisz.ahelo.controller.admin;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.irisz.ahelo.common.exception.BusinessException;
import cn.irisz.ahelo.common.result.R;
import cn.irisz.ahelo.common.result.ResponseCode;
import cn.irisz.ahelo.controller.admin.dto.LoginResult;
import cn.irisz.ahelo.controller.admin.dto.LoginSchema;
import cn.irisz.ahelo.entries.Account;
import cn.irisz.ahelo.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;

@RestController
@RequestMapping("/admin/account")
@Tag(name = "用户管理")
public class AccountController {

    @Resource
    AccountService accountService;

    @PostMapping("/login")
    @Operation(summary = "用户登录")
    public R<LoginResult> login(@Valid @NotEmpty @RequestBody LoginSchema loginSchema) {
        Account account = accountService.login(loginSchema.getUsername(), loginSchema.getPassword());
        if (account == null) {
            throw new BusinessException(ResponseCode.ClientError, "用户名或密码错误");
        }
        StpUtil.login(account.getId());
        SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
        ArrayList<String> roles = new ArrayList<>();
        roles.add("admin");
        LoginResult result = new LoginResult()
                .setId(account.getId())
                .setUsername(account.getUsername())
                .setRoles(roles)
                .setAccessToken(tokenInfo.tokenName + " " + tokenInfo.tokenValue)
                .setExpires(tokenInfo.tokenTimeout);
        return R.ok("登录成功", result);
    }
}
