package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("org.example")

public class AppConfig {

// @Bean(initMethod = "start", destroyMethod = "stop")
//    PaymentService getPayment(){
//      return new PaymentService();
//  }

//   @Bean
//    PaymentService getPayment(){
//       return new PaymentService();
//   }


//   @Bean
//    OrderService getOrder(){
//       return new OrderService(getPayment());
//   }


//   @Bean
//    PaymentService getPayment(){
//       return new PaymentService();
//   }
}
