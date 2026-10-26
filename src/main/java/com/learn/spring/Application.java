package com.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hi Welcome!!...");

       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


	   orderService Order = context.getBean(orderService.class);
	   Order.orderPlace();



	   System.out.println(context.getBeanDefinitionCount());

//	   paymentService payment = context.getBean(paymentService.class);
//	   payment.payPayment();
	}

}
