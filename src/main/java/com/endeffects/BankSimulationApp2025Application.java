package com.endeffects;

import com.endeffects.enums.AccountType;
import com.endeffects.model.Account;
import com.endeffects.service.AccountService;
import com.endeffects.service.TransactionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class BankSimulationApp2025Application {

  public static void main(String[] args) {

    ApplicationContext container =
          SpringApplication.run(BankSimulationApp2025Application.class, args);

//    // get account and transaction service bean
//    AccountService accountService = container.getBean(AccountService.class);
//    TransactionService transactionService = container.getBean(TransactionService.class);
//
//    Account sender = accountService.createNewAccount(BigDecimal.valueOf(70), new Date(), AccountType.CHECKING, 1L);
//
//    Account receiver = accountService.createNewAccount(BigDecimal.valueOf(50), new Date(), AccountType.CHECKING, 2L);
////    Account receiver = null;
//
//    accountService.listAllAccount().forEach(System.out::println);
//
//    transactionService.makeTransfer(sender, receiver, BigDecimal.valueOf(400), new Date(), "Test transfer 1");
//
//    System.out.println(transactionService.findAllTransaction().get(0));
//
//    accountService.listAllAccount().forEach(System.out::println);

  }
}
