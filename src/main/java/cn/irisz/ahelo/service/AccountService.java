package cn.irisz.ahelo.service;

import cn.irisz.ahelo.entries.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【sys_account(用户表)】的数据库操作Service
* @createDate 2023-03-05 20:44:19
*/
public interface AccountService extends IService<Account> {
    public Account login(String username, String password);
}
