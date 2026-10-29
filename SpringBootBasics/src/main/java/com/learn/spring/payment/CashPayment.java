package com.learn.spring.payment;

public class CashPayment implements  paymentService{
    @Override
    public void payPayment(){
        System.out.println("Pay via Cash");
    }
}
