package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Home {

	private final String username = "seleniumtestdeneme1@gmail.com";
	private final String passwd = "1234Hello";

	@Test
	public void login() {
		openHome();

		WebElement signbtn = driver.findElement(By.xpath("//div[text()='Giriş Yap']"));
		signbtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement span = driver.findElement(By.xpath("//span[text()='Giriş Yap']"));
		span.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		WebElement mailbox = driver.findElement(By.id("L-UserNameField"));
		mailbox.click();
		mailbox.sendKeys(username);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Log4j.Log.info("Logged in user: " + username + "");

		WebElement password = driver.findElement(By.id("L-PasswordField"));
		password.click();
		password.sendKeys(passwd);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement login = driver.findElement(By.id("gg-login-enter"));
		login.click();
		Log4j.Log.info("Login successfull...");

	}

}
