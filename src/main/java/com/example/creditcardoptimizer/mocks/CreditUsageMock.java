package com.example.creditcardoptimizer.mocks;

import com.example.creditcardoptimizer.models.CreditAccount;
import com.example.creditcardoptimizer.models.CreditUsage;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Slf4j
@Component
public class CreditUsageMock implements Mock<CreditUsage> {


    @Override
    public CreditUsage generate() {
        Faker faker = new Faker();

        double totalCredit = faker.number().numberBetween( 90000000,99999999);
        double utilizeCreditPercentage = faker.number().numberBetween( 25,60);
        double utilize = utilizeCreditPercentage*totalCredit/100;
       log.info(" totalCredit: {}, utilize: {}, utilizeCreditPrecentage : {} ", totalCredit, utilize, utilizeCreditPercentage);
        return CreditUsage.builder()
                .totalCreditLimit(BigDecimal.valueOf(totalCredit))
                .utilize( BigDecimal.valueOf(utilize))
                .remainingCreditBalance( BigDecimal.valueOf(totalCredit-utilize))
                .utilizeCreditPercentage(BigDecimal.valueOf(utilizeCreditPercentage))
                .build();
 }
}
