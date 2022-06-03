package com.example.taptake.data;

public class Delivery {
    public String Name;
    public String Logo;
    public long Time;
    public double Price;
    public boolean Taken;

    public void Tick() {
        Time -= 1000;
    }
}
