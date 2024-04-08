package com.techelevator;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UnitTest1 {


	@Test
	public void testMethod1() {
	}


	@Test
	public void testBeginApplication(){

		MenuDisplay mt  = new MenuDisplay();
		DisplayScreen ds = new DisplayScreen ();
		PurchaseScreen ps = new PurchaseScreen ();

	}


	//public void testConstructor() throws FileNotFoundException {


	public void testOnChosenScreen() {
		VendingMachine vm = new VendingMachine();
		List<Items> inventory = new ArrayList<>();
		inventory.add(new Items("location", "productName", price, "type", 5));

	}



}

