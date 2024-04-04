package com.techelevator;

public class Items {

    private String location;
    private String productName;

    private double price;
    private String type;

    private int quantity = 5;

    public Items(String location, String name, double price, String type) {
        this.location = location;
        this.productName = productName;
        this.price = price;
        this.type = type;

    }


    //Getters
    public String getLocation() {
        return location;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getQuanity() {
        return quantity;
    }


    //setters


    public void setLocation(String location) {
        this.location = location;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }


}







