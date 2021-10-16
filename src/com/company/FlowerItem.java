package com.company;

public class FlowerItem {
    private String name;
    private int number;

    public FlowerItem(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "name:" + name + ", number: " + number;
    }
}
