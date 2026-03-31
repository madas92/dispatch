package dev.mada.dispatch.util;

import dev.mada.dispatch.message.OrderCreated;

import java.util.UUID;

public class TestEventData {

    public static OrderCreated buildOrderCreatedEvent(UUID orderId, String item){
        return OrderCreated.builder()
                .orderId(orderId)
                .item(item)
                .build();
    }
}
