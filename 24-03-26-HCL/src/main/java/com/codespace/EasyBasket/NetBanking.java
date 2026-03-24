package com.codespace.EasyBasket;

import org.springframework.stereotype.Service;

@Service("netBankingPayment")
public class NetBanking implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Processing net banking payment.");
    }
}
