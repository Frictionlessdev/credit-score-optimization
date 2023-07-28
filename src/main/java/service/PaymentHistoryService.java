package service;

import models.PaymentHistoryResponse;

public interface PaymentHistoryService {
    PaymentHistoryResponse getPaymentHistory(String uniqueId);
}
