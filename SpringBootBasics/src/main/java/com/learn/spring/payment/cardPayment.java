package com.learn.spring.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier
public class cardPayment implements paymentService {

    @Override
    public void payPayment(){
        System.out.println("Pay via Card");
    }
}
