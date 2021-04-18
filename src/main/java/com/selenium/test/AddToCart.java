package com.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToCart extends SecondPage {
	
	// * Select random product in page
	private int random = 5;
	private final String gotoProduct = "(//p[contains(., '0')])["+ random +"]";
	
	@Test
	public void addToCart() {
		goToSecondPage();
		gotoProduct();
		WebElement cartBtn = driver.findElement(By.id("add-to-basket"));
		cartBtn.click();
		goBasket();
		Log4j.Log.info("Product added to cart...");
	}
	
	public void gotoProduct() {
		WebElement go = driver.findElement(By.xpath(gotoProduct));
		go.click();
	}
	
	public void goBasket() {
		WebElement clickBasket = driver.findElement(By.className("header-cart-hidden-link"));
		clickBasket.click();
	}
	
}
