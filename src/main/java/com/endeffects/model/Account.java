package com.endeffects.model;

import com.endeffects.enums.AccountType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

/**
 * Represents a user account with financial details.
 */
@Data
@Builder
public class Account {

  private UUID id;
  private BigDecimal balance;
  private AccountType accountType;
  private Date creationDate;
  private Long userId;

}
