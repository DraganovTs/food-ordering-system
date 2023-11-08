package com.food.ordering.system.restaurant.service.dataaccess.repository;

import com.food.ordering.system.restaurant.service.dataaccess.entity.OrderApprovalEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderApprovalJpaRepository<OrderApprovalEntity, UUID> {
    OrderApprovalEntity save(OrderApprovalEntity orderApprovalToOrderApprovalEntity);
}
