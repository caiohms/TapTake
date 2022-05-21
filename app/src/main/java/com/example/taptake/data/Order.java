package com.example.taptake.data;

import java.util.ArrayList;

public class Order {

    public ArrayList<OrderItem> Items = new ArrayList<>();
    public boolean Completed = false;

    public double GetPrice() {
        double Result = 0;

        for (OrderItem Item : Items)
            Result += Item.Price * Item.Quantity;

        return Result;
    }
}