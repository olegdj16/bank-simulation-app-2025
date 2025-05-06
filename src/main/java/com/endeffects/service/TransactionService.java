package com.endeffects.service;

import com.endeffects.model.Account;
import com.endeffects.model.Transaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface TransactionService {

    TransactionService makeTransfer(
            Account sender,
            Account receiver,
            BigDecimal amount,
            Date creationDate,
            String message
    );

    List<Transaction> findAllTransaction();
}
