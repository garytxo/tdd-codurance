package com.greyfinch.tdd.exercise_04;

import com.greyfinch.tdd.exercise_04.entities.PaymentDetails;
import com.greyfinch.tdd.exercise_04.entities.User;
import com.greyfinch.tdd.exercise_04.exceptions.InvaldUserException;
import com.greyfinch.tdd.exercise_04.payments.PaymentGateway;
import com.greyfinch.tdd.exercise_04.validation.UserValidatorService;

public class GFPaymentService {

    private UserValidatorService userValidatorService;

    private PaymentGateway paymentGateway;

    public GFPaymentService(UserValidatorService userValidatorService, PaymentGateway paymentGateway) {
        this.userValidatorService = userValidatorService;
        this.paymentGateway = paymentGateway;
    }


    public void processPayment(User user, PaymentDetails paymentDetails) throws InvaldUserException {

        if (userValidatorService.isValid(user)) {
            paymentGateway.process(paymentDetails);

        }

        throw new InvaldUserException();
    }


}
