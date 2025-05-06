package com.endeffects.exception;

/**
 * Exception thrown when a service is under construction and cannot process requests.
 */
public class UnderConstructionException extends RuntimeException {

  /**
   * Constructs a new UnderConstructionException with the specified detail message.
   */
  public UnderConstructionException(String theServiceIsUnderConstruction) {
    super(theServiceIsUnderConstruction);
  }
}
