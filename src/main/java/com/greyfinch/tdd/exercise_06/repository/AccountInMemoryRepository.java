package com.greyfinch.tdd.exercise_06.repository;

import com.greyfinch.tdd.exercise_06.domain.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AccountInMemoryRepository implements AccountRepository {

    public List<Transaction> transactions = new ArrayList();

    @Override
    public List<Transaction> findAll() {
        return transactions;
    }

    @Override
    public void save(Transaction transaction) {

        transactions.add(transaction);

    }
}
