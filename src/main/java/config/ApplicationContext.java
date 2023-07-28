package config;

import mocks.Mock;
import mocks.PaymentHistoryMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import service.MockPaymentHistoryService;
import service.PaymentHistoryService;

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
