package com.example.taptake.data;

import java.util.ArrayList;

public class Order {

    public ArrayList<OrderItem> Items;
    public Restaurant Restaurant = null;
    public FormPayment Payment = null;

    public long Date;
    public int Hour;
    public int Minute;

    public boolean Completed = false;

    public Order(Restaurant Restaurant) {
        this.Restaurant = Restaurant;
        Items = new ArrayList<>();
    }

    public double GetPrice() {
        double Result = 0;

        for (OrderItem Item : Items)
            Result += Item.GetTotalPrice();

        return Result;
    }
}