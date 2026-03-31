package dev.mada.dispatch.service;

import dev.mada.dispatch.message.OrderCreated;
import org.springframework.stereotype.Service;

@Service
public class DispatchService {

    public void process(OrderCreated payload){
        //no-op method = no operation
    }
}
