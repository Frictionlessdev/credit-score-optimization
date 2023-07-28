package config;

import mocks.Mock;
import mocks.PaymentHistoryMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {
    @Bean
    public Mock PaymentHistory(){
        return new PaymentHistoryMock();
    }
}
