package com.endeffects.repository;

import com.endeffects.model.Transaction;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Repository class for managing transactions.
 * Provides methods to save and retrieve transaction data.
 */
@Component
public class TransactionRepository {

  public static List<Transaction> transactionList = new ArrayList<>();

  /**
   * Saves a transaction to the in-memory transaction list.
   */
  public Transaction save(Transaction transaction) {
    transactionList.add(transaction);
    return transaction;
  }

  /**
   * Retrieves all transactions from the in-memory transaction list.
   */
  public List<Transaction> findAll() {
    return transactionList;
  }
}
