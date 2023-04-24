package com.khder.warehousebd.model;

import jdk.jfr.Category;

public class Product {
    private int id;
    private double price;
    private String name;
    private String description;
    private Categories category;
    private int count;
    private String placement;
    public Product() {

    }

    public Product(int id, double price, String name, String description, Categories category, int count, String placement) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.count = count;
        this.placement = placement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }
}
