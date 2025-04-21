package com.endeffects.service.impl;

import com.endeffects.enums.AccountType;
import com.endeffects.model.Account;
import com.endeffects.repository.AccountRepository;
import com.endeffects.service.AccountService;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class AccountServiceImpl implements AccountService {

    AccountRepository accountRepository;

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
        return accountRepository.save(account);
    }

    @Override
    public List<Account> listAllAccount() {
        return List.of();
    }
}
