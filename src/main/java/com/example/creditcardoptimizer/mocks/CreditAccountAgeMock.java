package com.example.creditcardoptimizer.mocks;

import com.github.javafaker.Faker;
import models.CreditAccount;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class CreditAccountAgeMock implements Mock<CreditAccount> {

    @Override
    public CreditAccount generate() {
        Faker faker = new Faker();
        LocalDate date = LocalDate.of(faker.random().nextInt(2000,2020),faker.random().nextInt(1,12),faker.random().nextInt(1,31 ));
        CreditAccount creditAccount = new CreditAccount(date);
        return creditAccount;
    }
}
