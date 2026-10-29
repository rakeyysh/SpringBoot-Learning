package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderService  /*implements InitializingBean*/ {

    private PaymentService payment;
    private TemporaryService temp;

    //Constructor

    @Autowired
    public OrderService(PaymentService payment) {
        System.out.println("OrderService Constructor!!");
        this.payment= payment;
    }


//    public OrderService( TemporaryService Temp){
//        this.temp = Temp;
//    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//
//        System.out.println("Before any definition and just after object creation and dependency Injection");
//    }






  void OrderPlaced() {
//
       payment.pay();
//        temp.display();
       System.out.println("Order Placed");
   }


}
