package com.codespace.EasyBasket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EasyBasketApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EasyBasketApplication.class, args);
        
        ResponseGenerator rg = context.getBean(ResponseGenerator.class);
        rg.work();
        
        PaymentManager pm = context.getBean(PaymentManager.class);
        pm.processPayment();
    }
}
