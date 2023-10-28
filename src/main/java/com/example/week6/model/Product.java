package com.example.week6.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Product {
    private int id;
    private String name;
    private String category;
    private Double price;
    private String image;
    public Product() {
    }
    public Product(int id, String name, String category, Double price, String image) {
        super();
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.image = image;
    }
}
