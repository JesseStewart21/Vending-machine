package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Items {
    private String location;
    private String productName;
    private double price;
    private String type;
    private int quantity;

    public Items(String location, String productName, double price, String type) {
        this.location = location;
        this.productName = productName;
        this.price = price;
        this.type = type;

    }

    public String getLocation(){
        return location;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setLocation(String location){
        this.location = location;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setQuantity(int quantity){
        this.quantity = 5;
    }








}
