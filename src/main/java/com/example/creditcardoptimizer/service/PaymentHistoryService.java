package com.example.creditcardoptimizer.service;

import com.example.creditcardoptimizer.models.PaymentHistoryResponse;

public interface PaymentHistoryService {
    PaymentHistoryResponse getPaymentHistory(String uniqueId);
}
