package com.example.creditcardoptimizer.mocks;

import com.example.creditcardoptimizer.models.CreditAccount;
import com.example.creditcardoptimizer.models.CreditUsage;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class CreditUsageMock implements Mock<CreditUsage> {


    @Override
    public CreditUsage generate() {
        Faker faker = new Faker();
        double totalCredit = faker.number().randomDouble(2,99999999,999999999);
        double utilize = faker.number().randomDouble(2,100000,99999999);
       double utilizeCreditPrecentage = (totalCredit/utilize)*100;
        return CreditUsage.builder()
                .totalCreditLimit(BigDecimal.valueOf(totalCredit))
                .utilize( BigDecimal.valueOf(utilize))
                .remainingCreditBalance( BigDecimal.valueOf(totalCredit-utilize))
                .utilizeCreditPrecentage(BigDecimal.valueOf(utilizeCreditPrecentage))
                .build();

    }
}
