package com.codespace.EasyBasket;

import org.springframework.stereotype.Service;

@Service("chatgptModel")
public class ChatGPT implements AiServices {
    @Override
    public void work() {
        System.out.println("Processing with ChatGPT.");
    }
}
