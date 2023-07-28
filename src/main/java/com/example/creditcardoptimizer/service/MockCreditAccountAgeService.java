package com.example.creditcardoptimizer.service;

import com.example.creditcardoptimizer.mocks.CreditAccountAgeMock;
import com.example.creditcardoptimizer.models.CreditAccount;
import com.example.creditcardoptimizer.models.CreditAccountAgeResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MockCreditAccountAgeService implements CreditAccountAgeService{

    private CreditAccountAgeMock creditAccountAgeMock;

    @Override
    public CreditAccountAgeResponse getCreditAccountAge(String accountId) {
        CreditAccountAgeResponse creditAccountAgeResponse = new CreditAccountAgeResponse();
        CreditAccount creditAccount = creditAccountAgeMock.generate();
        creditAccountAgeResponse.setCreditAccountAge(String.valueOf(creditAccount.getAccountAgeInYears()));
        return creditAccountAgeResponse;
    }
}
