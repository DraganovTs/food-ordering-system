package com.food.ordering.system.restaurant.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valueobject.OrderApprovedStatus;
import com.food.ordering.system.domain.valueobject.OrderId;
import com.food.ordering.system.domain.valueobject.RestaurantId;
import com.food.ordering.system.restaurant.domain.valueobject.OrderApprovalId;

public class OrderApproval extends BaseEntity<OrderApprovalId> {
    private final RestaurantId restaurantId;
    private final OrderId orderId;
    private final OrderApprovedStatus approvalStatus;

    private OrderApproval(Builder builder) {
        setId(builder.orderApprovalId);
        restaurantId = builder.restaurantId;
        orderId = builder.orderId;
        approvalStatus = builder.approvalStatus;
    }


    public RestaurantId getRestaurantId() {
        return restaurantId;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public OrderApprovedStatus getApprovalStatus() {
        return approvalStatus;
    }

    public static final class Builder {
        private OrderApprovalId orderApprovalId;
        private RestaurantId restaurantId;
        private OrderId orderId;
        private OrderApprovedStatus approvalStatus;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder orderApprovalId(OrderApprovalId val) {
            orderApprovalId = val;
            return this;
        }

        public Builder restaurantId(RestaurantId val) {
            restaurantId = val;
            return this;
        }

        public Builder orderId(OrderId val) {
            orderId = val;
            return this;
        }

        public Builder approvalStatus(OrderApprovedStatus val) {
            approvalStatus = val;
            return this;
        }

        public OrderApproval build() {
            return new OrderApproval(this);
        }
    }
}
