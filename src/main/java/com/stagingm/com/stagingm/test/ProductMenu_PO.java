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
			
			//Validate CLASIC_TEST-actions
			public void CLICKclasic() throws InterruptedException
				{
					HoverMouseonProducts();
					WebElement submenu2 = driver.findElement(CLASIC_Menu);
					Actions action103 = new Actions(driver); action103.moveToElement(submenu2).click().build().perform();   
				}
			//Validate CLASSIC-assert
				public void ASSERTclasic ()
				{
					driver.findElement(CLASIC_Text).isDisplayed();
				}
				
			//Validate ELLIPSE_TEST-actions
				public void CLICKellipse() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(ELLIPSE_Menu);
						Actions action104 = new Actions(driver); action104.moveToElement(submenu2).click().build().perform();   
					}
			//Validate ELLIPSE-assert
				public void ASSERTellipse ()
					{
						driver.findElement(ELLIPSE_Text).isDisplayed();
					}
			
			//Validate LINKONE_TEST-actions
				public void CLICKlinkOne() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(LINKONE_Menu);
						Actions action105 = new Actions(driver); action105.moveToElement(submenu2).click().build().perform();   
					}
				
			//Validate LINKONE-assert
				public void ASSERTlinkOne ()
					{
						driver.findElement(LINKONE_Text).isDisplayed();
					}
					
				
			//Validate MINEMARKET_TEST-actions
				public void CLICKmineMarket() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(MINEMARKET_Menu);
						Actions action106 = new Actions(driver); action106.moveToElement(submenu2).click().build().perform();   
					}
				
			//Validate MINEMARKET-assert
				public void ASSERTmineMarket()
					{
						driver.findElement(MINEMARKET_Text).isDisplayed();
					}
				
			//Validate MINESCAPE_TEST-actions
				public void CLICKmineScape() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(MINESCAPE_Menu);
						Actions action107 = new Actions(driver); action107.moveToElement(submenu2).click().build().perform();   
					}
				
			//Validate MINESCAPE-assert
				public void ASSERTmineScape()
					{
						driver.findElement(MINESCAPE_Text).isDisplayed();
					}
			
			//Validate SPRYSCHEDULER_TEST-actions
				public void CLICKspryScheduler() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(SPRYSCHEDULER_Menu);
						Actions action108 = new Actions(driver); action108.moveToElement(submenu2).click().build().perform();   
					}
				
			//Validate SPRYSCHEDULER-assert
				public void ASSERTspryScheduler()
					{
						driver.findElement(SPRYSCHEDULER_Text).isDisplayed();
					}
				
			//Validate MCAT_TEST-actions
				public void CLICKmCat() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(MCAT_Menu);
						Actions action109 = new Actions(driver); action109.moveToElement(submenu2).click().build().perform();   
					}
				
			//Validate MCAT-assert
				public void ASSERTmCat()
					{
						driver.findElement(MCAT_Text).isDisplayed();
					}
			
			//Validate MEDICALSOFTWARE_TEST-actions
				public void CLICKmedicalSoftware() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(MEDICALSOFTWARE_Menu);
						Actions action110 = new Actions(driver); action110.moveToElement(submenu2).click().build().perform();   
					}
				
			//Validate MEDICALSOFTWARE-assert
				public void ASSERTmedicalSoftware()
					{
						driver.findElement(MEDICALSOFTWARE_Text).isDisplayed();
					}
				
			//Validate HIS_TEST-actions
				public void CLICKhis() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(HIS_Menu);
						Actions action111 = new Actions(driver); action111.moveToElement(submenu2).click().build().perform();   
					}
				
			//Validate HIS-assert
				public void ASSERThis()
					{
						driver.findElement(HIS_Text).isDisplayed();
					}		
				
			//Validate PATIENTADMSYSTEM_TEST-actions
				public void CLICKpatientAdminSystem() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(PATIENTADMSYS_Menu);
						Actions action112 = new Actions(driver); action112.moveToElement(submenu2).click().build().perform();   
					}
				
			//Validate PATIENTADMSYSTEM-assert
				public void ASSERTpatientAdminSystem()
					{
						driver.findElement(PATIENTADMSYS_Text).isDisplayed();
					}	
				
			//Validate FINANCEFORHOSPITAL_TEST-actions
				public void CLICKfinanceForHospital() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(FINANCEFORHOSPITAL_Menu);
						Actions action113 = new Actions(driver); action113.moveToElement(submenu2).click().build().perform();   
					}
				
			//Validate FINANCEFORHOSPITAL-assert
				public void ASSERTfinanceForHospital()
					{
						driver.findElement(FINANCEFORHOSPITAL_Text).isDisplayed();
					}
			
			//Validate OCCUPATIONALHEALTH_TEST-actions
				public void CLICKoccupatinalHealth() throws InterruptedException
					{
						HoverMouseonProducts();
						WebElement submenu2 = driver.findElement(OCCUPATIONALHEALTH_Menu);
						Actions action114 = new Actions(driver); action114.moveToElement(submenu2).click().build().perform();   
					}
				
			//Validate OCCUPATIONALHEALTH-assert
				public void ASSERToccupatinalHealth()
					{
						driver.findElement(OCCUPATIONALHEALTH_Text).isDisplayed();
					}
				
}
