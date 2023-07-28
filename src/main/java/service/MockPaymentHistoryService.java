package service;

import mocks.PaymentHistoryMock;
import models.PaymentHistoryResponse;

public class MockPaymentHistoryService implements PaymentHistoryService{
    private PaymentHistoryMock paymentHistoryMock;
    private final int NO_OF_PAYMENTS = 10;

    public MockPaymentHistoryService(PaymentHistoryMock paymentHistoryMock) {
        this.paymentHistoryMock = paymentHistoryMock;
    }

    @Override
    public PaymentHistoryResponse getPaymentHistory(String uniqueId) {
        PaymentHistoryResponse paymentHistoryResponse = new PaymentHistoryResponse();
        for (int i = 0; i < NO_OF_PAYMENTS; i++){
            paymentHistoryResponse.addTransaction(paymentHistoryMock.generate());
        }
        return paymentHistoryResponse;
    }
}
