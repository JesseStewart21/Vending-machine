package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplicationTest {


	@Test
	public void testMethod1() {
	}




	@Test
	public void test_Application_Intro() {
		Application ap = new Application();
		Assert.assertEquals("Welcome to the Vendo-Matic 800", Application.INTRO);
	}

	@Test
	public void test_Application_Option_Display() {
		Application ap = new Application();
		Assert.assertEquals("Display Vending Machine Items", Application.OPTION_DISPLAY);
	}

	@Test
	public void test_Application_Option_Purchase() {
		Application ap = new Application();
		Assert.assertEquals("Purchase", Application.OPTION_PURCHASE);
	}

	@Test
	public void test_Application_Exit() {
		Application ap = new Application();
		Assert.assertEquals("Exit", Application.OPTION_EXIT);
	}


	@Test
	public void test_Application_Options() {
		Application ap = new Application();
		Assert.assertArrayEquals(new String[]{"Display Vending Machine Items", "Purchase", "Exit"}, Application.OPTIONS);
	}












}

