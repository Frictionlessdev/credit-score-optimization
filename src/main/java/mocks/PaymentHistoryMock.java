package mocks;

import com.github.javafaker.Faker;
import models.Payment;

import java.util.concurrent.TimeUnit;

public class PaymentHistoryMock implements Mock{


    @Override
    public Object generate() {
        Faker faker = new Faker();
        Payment payment = new Payment();

        payment.setPaymentId(faker.number().digits(8));
        payment.setPaymentDate(faker.date().past(30, TimeUnit.DAYS).toString()); // Get a date from the last 30 days
        payment.setAmount(faker.number().randomDouble(2, 10, 1000));
        payment.setPaymentMethod(faker.options().option("Credit Card", "PayPal", "Bank Transfer"));

        return payment;
    }
}
