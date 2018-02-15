package com.retrievestoreorder.controller;

import com.retrievestoreorder.bean.StoreOrder;
import com.retrievestoreorder.service.RetrieveStoreOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storeorder")
public class RetrieveStoreOrderController {

    @Autowired
    RetrieveStoreOrderService retrieveStoreOrderService;

    @Autowired
    RetrieveStoreOrderController(RetrieveStoreOrderService retrieveStoreOrderService) {
        this.retrieveStoreOrderService = retrieveStoreOrderService;
    }

    @GetMapping(value="{id}")
    public ResponseEntity<StoreOrder> findOrderById(@PathVariable("id") String id) {
        StoreOrder storeOrder = retrieveStoreOrderService.findOrderById(id);
        if(storeOrder == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(storeOrder, HttpStatus.OK);
        }
    }
}