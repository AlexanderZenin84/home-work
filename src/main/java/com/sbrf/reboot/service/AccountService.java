package com.sbrf.reboot.service;

import com.sbrf.reboot.classes.Account;
import com.sbrf.reboot.repository.AccountRepository;

import java.io.FileNotFoundException;
import java.util.Set;

public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean isAccountExist(long l, Account account) {
        Set<Account> accountSet = null;
        try {
            accountSet = accountRepository.getAllAccountsByClientId(l);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return accountSet.contains(account);
    }

    public boolean accountEmpty(long l) {
        Set<Account> accountSet = null;
        try {
            accountSet = accountRepository.getAllAccountsByClientId(l);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return accountSet.isEmpty();
    }
}
