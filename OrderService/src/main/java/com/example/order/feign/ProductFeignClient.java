package com.example.order.feign;

import com.example.order.contract.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "product-service")
public interface ProductFeignClient {
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts();

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable("id") int productId);
}
