package com.example.creditcardoptimizer.service;

import com.example.creditcardoptimizer.mocks.CreditAccountAgeMock;
import com.example.creditcardoptimizer.mocks.CreditUsageMock;
import com.example.creditcardoptimizer.models.CreditAccount;
import com.example.creditcardoptimizer.models.CreditAccountAgeResponse;
import com.example.creditcardoptimizer.models.CreditUsage;
import com.example.creditcardoptimizer.models.CreditUsageResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class MockCreditUsageService implements CreditUsageService{

    private CreditUsageMock creditUsageMock;

    public MockCreditUsageService(CreditUsageMock creditUsageMock) {
        this.creditUsageMock =creditUsageMock;
    }

    @Override
    public CreditUsageResponse getCreditUsageResponse(String accountId) {
        CreditUsage creditUsage = creditUsageMock.generate();
      return CreditUsageResponse.builder()
                .creditUsagePercentage(creditUsage.getUtilizeCreditPercentage())
              .build();
    }
}
