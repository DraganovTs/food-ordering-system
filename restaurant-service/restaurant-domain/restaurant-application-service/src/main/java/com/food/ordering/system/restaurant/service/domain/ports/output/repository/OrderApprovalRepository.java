package com.food.ordering.system.restaurant.service.domain.ports.output.repository;

import com.food.ordering.system.restaurant.domain.entity.OrderApproval;

import java.util.Optional;

public interface OrderApprovalRepository {

    OrderApproval save(OrderApproval orderApproval);

}
