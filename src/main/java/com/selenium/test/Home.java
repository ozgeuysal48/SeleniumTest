package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home extends DriverClass {

	private final String url = "https://www.gittigidiyor.com/";

	@Test
	public void openHome() {
		Log4j.Log.info("Gittigidiyor.com is opening...");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
