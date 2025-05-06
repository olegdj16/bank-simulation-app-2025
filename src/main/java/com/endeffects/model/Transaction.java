package com.endeffects.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

/**
 * Represents a financial transaction between two accounts.
 */
@Data
@Builder
public class Transaction {

  private UUID sender;
  private UUID receiver;
  private BigDecimal amount;
  private String message;
  private Date creationDate;
}
