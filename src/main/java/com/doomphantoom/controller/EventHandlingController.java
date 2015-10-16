package com.doomphantoom.controller;

import com.doomphantoom.dto.Order;
import com.doomphantoom.event.OrderEvent;
import com.doomphantoom.listener.OrderEventListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by doomphantom on 16/10/2015.
 */
@Controller
public class EventHandlingController {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @RequestMapping("/publishOrderEvent")
    @ResponseBody
    public String publishOrderEvent(@RequestBody Order order) {
        OrderEvent orderEvent = new OrderEvent(order);
        applicationEventPublisher.publishEvent(orderEvent);
        return "{\"status\":\"ok\"}";
    }

}
