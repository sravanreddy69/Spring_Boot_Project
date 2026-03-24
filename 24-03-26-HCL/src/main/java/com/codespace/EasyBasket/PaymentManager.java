package com.codespace.EasyBasket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentManager {
    private final PaymentService paymentService;

    @Autowired
    public PaymentManager(@Qualifier("netBankingPayment") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processPayment() {
        paymentService.pay();
    }
}
