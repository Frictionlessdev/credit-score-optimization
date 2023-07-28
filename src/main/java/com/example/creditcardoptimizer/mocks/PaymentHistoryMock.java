package com.example.creditcardoptimizer.mocks;

import com.example.creditcardoptimizer.models.PaymentTransaction;
import com.github.javafaker.Faker;
import java.util.concurrent.TimeUnit;

public class PaymentHistoryMock implements Mock<PaymentTransaction> {


    @Override
    public PaymentTransaction generate() {
        Faker faker = new Faker();
        PaymentTransaction payment = new PaymentTransaction();

        payment.setPaymentId(faker.number().digits(8));
        payment.setPaymentDate(faker.date().past(30, TimeUnit.DAYS).toString()); // Get a date from the last 30 days
        payment.setAmount(faker.number().randomDouble(2, 10, 1000));
        payment.setPaymentMethod(faker.options().option("Credit Card", "PayPal", "Bank Transfer"));

        return payment;
    }
}
