package com.example.creditcardoptimizer.service;

import com.example.creditcardoptimizer.models.CreditAccountAgeResponse;

public interface CreditAccountAgeService {
    CreditAccountAgeResponse getCreditAccountAge(String accountId);
}
