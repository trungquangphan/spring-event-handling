package com.doomphantoom.event;

import com.doomphantoom.dto.Order;

/**
 * Created by doomphantom on 20/10/2015.
 */
public class OrderSuccessEvent {

    public Order order;

    public OrderSuccessEvent(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "The products are ordered success, product name: " + order.getProductName() + ", number: " + order.getNumOfProduct();
    }
}
