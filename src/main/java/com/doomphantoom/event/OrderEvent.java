package com.doomphantoom.event;

import com.doomphantoom.dto.Order;

/**
 * Created by doomphantom on 16/10/2015.
 */
public class OrderEvent extends ApplicationBaseEvent {
    public Order order;

    public OrderEvent(Order source) {
        super(source);
        this.order = source;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "product name: " + order.getProductName() + ", number: " + order.getNumOfProduct();
    }
}
