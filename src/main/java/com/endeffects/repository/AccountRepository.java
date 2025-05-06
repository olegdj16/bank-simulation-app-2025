package com.endeffects.repository;

import com.endeffects.model.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class AccountRepository {

    public static List<Account> accountList = new ArrayList<>();

    public Account save(Account account) {
        accountList.add(account);
        return account;
    }


    public List<Account> findAll() {
        return accountList;
    }

    public void findById(UUID id) {

        //TASK
        //write a method, that find the account inside the list, if not
        //throws RecordNotFoundException

    }
}
