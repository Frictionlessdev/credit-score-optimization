package com.example.creditcardoptimizer.service;

import com.example.creditcardoptimizer.models.CreditScoreSuggestionResponse;
import com.example.creditcardoptimizer.models.CreditUsageResponse;
import com.example.creditcardoptimizer.models.PaymentHistoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockCreditScoreSuggestionService implements CreditScoreSuggestionService {
    @Autowired
    private CreditUsageService creditUsageService;

    @Autowired
    private PaymentAnalyzerService paymentAnalyzerService;
    @Autowired
    private PaymentHistoryService paymentHistoryService;
    @Autowired
    private CreditAccountAgeService creditAccountAgeService;
    @Override
    public CreditScoreSuggestionResponse suggestion(String accountId) {
        CreditUsageResponse creditUsageResponse = creditUsageService.getCreditUsageResponse(accountId);
        String creditUsageMessage = paymentAnalyzerService.analyseCreditUsage(creditUsageResponse.getCreditUsage());
        List<String> suggestions = new ArrayList<>();
        suggestions.add(creditUsageMessage);



        PaymentHistoryResponse paymentHistoryResponse = paymentHistoryService.getPaymentHistory(accountId);
        List<String> historyMessage = paymentAnalyzerService.analyse(paymentHistoryResponse.getPaymentTransactionList());
        suggestions.addAll(historyMessage);
        suggestions.add("Your credit account is active from "+ creditAccountAgeService.getCreditAccountAge(accountId).getCreditAccountAge()+ " Years");
        return CreditScoreSuggestionResponse.builder().suggestions(suggestions).build();
    }
}
