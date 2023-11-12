package com.food.ordering.system.order.system.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.system.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelledEvent extends OrderEvent {


    public OrderCancelledEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }


}
