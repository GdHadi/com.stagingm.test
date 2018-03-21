package com.stagingm.com.stagingm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductMenu_PO {
	WebDriver driver;
	By Products_Menu = By.xpath("//*[@id='menu-item-1300']/a");
	By MiningSoftware_Menu = By.xpath("//*[@id='menu-item-1316']/a");
	By MiningSoftware_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By CCLAS_Menu = By.xpath("//*[@id='menu-item-1318']/a");
	By CCLAS_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By CLASIC_Menu = By.xpath("//*[@id='menu-item-1319']/a");
	By CLASIC_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By ELLIPSE_Menu = By.xpath("//*[@id='menu-item-1320']/a");
	By ELLIPSE_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By LINKONE_Menu = By.xpath("//*[@id='menu-item-1321']/a");
	By LINKONE_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By MINEMARKET_Menu = By.xpath("//*[@id='menu-item-1323']/a");
	By MINEMARKET_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By MINESCAPE_Menu = By.xpath("//*[@id='menu-item-1324']/a");
	By MINESCAPE_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By SPRYSCHEDULER_Menu = By.xpath("//*[@id='menu-item-1325']/a");
	By SPRYSCHEDULER_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By MCAT_Menu = By.xpath("//*[@id='menu-item-1322']/a");
	By MCAT_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By MEDICALSOFTWARE_Menu = By.xpath("//*[@id='menu-item-1315']/a");
	By MEDICALSOFTWARE_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By HIS_Menu = By.xpath("//*[@id='menu-item-2100']/a");
	By HIS_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By PATIENTADMSYS_Menu = By.xpath("//*[@id='menu-item-1327']/a");
	By PATIENTADMSYS_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By FINANCEFORHOSPITAL_Menu = By.xpath("//*[@id='menu-item-2099']/a");
	By FINANCEFORHOSPITAL_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By OCCUPATIONALHEALTH_Menu = By.xpath("//*[@id='menu-item-1326']/a");
	By OCCUPATIONALHEALTH_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	
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
