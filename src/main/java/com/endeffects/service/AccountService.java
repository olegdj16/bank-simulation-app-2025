package com.endeffects.service;

import com.endeffects.enums.AccountType;
import com.endeffects.model.Account;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccountService {

    Account createNewAccount(BigDecimal balance,
                             Date creationDate,
                             AccountType accountType,
                             Long userId);

    List<Account> listAllAccount();

}
