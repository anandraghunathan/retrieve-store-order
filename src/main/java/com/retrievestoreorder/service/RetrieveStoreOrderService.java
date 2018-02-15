package com.retrievestoreorder.service;

import com.retrievestoreorder.bean.StoreOrder;

public interface RetrieveStoreOrderService {

    // todo
    // List<StoreOrder> findAll();

    StoreOrder findOrderById(String id);

}
