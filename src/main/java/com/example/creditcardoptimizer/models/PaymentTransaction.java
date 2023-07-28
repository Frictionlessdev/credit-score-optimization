package com.example.creditcardoptimizer.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PaymentTransaction {

    private String paymentId;
    private String paymentDate;
    private double amount;
    private String paymentMethod;
    private String paymentDescription;
}
