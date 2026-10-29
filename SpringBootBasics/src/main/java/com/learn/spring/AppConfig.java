package com.learn.spring;

import com.learn.spring.payment.CashPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.learn.spring")

public class AppConfig {

    @Bean
    @Qualifier("cash")
    CashPayment creatCashPayment(){
        return new CashPayment();
    }


}
