package com.codespace.EasyBasket;

import org.springframework.stereotype.Service;

@Service("cardsPayment")
public class Cards implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Processing card payment.");
    }
}
