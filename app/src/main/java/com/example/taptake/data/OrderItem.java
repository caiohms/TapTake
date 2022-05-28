package com.example.taptake.data;

public class OrderItem extends com.example.taptake.data.Item {

    public Item Item;
    public int Quantity;
    public double Price;

    public OrderItem(Item Item, int Quantity) {
        this.Item = Item;
        this.Quantity = Quantity;
        this.Price = Item.Price;
    }

    public double GetTotalPrice() {
        return Quantity * Price;
    }
}
