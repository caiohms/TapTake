package com.example.taptake.data;

public class OrderItem {

    public Item Item;
    public int Quantity;
    public double Price;

    public OrderItem(Item Item) {
        this.Item = Item;
        this.Price = Item.Price;
    }
}
