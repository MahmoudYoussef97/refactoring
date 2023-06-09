package com.mahyoussef.bloaters.largeclass.example2;

import java.time.LocalDateTime;

public abstract class AbstractCardPaymentProcessorRefactored {

    protected String cardNumber;
    protected String cardHolder;
    protected int CVV;
    protected LocalDateTime expirationDate;

    abstract void processCardPayment();

}
