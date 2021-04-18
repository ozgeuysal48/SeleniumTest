package com.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Basket extends AddToCart {

	@Test
	public void increaseBasket() {
		addToCart();
		driver.navigate().back();
		WebElement cartBtn = driver.findElement(By.id("add-to-basket"));
		cartBtn.click();
		WebElement clickBasket = driver.findElement(By.className("header-cart-hidden-link"));
		clickBasket.click();
		Log4j.Log.info("One more product added to cart...");

	}

}
