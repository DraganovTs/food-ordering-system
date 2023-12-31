package com.food.ordering.system.order.service.domain.outbox.model.approval;

import com.food.ordering.system.domain.valueobject.OrderStatus;
import com.food.ordering.system.order.service.domain.outbox.model.payment.OrderPaymentOutboxMessage;
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
public class OrderApprovalOutboxMessage {
    private UUID id;
    private UUID sagaId;
    private ZonedDateTime createdAt;
    private ZonedDateTime processedAt;
    private String type;
    private String payload;
    private SagaStatus sagaStatus;

    public OrderApprovalOutboxMessage setProcessedAt(ZonedDateTime processedAt) {
        this.processedAt = processedAt;
        return this;
    }

    private OrderStatus orderStatus;
    private OutboxStatus outboxStatus;
    private int version;


    public OrderApprovalOutboxMessage setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderApprovalOutboxMessage setSagaStatus(SagaStatus sagaStatus) {
        this.sagaStatus = sagaStatus;
        return this;
    }

    public OrderApprovalOutboxMessage setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public OrderApprovalOutboxMessage setOutboxStatus(OutboxStatus outboxStatus) {
        this.outboxStatus = outboxStatus;
        return this;
    }
}
