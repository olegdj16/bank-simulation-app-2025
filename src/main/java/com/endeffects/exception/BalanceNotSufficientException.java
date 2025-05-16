package com.endeffects.exception;

/**
 * Exception thrown when an account does not have sufficient balance to complete a transaction.
 */
public class BalanceNotSufficientException extends RuntimeException {

  /**
   * Constructs a new BalanceNotSufficientException with the specified detail message.
   *
   * @param balanceIsNotSufficient the detail message explaining the reason for the exception
   */
  public BalanceNotSufficientException(String balanceIsNotSufficient) {
    super(balanceIsNotSufficient);
  }
}
