package com.doomphantoom.controller;

import com.doomphantoom.dto.Order;
import com.doomphantoom.dto.Refund;
import com.doomphantoom.event.OrderEvent;
import com.doomphantoom.event.OrderSuccessEvent;
import com.doomphantoom.event.RefundEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by doomphantom on 16/10/2015.
 * This demos the event handling mechanism in spring 3.x + 4.x
 */
@Controller
public class EventHandlingController {
    //The interface ApplicationEventPublisher is used for notifying to all the proper listeners which are registered with ApplicationContext.
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @RequestMapping("/publishOrderEvent")
    @ResponseBody
    public String publishOrderEvent(@RequestBody Order order) {
        OrderEvent orderEvent = new OrderEvent(order);
        /*
        After the creating of the orderEvent, it will be published by applicationEventPublisher.
        NOTE: + By default, this process is synchronous, it means the notifying will invoke the listener to handle the event before return the result for the client.
        Say in the simple way, The publish method will wait until the methods of all the listeners have completed successfully.
        To make it runs asynchronous, just define a bean with id is 'applicationEventMulticaster' and specify TaskExecutor manually.
              + This process will only invoke the listeners that match with the raised event.
         */
        applicationEventPublisher.publishEvent(orderEvent);
        System.out.println("The orderEvent is successfully published");
        return "{\"status\":\"ok\"}";
    }

    @RequestMapping("/publishOrderSuccessEvent")
    @ResponseBody
    public String publishOrderSuccessEvent(@RequestBody Order order) {
        OrderSuccessEvent orderSuccessEvent = new OrderSuccessEvent(order);
        applicationEventPublisher.publishEvent(orderSuccessEvent);
        System.out.println("The orderSuccessEvent is successfully published");
        return "{\"status\":\"ok\"}";
    }

    /**
     * In Spring 4.2, we can publish any object as an event, you don't have to extend ApplicationEvent. This will increase the flexibility of the system.
     *
     * @param refund
     * @return
     */
    @RequestMapping("/publishRefundEvent")
    @ResponseBody
    public String publishRefundEvent(@RequestBody Refund refund) {
        RefundEvent refundEvent = new RefundEvent(refund);
        applicationEventPublisher.publishEvent(refundEvent);
        System.out.println("The refundEvent is successfully published");
        return "{\"status\":\"ok\"}";
    }

}
