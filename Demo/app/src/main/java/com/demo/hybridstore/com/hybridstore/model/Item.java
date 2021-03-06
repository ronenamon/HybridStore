package com.demo.hybridstore.com.hybridstore.model;

import com.demo.hybridstore.CartActivity;

public class Item {
    private String id;
    private String title;
    private String image;
    private String description;
    private float price;
    private String color = "#FFFFFF";

    public Item(String id, String title, String image, String description, float price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.description = description;
        this.price = price;
        this.color = "#FFFFFF";
    }

    public void resetColor() {
        this.color = "#FFFFFF";
    }
    public void turnOnColor() {
        this.color = "#bdc3c7";
    }

    public void switchColor() {
        if (this.color.equals("#FFFFFF")) {
            this.color = "#bdc3c7";
            CartActivity.addtoCart(new Cart(this.id, this.title, this.image, this.price, 1));
        }
        else {
            this.color = "#FFFFFF";
            CartActivity.removeFromCart(new Cart(this.id, this.title, this.image, this.price, 0));
        }
    }


    public String getId() {
        return this.id;
    };

    public String getColor() {
        return this.color;
    }

    public String getTitle() {
        return this.title;
    }

    public String getImageResource() {
        return this.image;
    }

    public String getDescription() {
        return this.description;
    }

    public float getPrice() {
        return this.price;
    }
}
