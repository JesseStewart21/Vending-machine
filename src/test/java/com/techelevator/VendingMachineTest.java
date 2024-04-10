package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {

    @Test
    public void  test_Get_Current_Money_Provided() {
        VendingMachine vendingMachine = new VendingMachine();
        Assert.assertEquals(0.00, vendingMachine.getCurrentMoneyProvided(), 0.01);
    }

    @Test
    public void test_Set_Current_Money_Provided() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setCurrentMoneyProvided('$');
        Assert.assertEquals('$', vendingMachine.getCurrentMoneyProvided(), 0.01);
    }
}
