package com.endeffects.exception;

public class BalanceNotSufficientException extends RuntimeException {
    public BalanceNotSufficientException(String balanceIsNotSufficient) {
        super(balanceIsNotSufficient);
    }
}
