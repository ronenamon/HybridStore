package com.demo.hybridstore.com.hybridstore.model;

public class Order {
    private String shopName;
    private String shopThumbnail;
    private String shopIp;
    private float finalPrice;
    private String streetAdd;
    private String country;
    private String city;
    private String postalcode;
    private String items;
    private int status;
    private String statusValue;
    private String phoneNumber;

    public Order(String shopName, String shopThumbnail, String shopIp, float finalPrice, String streetAdd, String country, String city, String postalcode, String items, int status, String statusValue, String phoneNumber) {
        this.shopName = shopName;
        this.shopThumbnail = shopThumbnail;
        this.shopIp = shopIp;
        this.finalPrice = finalPrice;
        this.streetAdd = streetAdd;
        this.country = country;
        this.city = city;
        this.postalcode = postalcode;
        this.items = items;
        this.status = status;
        this.statusValue = statusValue;
        this.phoneNumber = phoneNumber;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopThumbnail() {
        return shopThumbnail;
    }

    public void setShopThumbnail(String shopThumbnail) {
        this.shopThumbnail = shopThumbnail;
    }

    public String getShopIp() {
        return shopIp;
    }

    public void setShopIp(String shopIp) {
        this.shopIp = shopIp;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getStreetAdd() {
        return streetAdd;
    }

    public void setStreetAdd(String streetAdd) {
        this.streetAdd = streetAdd;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getItems() {
        return this.items;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStatusValue() {
        return this.statusValue;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}