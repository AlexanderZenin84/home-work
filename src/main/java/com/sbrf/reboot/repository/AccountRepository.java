package com.sbrf.reboot.repository;

import com.sbrf.reboot.classes.Account;

import java.io.FileNotFoundException;
import java.util.Set;

public interface AccountRepository {
    Set<Account> getAllAccountsByClientId(long l) throws FileNotFoundException;
}
