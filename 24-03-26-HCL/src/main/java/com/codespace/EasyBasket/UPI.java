package com.codespace.EasyBasket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service("upiPayment")
public class UPI implements PaymentService {

    @Value("${EasyBasket.merchantId}")
    private String merchantId;

    @Value("${EasyBasket.isPaymentActive}")
    private boolean isActive;

    @Value("${EasyBasket.supportedUpiApps}")
    private List<String> supportedApps;

    @Override
    public void pay() {
        System.out.println("Processing UPI payment.");
        System.out.println("Merchant ID: " + merchantId);
        System.out.println("Payment Active: " + isActive);
    }
}
