package com.example.order.controller;

import com.example.order.contract.Order;
import com.example.order.contract.Product;
import com.example.order.feign.ProductFeignClient;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    ProductFeignClient feignClient;

    @Autowired
    public OrderController(ProductFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @GetMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public Order getOrders() {
        List<Product> products = null;
        try {
            products = feignClient.getAllProducts();
        } catch (FeignException e) {
            System.out.println("Found Feign Exception" + e.toString());
            // Handle the ConnectException and provide a fallback response
            //return "Fallback response";
        }
        //Just returning a fallback response. Can put any other custom logic for fallback too.
        return  new Order(1, "Online", products);
    }

    @GetMapping(value = "/order/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Order getProducts(@PathVariable int id) {
        List<Product> products = new ArrayList<Product>();
        products.add(feignClient.getProduct(id));
        return new Order(1, "Offline", products);
    }
}
