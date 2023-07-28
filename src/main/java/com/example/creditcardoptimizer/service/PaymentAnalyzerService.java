package com.example.creditcardoptimizer.service;

import com.example.creditcardoptimizer.models.PaymentTransaction;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

}
