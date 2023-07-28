package com.example.creditcardoptimizer.models;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CreditUsage {
    private BigDecimal totalCreditLimit;
    private BigDecimal utilize;
    private BigDecimal remainingCreditBalance;
    private BigDecimal utilizeCreditPrecentage;
}
