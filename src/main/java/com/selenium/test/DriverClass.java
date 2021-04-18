package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {

	public WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ozge\\Desktop\\test\\chromedriver.exe");
		Log4j.Log.info("The test started...");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void down() {
		Log4j.Log.info("The test stopped...");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.quit();
	}
}
