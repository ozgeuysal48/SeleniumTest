package com.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends LoginPage {

	private final String searchKeyword = "Bilgisayar";

	@Test
	public void search() {
		login();
		WebElement inputSearch = driver.findElement(By.xpath("//input[@placeholder='Keşfetmeye Bak']"));
		inputSearch.click();
		inputSearch.sendKeys(searchKeyword);

		WebElement searchBtn = driver.findElement(By.xpath("//span[text()='BUL']"));
		searchBtn.click();
		Log4j.Log.info("searchKeyword : Bilgisayar is searching");

	}

}
