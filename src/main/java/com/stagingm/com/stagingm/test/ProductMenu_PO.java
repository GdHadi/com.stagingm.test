package com.stagingm.com.stagingm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductMenu_PO {
	WebDriver driver;
	By Products_Menu = By.id("menu-item-1300");
	By MiningSoftware_Menu = By.id("menu-item-1316");
	By MiningSoftware_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By CCLAS_Menu = By.id("menu-item-1318");
	By CCLAS_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	public ProductMenu_PO(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Hovering mouse on Service and Select
		public void HoverMouseonProducts() throws InterruptedException
	{
		WebElement Products = driver.findElement(Products_Menu);
		Actions action100 = new Actions(driver); action100.moveToElement(Products).perform();
		Thread.sleep(2000);
	}
		
	//Validate MiningSoftware_TEST-actions
		public void CLICKminingSoftware() throws InterruptedException
			{
				HoverMouseonProducts();
				WebElement submenu2 = driver.findElement(MiningSoftware_Menu);
				Actions action101 = new Actions(driver); action101.moveToElement(submenu2).click().build().perform();   
			}
		
	//Validate MiningSoftware-assert
		public void ASSERTminingSoftware ()
			{
				driver.findElement(MiningSoftware_Text).isDisplayed();
			}
	
	//Validate CCLAS_TEST-actions
		public void CLICKcclas() throws InterruptedException
			{
				HoverMouseonProducts();
				WebElement submenu2 = driver.findElement(CCLAS_Menu);
				Actions action102 = new Actions(driver); action102.moveToElement(submenu2).click().build().perform();   
			}
		//Validate CCLASS-assert
			public void ASSERTcclas ()
			{
				driver.findElement(CCLAS_Text).isDisplayed();
			}
}
