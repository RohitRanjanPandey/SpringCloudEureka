package com.example.product.contract;

public class Product {
    private Integer id;
    private String name;
    private double price;
    private String category;

    public Product(Integer id, String name, double price, String category)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.category = category;
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
