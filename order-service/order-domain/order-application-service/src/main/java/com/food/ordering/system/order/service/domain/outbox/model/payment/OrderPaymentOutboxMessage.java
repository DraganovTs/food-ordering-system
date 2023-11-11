package com.food.ordering.system.order.service.domain.outbox.model.payment;

import com.food.ordering.system.domain.valueobject.OrderStatus;
import com.food.ordering.system.outbox.OutboxStatus;
import com.food.ordering.system.saga.SagaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class OrderPaymentOutboxMessage {
    private UUID id;
    private UUID sagaId;
    private ZonedDateTime createdAt;
    private ZonedDateTime processedAt;
    private String type;
    private String payload;
    private SagaStatus sagaStatus;
    private OrderStatus orderStatus;
    private OutboxStatus outboxStatus;
    private int version;

    public OrderPaymentOutboxMessage setProcessedAt(ZonedDateTime processedAt) {
        this.processedAt = processedAt;
        return this;
    }

    public OrderPaymentOutboxMessage setSagaStatus(SagaStatus sagaStatus) {
        this.sagaStatus = sagaStatus;
        return this;
    }

    public OrderPaymentOutboxMessage setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public OrderPaymentOutboxMessage setOutboxStatus(OutboxStatus outboxStatus) {
        this.outboxStatus = outboxStatus;
        return this;
    }
}
