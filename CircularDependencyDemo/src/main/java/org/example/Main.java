package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        OrderService Order = context.getBean(OrderService.class);

//        OrderService Order2 = context.getBean(OrderService.class);
//        PaymentService payment = context.getBean(PaymentService.class);
//
//        TemporaryService Temp = context.getBean(TemporaryService.class);
        Order.OrderPlaced();

//        payment.pay();

       // System.out.println(Order == Order2);

        context.close();


    }
}