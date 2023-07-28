package com.example.creditcardoptimizer.service;

import com.example.creditcardoptimizer.models.PaymentTransaction;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PaymentAnalyzerService {

    public List<String> analyse(List<PaymentTransaction> transactions){
        List<String> list = new ArrayList<>();
        for(PaymentTransaction transaction : transactions){
            if(!Objects.isNull(transaction.getPaymentDescription()) && StringUtils.isNotEmpty(transaction.getPaymentDescription())){
                if(transaction.getPaymentDescription().contains("late")){
                    list.add("Transaction done on " + transaction.getPaymentDate() + " with payment id " +transaction.getPaymentId());
                }
            }
        }
        return list;
    }

    public List<String> analyze(List<PaymentTransaction> transactions) {
        Predicate<PaymentTransaction> emptyCheck = tx -> !Objects.isNull(tx.getPaymentDescription()) && StringUtils.isNotEmpty(tx.getPaymentDescription());
        Predicate<PaymentTransaction> containingLate = tx -> tx.getPaymentDescription().contains("late");
        return transactions.stream().filter(emptyCheck).filter(containingLate).map(this::generateMessage)
                .collect(Collectors.toList());
    }

    private String generateMessage(PaymentTransaction transaction) {
        return "Transaction done on " + transaction.getPaymentDate() + " with payment id " + transaction.getPaymentId();
    }

}
