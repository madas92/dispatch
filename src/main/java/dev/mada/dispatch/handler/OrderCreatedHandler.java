package dev.mada.dispatch.handler;

import dev.mada.dispatch.message.OrderCreated;
import dev.mada.dispatch.service.DispatchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class OrderCreatedHandler {

    private final DispatchService dispatchService;

    //to receive the event
    @KafkaListener(
            id = "OrderConsumerClient",
            topics = "order.created",
            groupId = "dispatch.order.created.consumer"
    )
    public void listen(OrderCreated payload){
        log.info("Received message: payload: " + payload);
        dispatchService.process(payload);
    }

    //once the event is consumed, we will call a service that can process the event
}
