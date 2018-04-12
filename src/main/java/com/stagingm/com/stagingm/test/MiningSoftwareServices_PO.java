package com.stagingm.com.stagingm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiningSoftwareServices_PO {
	WebDriver driver;
	By CCLAS_icon = By.xpath("//*[@id='el-ef4aa1b2']/div/div[1]/a/div");
	By CCLAS_Text = By.xpath("//*[@class='text-white' and contains(text(),'CCLAS')]");
	By Classic_icon = By.xpath("//*[@id='el-ef4aa1b2']/div/div[2]/a/div");
	By Classic_Text = By.xpath("//*[@class='text-white' and contains(text(),'Classic')]");
	By Ellipse_icon = By.xpath("//*[@id='el-ef4aa1b2']/div/div[3]/a/div");
	By Ellipse_Text = By.xpath("//*[@class='text-white' and contains(text(),'Ellipse')]");
	By LinkOne_icon = By.xpath("//*[@id='el-ef4aa1b2']/div/div[4]/a/div");
	By LinkOne_Text = By.xpath("//*[@class='text-white' and contains(text(),'LinkOne')]");
	By MineMarket_icon = By.xpath("//*[@id='el-ef4aa1b2']/div/div[5]/a/div");
	By MineMarket_Text = By.xpath("//*[@class='text-white' and contains(text(),'MineMarket')]");
	By MineScape_icon = By.xpath("//*[@id='el-ef4aa1b2']/div/div[6]/a/div");
	By MineScape_Text = By.xpath("//*[@class='text-white' and contains(text(),'MineScape')]");
	By SpryScheduler_icon = By.xpath("//*[@id='el-ef4aa1b2']/div/div[7]/a/div");
	By SpryScheduler_Text = By.xpath("//*[@class='text-white' and contains(text(),'Spry Scheduler')]");
	By MCat_icon = By.xpath("//*[@id='el-ef4aa1b2']/div/div[8]/a/div");
	By MCat_Text = By.xpath("//*[@class='text-white' and contains(text(),'MCat')]");



public MiningSoftwareServices_PO(WebDriver driver)
	{
		this.driver = driver;
	}

//Validate CCLASS_TEST-actions
		public void CLICKCCLAS_icon ()
			{
				driver.findElement(CCLAS_icon).click();
			}
	//Explicit wait for AboutUs
		public void WAITINGelementCCLAS()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element301= wait.until(ExpectedConditions.visibilityOfElementLocated(CCLAS_Text));
			}
	//Validate CCLAS-assert
		public void ASSERTCCLAS ()
			{
				driver.findElement(CCLAS_Text).isDisplayed();
			}

	//Validate Classic_icon_TEST-actions		
		public void CLICKClassic_icon()		
			{	
				driver.findElement(Classic_icon).click();
			}	
	//Explicit wait for element Classic		
		public void WAITINGelementClassic()		
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element302= wait.until(ExpectedConditions.visibilityOfElementLocated(Classic_Text));
			}	
				
	//Validate Classic-assert		
		public void ASSERTClassic()
			{	
				driver.findElement(Classic_Text).isDisplayed();
			}	
	//Validate Ellipse_icon_TEST-actions		
		public void CLICKEllipse_icon()		
			{	
				driver.findElement(Ellipse_icon).click();
			}	
	//Explicit wait for element Ellipse		
		public void WAITINGelementEllipse()		
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element303= wait.until(ExpectedConditions.visibilityOfElementLocated(Ellipse_Text));
			}	
				
	//Validate Ellipse-assert		
		public void ASSERTEllipse()
			{	
				driver.findElement(Ellipse_Text).isDisplayed();
			}	
	//Validate LinkOne_icon_TEST-actions		
		public void CLICKLinkOne_icon()		
			{	
				driver.findElement(LinkOne_icon).click();
			}	
	//Explicit wait for element LinkOne		
		public void WAITINGelementLinkOne()		
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element304= wait.until(ExpectedConditions.visibilityOfElementLocated(LinkOne_Text));
			}	
				
	//Validate LinkOne-assert		
		public void ASSERTLinkOne()
			{	
				driver.findElement(LinkOne_Text).isDisplayed();
			}	

	//Validate MineMarket_icon_TEST-actions		
		public void CLICKMineMarket_icon()		
			{	
				driver.findElement(MineMarket_icon).click();
			}	
	//Explicit wait for element MineMarket		
		public void WAITINGelementMineMarket()		
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element305= wait.until(ExpectedConditions.visibilityOfElementLocated(MineMarket_Text));
			}	
				
	//Validate MineMarket-assert		
		public void ASSERTMineMarket()
			{	
				driver.findElement(MineMarket_Text).isDisplayed();
			}	
	
	//Validate MineScape_icon_TEST-actions		
		public void CLICKMineScape_icon()		
			{	
				driver.findElement(MineScape_icon).click();
			}	
	//Explicit wait for element MineScape		
		public void WAITINGelementMineScape()		
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element306= wait.until(ExpectedConditions.visibilityOfElementLocated(MineScape_Text));
			}	
	//Validate MineScape-assert		
		public void ASSERTMineScape()
			{	
				driver.findElement(MineScape_Text).isDisplayed();
			}	

	//Validate SpryScheduler_icon_TEST-actions		
		public void CLICKSpryScheduler_icon()		
			{	
				driver.findElement(SpryScheduler_icon).click();
			}	
	//Explicit wait for element SpryScheduler		
		public void WAITINGelementSpryScheduler()		
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element307= wait.until(ExpectedConditions.visibilityOfElementLocated(SpryScheduler_Text));
			}	
				
	//Validate SpryScheduler-assert		
		public void ASSERTSpryScheduler()
			{	
				driver.findElement(SpryScheduler_Text).isDisplayed();
			}	

	//Validate MCat_icon_TEST-actions		
		public void CLICKMCat_icon()		
			{	
				driver.findElement(MCat_icon).click();
			}	
	//Explicit wait for element MCat		
		public void WAITINGelementMCat()		
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element308= wait.until(ExpectedConditions.visibilityOfElementLocated(MCat_Text));
			}	
				
	//Validate MCat-assert		
		public void ASSERTMCat()
			{	
				driver.findElement(MCat_Text).isDisplayed();
			}	

			
}