package com.stagingm.com.stagingm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SiteMap_PO {
	WebDriver driver;
	By AboutUs_link = By.linkText("About Us");
	By AboutUS_Text = By.xpath("//*[@class='text-white' and contains(text(),'About Us')]");
	By SoftwareDevp_link = By.linkText("Software Development");
	By SoftwareDevp_Text = By.xpath("//*[@class='text-white' and contains(text(),'Software Development Service Provider')]");
	By MicrosoftWindowsApps_link = By.linkText("About Us");
	By MicrosoftWindowsApps_Text = By.xpath("//*[@class='text-white' and contains(text(),'About Us')]");
	By MicrosoftWebSolutions_link = By.linkText("Microsoft Web Solutions");
	By MicrosoftWebSolutions_Text = By.xpath("//*[@class='text-white' and contains(text(),'Microsoft Web Solutions')]");
	By MobileServices_link = By.linkText("Mobile Services");
	By MobileServices_Text = By.xpath("//*[@class='text-white' and contains(text(),'Mobile Services')]");
	By Ellipse_link = By.linkText("Ellipse");
	By Ellipse_Text = By.xpath("//*[@class='text-white' and contains(text(),'Ellipse')]");
	
	
	public SiteMap_PO(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//Validate AboutUs_TEST-actions
		public void CLICKaboutUs ()
			{
				driver.findElement(AboutUs_link).click();
			}
	//Explicit wait for AboutUs
		public void WAITINGelementAboutUs()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element201= wait.until(ExpectedConditions.visibilityOfElementLocated(AboutUS_Text));
			}
	//Validate AboutUs-assert
		public void ASSERTaboutUs ()
			{
				driver.findElement(AboutUS_Text).isDisplayed();
			}
			
	//Validate SoftwareDevelopment_TEST-actions
		public void CLICKsoftwareDevelopment()
			{
				driver.findElement(SoftwareDevp_link).click();
			}
	//Explicit wait for element SoftwareDevelopment
		public void WAITINGelementSoftwareDevelopment()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element202= wait.until(ExpectedConditions.visibilityOfElementLocated(SoftwareDevp_Text));
			}
		//Validate SoftwareDevelopment-assert
			public void ASSERTsoftwareDevelopment ()
			{
				driver.findElement(SoftwareDevp_Text).isDisplayed();
			}
		//Validate MicrosoftWindowsApplications_TEST-actions
			public void CLICKmicrosoftWindowsApplications()
			{
				driver.findElement(MicrosoftWindowsApps_link).click();
			}
		//Explicit wait for element MicrosoftWindowsApplications
			public void WAITINGelementMicrosoftWindowsApplications()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element203= wait.until(ExpectedConditions.visibilityOfElementLocated(MicrosoftWindowsApps_Text));
			}
		//Validate MicrosoftWindowsApplications-assert
			public void ASSERTmicrosoftWindowsApplications ()
			{
				driver.findElement(MicrosoftWindowsApps_Text).isDisplayed();
			}
			
		//Validate MicrosoftWebSolutions_TEST-actions
			public void CLICKmicrosoftWebSolutions()
			{
				driver.findElement(MicrosoftWebSolutions_link).click();
			}
		//Explicit wait for element MicrosoftWebSolutions
			public void WAITINGelementMicrosoftWebSolutions()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element204= wait.until(ExpectedConditions.visibilityOfElementLocated(MicrosoftWebSolutions_Text));
			}
		//Validate MicrosoftWebSolutions-assert
			public void ASSERTmicrosoftWebSolutions()
			{
				driver.findElement(MicrosoftWebSolutions_Text).isDisplayed();
			}
			
		//Validate MobileServices_TEST-actions
			public void CLICKmobileServices()
			{
				driver.findElement(MobileServices_link).click();
			}
		//Explicit wait for element MobileServices
			public void WAITINGelementMobileServices()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element205= wait.until(ExpectedConditions.visibilityOfElementLocated(MobileServices_Text));
			}
		//Validate MobileServices-assert
			public void ASSERTmobileServices()
			{
				driver.findElement(MobileServices_Text).isDisplayed();
			}		

			//Validate Ellipse_TEST-actions
			public void CLICKellipse()
			{
				driver.findElement(Ellipse_link).click();
			}
		//Explicit wait for elementEllipse
			public void WAITINGelementEllipse()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element206= wait.until(ExpectedConditions.visibilityOfElementLocated(Ellipse_Text));
			}
		//Validate Ellipse-assert
			public void ASSERTellipse()
			{
				driver.findElement(Ellipse_Text).isDisplayed();
			}	
}
