package com.retrievestoreorder.bean;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orderdetails")
public class StoreOrder {

    @Id
    public String id;

    @NotBlank
    public String username;

    public String item;
    public String count;
    public String cost;
    public String shipTo;

    public StoreOrder() {}

    public StoreOrder(String username, String item, String count, String cost, String shipTo){
        this.username = username;
        this.item = item;
        this.count = count;
        this.cost = cost;
        this.shipTo = shipTo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    @Override
    public String toString() {
        return String.format("StoreOrder[id='%s', username='%s', item='%s', count='%s', cost='%s', shipTo='%s']",
                id, username, item, count, cost, shipTo);
    }
}