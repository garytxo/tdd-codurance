package com.greyfinch.tdd.exercise_06;

import com.greyfinch.tdd.exercise_06.io.Console;
import com.greyfinch.tdd.exercise_06.repository.AccountInMemoryRepository;
import com.greyfinch.tdd.exercise_06.repository.AccountRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * Acceptance test
 */
@RunWith(MockitoJUnitRunner.class)
public class PrintAccountStatementFeature {

    @Mock
    private AccountRepository accountRepository;

    @Mock
    private Console console;

    @InjectMocks
    private AccountService accountService;

    @Before
    public void setup() {

        accountRepository = new AccountInMemoryRepository();

        accountService = new AccountService(accountRepository);
    }


    @Test
    public void print_user_statement_after_some_deposits_and_withdrawals() {


        accountService.deposit(100);
        accountService.withdraw(10);

        accountService.printStatement();

        Mockito.verify(console).print();

        assertThat(console.print(), is(equalTo("")));


    }


}
