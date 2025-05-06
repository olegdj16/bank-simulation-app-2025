package com.endeffects.service.impl;

import com.endeffects.exception.BadRequestException;
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

        return null;
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
