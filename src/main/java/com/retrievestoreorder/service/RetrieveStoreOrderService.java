package com.retrievestoreorder.service;

import com.retrievestoreorder.entity.StoreOrder;

public interface RetrieveStoreOrderService {

    // todo
    // List<StoreOrder> findAll();

    StoreOrder findOrderById(String orderId);

    StoreOrder findOrderByUsername(String username);
}
