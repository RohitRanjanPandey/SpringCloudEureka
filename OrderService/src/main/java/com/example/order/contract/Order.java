package com.example.order.contract;

import java.util.List;

public class Order {
    private Integer orderId;
    private String orderType;
    private List<Product> products;

    public Order(Integer oderId, String orderType, List<Product> products)
    {
        this.orderId = oderId;
        this.orderType = orderType;
        this.products = products;
    }

    public Integer getOderId() {
        return orderId;
    }

    public void setOderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public List<Product> getProduct() {
        return products;
    }

    public void setProduct(List<Product> products) {
        this.products = products;
    }
}
