package org.example;


import org.springframework.beans.factory.annotation.Qualifier;


public class TemporaryService {

    public TemporaryService(){
        System.out.println("Temporary Serivice Constructor!!");
    }


    public void start(){
        System.out.println("Call back fn between Consturctor & Method using init");
    }

    public void display(){
        System.out.println("Created using @Bean");
    }
}



