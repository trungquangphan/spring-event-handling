package com.doomphantoom.listener;

import com.doomphantoom.event.OrderEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by doomphantom on 16/10/2015.
 * Declaration of @Component will register class ApplicationEventListener with spring application context.
 * By implementing the interface ApplicationListener with event type OrderEvent, this listener will only invoke for matching OrderEvent object.
 */
@Component
public class OrderEventListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("OrderEvent is listened. " + orderEvent);
    }

}
