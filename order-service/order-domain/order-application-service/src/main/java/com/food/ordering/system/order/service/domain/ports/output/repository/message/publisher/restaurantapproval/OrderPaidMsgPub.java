package com.food.ordering.system.order.service.domain.ports.output.repository.message.publisher.restaurantapproval;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.system.domain.event.OrderPaidEvent;

public interface OrderPaidMsgPub extends DomainEventPublisher<OrderPaidEvent> {
}