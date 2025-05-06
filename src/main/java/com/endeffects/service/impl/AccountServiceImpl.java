package com.endeffects.service.impl;

import com.endeffects.enums.AccountType;
import com.endeffects.model.Account;
import com.endeffects.repository.AccountRepository;
import com.endeffects.service.AccountService;
import lombok.extern.apachecommons.CommonsLog;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@CommonsLog
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account createNewAccount(BigDecimal balance,
                                    Date creationDate,
                                    AccountType accountType,
                                    Long userId) {
        // here, we need to create a new Account object
        Account account = Account.builder()
                .id(UUID.randomUUID())
                .userId(userId)
                .balance(balance)
                .accountType(accountType)
                .creationDate(creationDate)
                .build();

        // and save it to the database
        // then, return the object created
        // 2023 03 01 19 09 40 777
        return accountRepository.save(account);
    }

    @Override
    public List<Account> listAllAccount() {
        return accountRepository.findAll();
    }
}
