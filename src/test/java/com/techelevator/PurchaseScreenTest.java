package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PurchaseScreenTest {


    @Test
    public void test_purchase_option_feed() {
        PurchaseScreen purchaseScreen = new PurchaseScreen();
        assertEquals("Feed Money", PurchaseScreen.OPTION_FEED);

    }

    @Test
    public void test_purchase_option_select() {
        PurchaseScreen purchaseScreen = new PurchaseScreen();
        assertEquals("Select Product", PurchaseScreen.OPTION_SELECT);

    }

    @Test
    public void test_purchase_option_finish() {
        PurchaseScreen purchaseScreen = new PurchaseScreen();
        assertEquals("Finish Transaction", PurchaseScreen.OPTION_FINISH);

    }

    @Test
    public void test_Application_Options() {
        Application ap = new Application();
        Assert.assertArrayEquals(new String[]{"Feed Money", "Select Product", "Finish Transaction"}, PurchaseScreen.OPTIONS);
    }
}







