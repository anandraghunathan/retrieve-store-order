package com.retrievestoreorder.service;

import com.retrievestoreorder.bean.StoreOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class MongoDBRetrieveStoreOrderService implements RetrieveStoreOrderService {

    private static final Logger log = LoggerFactory.getLogger(MongoDBRetrieveStoreOrderService.class);

    @Autowired
    private MongoOperations mongoOperations;

    //private final StoreOrderRepository storeOrderRepository;

    /*@Autowired
    MongoDBRetrieveStoreOrderService(StoreOrderRepository storeOrderRepository) {
        this.storeOrderRepository = storeOrderRepository;
    }*/

    //todo
    /*@Override
    public List<StoreOrder> findAll() {
        List<StoreOrder> storeOrders = storeOrderRepository.findAll();
        return convertToDTOs(todoEntries);
    }*/

    @Override
    public StoreOrder findOrderById(String id) {
        Query query = Query.query(Criteria.where("order.id").is(Long.parseLong(id)));
        StoreOrder storeOrder = mongoOperations.findOne(query,
                StoreOrder.class, "orderdetails");
        return storeOrder;
    }
}

