package com.learn.spring.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rak")
public class UPIPayment implements paymentService {

    @Override
    public void payPayment() {
        System.out.println("Pay via UPI..");
    }
}
