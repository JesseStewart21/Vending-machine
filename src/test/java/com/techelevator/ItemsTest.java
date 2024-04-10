package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ItemsTest {

    @Test
    public void test_Items (){
        Items item = new Items("A1", "Product1", 1.50, "Type1");
        Assert.assertEquals("A1", item.getLocation());
        Assert.assertEquals("Product1", item.getProductName());
        Assert.assertEquals(1.50, item.getPrice(), 0.001);
        Assert.assertEquals("Type1", item.getType());
        Assert.assertEquals(5, item.getQuantity());

        }

    @Test
    public void test_setters (){

        Items item = new Items("A1", "Product1", 1.50, "Type1");
        item.setLocation("A2");
        item.setProductName("Product2");
        item.setPrice(2.00);
        item.setType("Type2");
        item.setQuantity(5);


    }


    }



