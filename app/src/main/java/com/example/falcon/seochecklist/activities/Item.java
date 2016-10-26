package com.example.falcon.seochecklist.activities;


public class Item {
    private String name;
    private int Value;

    public Item(String name, int Value) {
        this.name = name;
        this.Value = Value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return Value;
    }
}
