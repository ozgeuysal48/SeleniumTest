package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class App {
	
	Home home = new Home();
	LoginPage login = new LoginPage();
	
	@Test
	public void openHome() {
		home.openHome();
		login.login();
	}
}
