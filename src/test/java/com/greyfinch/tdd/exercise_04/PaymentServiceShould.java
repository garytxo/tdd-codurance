package com.greyfinch.tdd.exercise_04;

import com.greyfinch.tdd.exercise_04.entities.PaymentDetails;
import com.greyfinch.tdd.exercise_04.entities.User;
import com.greyfinch.tdd.exercise_04.exceptions.InvaldUserException;
import com.greyfinch.tdd.exercise_04.payments.PaymentGateway;
import com.greyfinch.tdd.exercise_04.validation.UserValidatorService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PaymentServiceShould {

    public static final int ONCE = 1;
    @Mock
    private UserValidatorService userValidatorService;
    @Mock
    private PaymentGateway paymentGateway;

    private GFPaymentService paymentService;

    private static final User VALID_USER = new User();
    private static final User INVALID_USER = new User();

    private static final PaymentDetails PAYMENT_DETAILS = new PaymentDetails();

    @Before
    public void setup() {

        paymentService = new GFPaymentService(userValidatorService, paymentGateway);



    }

    @Test(expected = InvaldUserException.class)
    public void throw_an_exception_if_invalid_user() throws InvaldUserException {

        Mockito.when(userValidatorService.isValid(INVALID_USER)).thenReturn(false);

        paymentService.processPayment(INVALID_USER, PAYMENT_DETAILS);


    }

    @Test
    public void processes_payment_when_user_is_valid() throws InvaldUserException{

        Mockito.when(userValidatorService.isValid(VALID_USER)).thenReturn(true);

        paymentService.processPayment(VALID_USER, PAYMENT_DETAILS);


        InOrder inOrder = Mockito.inOrder(userValidatorService, paymentGateway);

        inOrder.verify(userValidatorService, Mockito.times(ONCE)).isValid(VALID_USER);

        inOrder.verify(paymentGateway, Mockito.times(ONCE)).process(PAYMENT_DETAILS);
    }

    /*
    @Test
    public void not_invoke_payment_gateway_when_user_invalid(){

        Mockito.when(userValidatorService.isValid(INVALID_USER)).thenReturn(false);

        assertThatExceptionOfType(InvaldUserException.class)
                .isThrownBy(()->
                        paymentService.processPayment(INVALID_USER,PAYMENT_DETAILS)
                );

        verifyZeroInteractions(paymentGateway);
    }
    */
}
