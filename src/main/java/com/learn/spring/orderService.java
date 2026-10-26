package com.learn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.learn.spring.payment.paymentService;

@Component
public class orderService {


    public final paymentService payment;


    @Autowired
     public  orderService(@Qualifier("cash") paymentService pay){
        this.payment = pay;
     }


    public  void orderPlace(){
         payment.payPayment();
         System.out.println("Order Placed!!");
     }

}
