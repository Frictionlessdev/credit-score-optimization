package com.example.creditcardoptimizer.config;

import com.example.creditcardoptimizer.mocks.Mock;
import com.example.creditcardoptimizer.mocks.PaymentHistoryMock;
import com.example.creditcardoptimizer.service.MockPaymentHistoryService;
import com.example.creditcardoptimizer.service.PaymentHistoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {
    @Bean
    public Mock PaymentHistoryMock(){
        return new PaymentHistoryMock();
    }

    @Bean
    public PaymentHistoryService paymentHistoryService(PaymentHistoryMock paymentHistoryMock){
        return new MockPaymentHistoryService(paymentHistoryMock);
    }
}
