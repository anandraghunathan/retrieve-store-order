package com.retrievestoreorder.controller;

import com.retrievestoreorder.entity.StoreOrder;
import com.retrievestoreorder.service.RetrieveStoreOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storeorder")
//@PreAuthorize("hasRole('ROLE_ADMIN')")
public class RetrieveStoreOrderController {

    @Autowired
    RetrieveStoreOrderService retrieveStoreOrderService;

    @Autowired
    RetrieveStoreOrderController(RetrieveStoreOrderService retrieveStoreOrderService) {
        this.retrieveStoreOrderService = retrieveStoreOrderService;
    }

    //@PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping(value="/orderId/{orderId}")
    public ResponseEntity<StoreOrder> findOrderById(@PathVariable("orderId") String orderId) {
        StoreOrder storeOrder = retrieveStoreOrderService.findOrderById(orderId);
        if(storeOrder == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(storeOrder, HttpStatus.OK);
        }
    }

    //@PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping(value="/username/{username}")
    public ResponseEntity<StoreOrder> findOrderByUsername(@PathVariable("username") String username) {
        StoreOrder storeOrder = retrieveStoreOrderService.findOrderByUsername(username);
        if(storeOrder == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(storeOrder, HttpStatus.OK);
        }
    }
}