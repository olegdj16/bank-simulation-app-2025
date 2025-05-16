package com.endeffects.exception;

/**
 * Exception thrown when a requested record is not found.
 */
public class RecordNotFoundException extends RuntimeException {

  /**
   * Exception thrown when a requested record is not found.
   */
  public RecordNotFoundException(String message) {
    super(message);
  }
}
