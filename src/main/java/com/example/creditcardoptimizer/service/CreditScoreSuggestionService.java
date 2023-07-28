package com.example.creditcardoptimizer.service;

import com.example.creditcardoptimizer.models.CreditScoreSuggestionResponse;

import java.util.List;

public interface CreditScoreSuggestionService {
    public CreditScoreSuggestionResponse suggestion(String accountId);
}
