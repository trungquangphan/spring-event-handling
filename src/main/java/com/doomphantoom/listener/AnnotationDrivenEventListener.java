package com.doomphantoom.listener;

import com.doomphantoom.event.OrderEvent;
import com.doomphantoom.event.OrderSuccessEvent;
import com.doomphantoom.event.RefundEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by doomphantom on 20/10/2015.
 * This demos the new feature from Spring 4.2 that supports Annotation-Event listeners: annotating "EventListener" will automatically register ApplicationListener with proper method based on the signature.
 * This annotation also supports SpEL expression that should match in order to handle the event.
 */
@Component
public class AnnotationDrivenEventListener {

    @EventListener(condition = "#orderEvent.order.numOfProduct>10")
    public void handleOrderEventListener(OrderEvent orderEvent) {
        System.out.println("Handle Order Event - only accept order event has number of product greater than 10");
        System.out.println("AnnotationDrivenEventListener - OrderEvent is listened. " + orderEvent);
    }

    @EventListener
    public void handleRefundEventListener(RefundEvent refundEvent) {
        System.out.println("AnnotationDrivenEventListener - RefundEvent is listened. Refund Source:  " + refundEvent.getRefund());
    }

    @EventListener
    void handleOrderSuccessEventListener(OrderSuccessEvent orderSuccessEvent) {
        System.out.println("AnnotationDrivenEventListener - OrderSuccessEvent is listened. " + orderSuccessEvent);
    }


}
