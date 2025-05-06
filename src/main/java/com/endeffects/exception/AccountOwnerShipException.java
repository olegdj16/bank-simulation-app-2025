package com.endeffects.exception;

/**
 * Exception thrown when there is an issue with account ownership validation.
 */
public class AccountOwnerShipException extends RuntimeException {

  /**
   * Constructs a new AccountOwnerShipException with the specified detail message.
   */
  public AccountOwnerShipException(String message) {
    super(message);
  }
}
