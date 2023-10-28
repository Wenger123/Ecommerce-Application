package com.example.week6.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Order extends Product{
    private int orderId;
    private int uid;
    private int qunatity;
    private String date;

    public Order() {
    }

    public Order(int orderId, int uid, int qunatity, String date) {
        super();
        this.orderId = orderId;
        this.uid = uid;
        this.qunatity = qunatity;
        this.date = date;
    }

    public Order(int uid, int qunatity, String date) {
        super();
        this.uid = uid;
        this.qunatity = qunatity;
        this.date = date;
    }
}
