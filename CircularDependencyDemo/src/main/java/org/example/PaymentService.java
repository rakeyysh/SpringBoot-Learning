package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class PaymentService  {


    public PaymentService(){
        System.out.println("Constructor Started!!");
    }

    @PostConstruct
    public void startusingPostConstruct(){
        System.out.println("Callback fn betweeen method and spring creation using PostConstruct");
    }

    public void pay(){
        System.out.println("Payment Done Successfully");


    }

    public void start(){
        System.out.println("Call back fn between Consturctor & Method using init");
    }


//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Bean is Getting destroyed using Disposable Bean");
//    }

//    public void stop(){
//        System.out.println("Bean is Getting destroyed using Destroy Method");
//    }
@PreDestroy
    public void stop(){
        System.out.println("Bean is Getting destroyed using @PreDestory Annotations");
    }


}
