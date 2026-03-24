package com.codespace.EasyBasket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ResponseGenerator {
    
    private final AiServices aiServices;

    @Autowired
    public ResponseGenerator(@Qualifier("chatgptModel") AiServices aiServices) {
        this.aiServices = aiServices;
    }
    
    public void work() {
        aiServices.work();
    }
}
