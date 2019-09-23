package com.greyfinch.tdd.exercise_06.repository;

import com.greyfinch.tdd.exercise_06.domain.Transaction;

import java.util.List;

public interface AccountRepository {


    List<Transaction> findAll();

    void save(Transaction transaction);
}
