package com.example.creditcardoptimizer.models;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class PaymentHistoryResponse {
    private List<PaymentTransaction> paymentTransactionList;

    public PaymentHistoryResponse() {
        this.paymentTransactionList = new ArrayList<>();
    }

    public List<PaymentTransaction> getPaymentTransactionList() {
        return paymentTransactionList;
    }

    public void addTransaction(PaymentTransaction paymentTransaction) {
        this.paymentTransactionList.add(paymentTransaction);
    }
}
