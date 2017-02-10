package com.haisenburg.model;

public class Product {

    private String name;
    private String price;

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String print() {
        return this.name + " : ¥" + this.price;
    }
}
