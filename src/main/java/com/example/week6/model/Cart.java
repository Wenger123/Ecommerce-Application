package com.example.week6.model;

import lombok.Getter;

@Getter
public class Cart extends Product{
    private int quantity;
    public Cart() {
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
