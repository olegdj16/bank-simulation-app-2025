package com.endeffects.service;

import com.endeffects.model.Account;
import com.endeffects.model.Transaction;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Service interface for handling transactions.
 */
public interface TransactionService {

  /**
   * Initiates a transfer between two accounts.
   */
  Transaction makeTransfer(
            Account sender,
            Account receiver,
            BigDecimal amount,
            Date creationDate,
            String message
    );

  /**
   * Initiates a transfer between two accounts.
   *
   * @return the transaction service instance
   */
  List<Transaction> findAllTransaction();

}
