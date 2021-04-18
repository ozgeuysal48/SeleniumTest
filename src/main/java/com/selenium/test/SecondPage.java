package com.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SecondPage extends SearchPage {

	@Test
	public void goToSecondPage() {
		search();
		closePolicy();
		WebElement nextPage = driver.findElement(By.className("next-link"));
		nextPage.click();
		Log4j.Log.info("Redirecting to next page...");

	}

	public void closePolicy() {
		closeAd();
		Log4j.Log.info("Policy closed...");
		WebElement closePolicy = driver.findElement(By.cssSelector("a.policy-alert-close.btn-alert-close"));
		closePolicy.click();
	}

	public void closeAd() {
		Log4j.Log.info("Ads closed...");
		WebElement closeAd = driver.findElement(By.className("wis-clsbtn-86912"));
		closeAd.click();
	}

}
