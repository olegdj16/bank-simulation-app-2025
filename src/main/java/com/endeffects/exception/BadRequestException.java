package com.endeffects.exception;

/**
 * Exception thrown when a bad request is made.
 */
public class BadRequestException extends RuntimeException {

  /**
   * Constructs a new BadRequestException with the specified detail message.
   */
  public BadRequestException(String message) {
    super(message);
  }
}
