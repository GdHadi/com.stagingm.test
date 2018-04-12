package com.stagingm.com.stagingm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductMenu_PO {
	WebDriver driver;
	By Products_Menu = By.xpath("//*[@id='menu-item-1300']/a");
	By MiningSoftware_Menu = By.xpath("//*[@id='menu-item-1316']/a");
	By MiningSoftware_Text = By.xpath("//*[@class='text-white' and contains(text(),'Mining Software Services')]");
	By CCLAS_Menu = By.xpath("//*[@id='menu-item-1318']/a");
	By CCLAS_Text = By.xpath("//*[@class='text-white' and contains(text(),'CCLAS')]");
	By CLASIC_Menu = By.xpath("//*[@id='menu-item-1319']/a");
	By CLASIC_Text = By.xpath("//*[@class='text-white' and contains(text(),'Classic')]");
	By ELLIPSE_Menu = By.xpath("//*[@id='menu-item-1320']/a");
	By ELLIPSE_Text = By.xpath("//*[@class='text-white' and contains(text(),'Ellipse')]");
	By LINKONE_Menu = By.xpath("//*[@id='menu-item-1321']/a");
	By LINKONE_Text = By.xpath("//*[@class='text-white' and contains(text(),'LinkOne')]");
	By MINEMARKET_Menu = By.xpath("//*[@id='menu-item-1323']/a");
	By MINEMARKET_Text = By.xpath("//*[@class='text-white' and contains(text(),'MineMarket')]");
	By MINESCAPE_Menu = By.xpath("//*[@id='menu-item-1324']/a");
	By MINESCAPE_Text = By.xpath("//*[@class='text-white' and contains(text(),'MineScape')]");
	By SPRYSCHEDULER_Menu = By.xpath("//*[@id='menu-item-1325']/a");
	By SPRYSCHEDULER_Text = By.xpath("//*[@class='text-white' and contains(text(),'Spry Scheduler')]");
	By MCAT_Menu = By.xpath("//*[@id='menu-item-1322']/a");
	By MCAT_Text = By.xpath("//*[@class='text-white' and contains(text(),'MCat')]");
	By MEDICALSOFTWARE_Menu = By.xpath("//*[@id='menu-item-1315']/a");
	By MEDICALSOFTWARE_Text = By.xpath("//*[@class='text-white' and contains(text(),'Medical Software Services')]");
	By HIS_Menu = By.xpath("//*[@id='menu-item-2100']/a");
	By HIS_Text = By.xpath("//*[@class='text-white' and contains(text(),'Hospital Information System')]");
	By PATIENTADMSYS_Menu = By.xpath("//*[@id='menu-item-1327']/a");
	By PATIENTADMSYS_Text = By.xpath("//*[@class='text-white' and contains(text(),'Patient Administration System')]");
	By FINANCEFORHOSPITAL_Menu = By.xpath("//*[@id='menu-item-2099']/a");
	By FINANCEFORHOSPITAL_Text = By.xpath("//*[@class='text-white' and contains(text(),'Finance Software for Hospitals')]");
	By OCCUPATIONALHEALTH_Menu = By.xpath("//*[@id='menu-item-1326']/a");
	By OCCUPATIONALHEALTH_Text = By.xpath("//*[@class='text-white' and contains(text(),'Occupational Health & Safety System')]");
	
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
	
	//Explicit wait for Element Mining Software
		public void WAITINGelementMiningSoftware()
			{	
				WebDriverWait wait=new WebDriverWait(driver,5000);
				WebElement element101= wait.until(ExpectedConditions.visibilityOfElementLocated(MiningSoftware_Text));
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
	//Explicit wait for Element CCLAS
		public void WAITINGelementCCLAS()
			{	
				WebDriverWait wait=new WebDriverWait(driver,5000);
				WebElement element102=wait.until(ExpectedConditions.visibilityOfElementLocated(CCLAS_Text));
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
		//Explicit wait for Element CLASIC
			public void WAITINGelementCLASIC()
				{	
					WebDriverWait wait=new WebDriverWait(driver,5000);
					WebElement element103=wait.until(ExpectedConditions.visibilityOfElementLocated(CLASIC_Text));
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
		//Explicit wait for Element ELLIPSE
			public void WAITINGelementEllipse()
				{	
					WebDriverWait wait=new WebDriverWait(driver,5000);
					WebElement element104=wait.until(ExpectedConditions.visibilityOfElementLocated(ELLIPSE_Text));
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
			//Explicit wait for Element LINKONE
				public void WAITINGelementLinkOne()
					{	
						WebDriverWait wait=new WebDriverWait(driver,5000);
						WebElement element105=wait.until(ExpectedConditions.visibilityOfElementLocated(LINKONE_Text));
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
			//Explicit wait for Element MINEMARKET
				public void WAITINGelementMinemarket()
					{	
						WebDriverWait wait=new WebDriverWait(driver,5000);
						WebElement element106=wait.until(ExpectedConditions.visibilityOfElementLocated(MINEMARKET_Text));
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
			//Explicit wait for Element MINESCAPE
				public void WAITINGelementMinescape()
					{	
						WebDriverWait wait=new WebDriverWait(driver,5000);
						WebElement element107=wait.until(ExpectedConditions.visibilityOfElementLocated(MINESCAPE_Text));
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
			//Explicit wait for Element SPRYSCHEDULER
				public void WAITINGelementSpryScheduler()
					{	
						WebDriverWait wait=new WebDriverWait(driver,5000);
						WebElement element108=wait.until(ExpectedConditions.visibilityOfElementLocated(SPRYSCHEDULER_Text));
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
			//Explicit wait for Element MCAT
				public void WAITINGelementMcat()
					{	
						WebDriverWait wait=new WebDriverWait(driver,5000);
						WebElement element109=wait.until(ExpectedConditions.visibilityOfElementLocated(MCAT_Text));
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
			//Explicit wait for Element MEDICALSOFTWARE
				public void WAITINGelementMedicalSoftware()
					{	
						WebDriverWait wait=new WebDriverWait(driver,5000);
						WebElement element110=wait.until(ExpectedConditions.visibilityOfElementLocated(MEDICALSOFTWARE_Text));
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
			//Explicit wait for Element HIS
				public void WAITINGelementHIS()
					{	
						WebDriverWait wait=new WebDriverWait(driver,5000);
						WebElement element111=wait.until(ExpectedConditions.visibilityOfElementLocated(HIS_Text));
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
			//Explicit wait for Element PATIENTADMSYSTEM
				public void WAITINGelementPatientAdminSystem()
					{	
						WebDriverWait wait=new WebDriverWait(driver,5000);
						WebElement element112=wait.until(ExpectedConditions.visibilityOfElementLocated(PATIENTADMSYS_Text));
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
			//Explicit wait for Element FINANCEFORHOSPITAL
				public void WAITINGelementFinanceForHospital()
					{	
						WebDriverWait wait=new WebDriverWait(driver,5000);
						WebElement element113=wait.until(ExpectedConditions.visibilityOfElementLocated(FINANCEFORHOSPITAL_Text));
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
			//Explicit wait for Element OCCUPATIONALHEALTH
				public void WAITINGelementOccupationalHealth()
					{	
						WebDriverWait wait=new WebDriverWait(driver,5000);
						WebElement element114=wait.until(ExpectedConditions.visibilityOfElementLocated(OCCUPATIONALHEALTH_Text));
					}	
			//Validate OCCUPATIONALHEALTH-assert
				public void ASSERToccupatinalHealth()
					{
						driver.findElement(OCCUPATIONALHEALTH_Text).isDisplayed();
					}
				
}
