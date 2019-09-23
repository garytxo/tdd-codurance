package com.greyfinch.tdd.exercise_06;

import com.greyfinch.tdd.exercise_06.domain.Transaction;
import com.greyfinch.tdd.exercise_06.repository.AccountInMemoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceShould {

    @Mock
    AccountInMemoryRepository accountRepository;

    @InjectMocks
    AccountService accountService;


    @Test
    public void record_deposit_transaction() {

        Transaction expected = new Transaction(LocalDate.now(), 100, Transaction.Type.DEPOSIT);

        accountService.deposit(100);

        Mockito.verify(accountRepository).save(expected);
    }

    @Test
    public void record_withdraw_transaction() {


        Transaction expected = new Transaction(LocalDate.now(), 100, Transaction.Type.WITHDRAWAL);

        accountService.withdraw(100);

        Mockito.verify(accountRepository).save(expected);

    }

    @Test
    public void read_all_transactions_before_printing() {

        Transaction expected = new Transaction(LocalDate.now(), 100, Transaction.Type.WITHDRAWAL);
        Transaction expected2 = new Transaction(LocalDate.now(), 100, Transaction.Type.DEPOSIT);

        accountService.withdraw(100);
        accountService.deposit(100);

        accountService.printStatement();


        Mockito.verify(accountRepository).save(expected);
        Mockito.verify(accountRepository).save(expected2);

        Mockito.verify(accountRepository).findAll();
    }
}

