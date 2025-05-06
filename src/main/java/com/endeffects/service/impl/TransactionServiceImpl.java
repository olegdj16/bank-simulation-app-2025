package com.endeffects.service.impl;

import com.endeffects.enums.AccountType;
import com.endeffects.exception.AccountOwnerShipException;
import com.endeffects.exception.BadRequestException;
import com.endeffects.exception.BalanceNotSufficientException;
import com.endeffects.model.Account;
import com.endeffects.model.Transaction;
import com.endeffects.repository.AccountRepository;
import com.endeffects.service.TransactionService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;
@Component
public class TransactionServiceImpl implements TransactionService {

    private final AccountRepository accountRepository;

    public TransactionServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public TransactionService makeTransfer(Account sender,
                                           Account receiver,
                                           BigDecimal amount,
                                           Date creationDate,
                                           String message) {

        /*
        -if sender or receiver is null ?
        -if sender and receiver is the same account ?
        -if sender has enough balance ?
        -if both accounts are checking, if not, one of them saving, it needs to be same userId
        */

        validateAccount(sender, receiver);
        checkAccountOwnership(sender, receiver);
        executeBalanceAndUpdateIfRequired(amount, sender, receiver);

        return null;
    }

    private void executeBalanceAndUpdateIfRequired(BigDecimal amount, Account sender, Account receiver) {
        if (checkSenderBalance(sender, amount)){
            // make balance transfer between sender and receiver
            sender.setBalance(sender.getBalance().subtract(amount));
            receiver.setBalance(receiver.getBalance().add(amount));
       } else {
            // throw BalanceNotSufficientException
            throw new BalanceNotSufficientException("Balance is not sufficient");
        }

    }

    private boolean checkSenderBalance(Account sender, BigDecimal amount) {
        // verify sender has enough balance to send
        return sender.getBalance().subtract(amount).compareTo(BigDecimal.ZERO) >= 0;
    }

    private void checkAccountOwnership(Account sender, Account receiver) {

        /*
        write an if statement that checks if one of the accounts is saving,
        and user sender or receiver us nit the same, throw AccountOwnerShipException
         */
        if(sender.getAccountType().equals(AccountType.SAVINGS)
                || receiver.getAccountType().equals(AccountType.SAVINGS)
                && !sender.getUserId().equals(receiver.getUserId())) {
            throw new AccountOwnerShipException("Since you are using a savings account, "
                                              + "the sender and receiver userId must be same");
        }
    }

    private void validateAccount(Account sender, Account receiver) {
        /*
        -if any of the account is null
        -if account ids are the same (same account)
        -if the accounts exist in the database (repository)
        */

        if(sender == null || receiver == null) {
            throw new BadRequestException("Sender and Receiver are required");
        }

        if(sender.getId().equals(receiver.getId())) {
            throw new BadRequestException("Sender account needs to be different than receiver account");
        }

        // verify if we have sender and receiver in the database
        findAccountById(sender.getId());
        findAccountById(receiver.getId());

    }

    private void findAccountById(UUID id) {
        accountRepository.findById(id);
    }

    @Override
    public List<Transaction> findAllTransaction() {
        return List.of();
    }
}
