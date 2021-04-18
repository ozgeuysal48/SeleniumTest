package com.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClearBasket extends Basket {

	@Test
	public void clearBasket() {
		
		increaseBasket();
		WebElement clearBtn = driver.findElement(By.xpath("//a[@title='Sil']"));
		clearBtn.click();
		Log4j.Log.info("All products deleted in basket...");
		
	}
	
}
