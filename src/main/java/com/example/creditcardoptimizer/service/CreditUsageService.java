package com.example.creditcardoptimizer.service;

import com.example.creditcardoptimizer.models.CreditAccountAgeResponse;
import com.example.creditcardoptimizer.models.CreditUsageResponse;

public interface CreditUsageService {
    CreditUsageResponse  getCreditUsageResponse(String accountId);
}
