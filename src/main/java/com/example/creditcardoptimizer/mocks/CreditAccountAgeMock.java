package com.example.creditcardoptimizer.mocks;

import com.example.creditcardoptimizer.models.CreditAccount;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CreditAccountAgeMock implements Mock<CreditAccount> {

    @Override
    public CreditAccount generate() {
        Faker faker = new Faker();
        LocalDate date = LocalDate.of(faker.random().nextInt(2000,2020),faker.random().nextInt(1,12),faker.random().nextInt(1,28 ));
        return new CreditAccount(date);
    }
}
