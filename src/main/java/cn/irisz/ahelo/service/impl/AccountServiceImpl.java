package cn.irisz.ahelo.service.impl;

import cn.irisz.ahelo.entries.Account;
import cn.irisz.ahelo.mapper.AccountMapper;
import cn.irisz.ahelo.service.AccountService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account login(String username, String password) {
        Account account = accountMapper.selectOne(new LambdaQueryWrapper<Account>().eq(Account::getUsername, username));
        if (account == null || !password.equals(account.getPassword())) {
            return null;
        }
        return account;
    }
}
