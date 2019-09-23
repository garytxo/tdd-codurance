package com.greyfinch.tdd.exercise_06;

import com.greyfinch.tdd.exercise_06.domain.Transaction;
import com.greyfinch.tdd.exercise_06.repository.AccountRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void deposit(int amount) {
        Transaction transaction = new Transaction(LocalDate.now(),amount,Transaction.Type.DEPOSIT);
        accountRepository.save(transaction);
    }

    public void withdraw(int amount) {

        Transaction transaction = new Transaction(LocalDate.now(),amount,Transaction.Type.WITHDRAWAL);
        accountRepository.save(transaction);
    }

    public void printStatement() {

       List<Transaction> transactions = accountRepository.findAll();
    }


}
