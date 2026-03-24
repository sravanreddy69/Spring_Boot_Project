package com.codespace.EasyBasket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service("geminiModel")
public class Gemini implements AiServices {

    @Value("${EasyBasket.country}")
    private String country;

    @Value("${EasyBasket.isActive}")
    private boolean isActive;

    @Value("${EasyBasket.listOfValues}")
    private List<String> listOfValues;

    @Override
    public void work() {
        System.out.println("Processing with Gemini.");
        System.out.println("Country: " + country);
        System.out.println("Active: " + isActive);
    }
}
