package com.retrievestoreorder.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.retrievestoreorder.entity.StoreOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class MongoDBRetrieveStoreOrderService implements RetrieveStoreOrderService {

    private static final Logger log = LoggerFactory.getLogger(MongoDBRetrieveStoreOrderService.class);

    @Autowired
    private MongoTemplate mongoTemplate;

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
    public StoreOrder findOrderById(String orderId) {
        Query query = Query.query(Criteria.where("orderId").is(Long.parseLong(orderId)));
        StoreOrder storeOrder = mongoTemplate.findOne(query,
                StoreOrder.class, "orderdetails");
        return storeOrder;
    }

    @Override
    public StoreOrder findOrderByUsername(String username) {
        Query query = Query.query(Criteria.where("username").is(username));
        StoreOrder storeOrder = mongoTemplate.findOne(query,
                StoreOrder.class, "orderdetails");
        return storeOrder;
    }
}

