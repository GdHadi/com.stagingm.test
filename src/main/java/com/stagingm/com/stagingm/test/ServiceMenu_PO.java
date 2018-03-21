package com.stagingm.com.stagingm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ServiceMenu_PO {
	WebDriver driver;
	By Services_Menu = By.xpath ("//*[@id='menu-item-1299']/a");
	By MicWinApp = By.id("menu-item-1309");
	By Microsoft_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Mob_Serv = By.id("menu-item-1310");
	By Mob_Serv_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Java_Tech = By.id("menu-item-1306");
	By Java_Tech_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Business_Intl = By.id("menu-item-1303");
	By Business_Intl_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Web_FRE = By.id("menu-item-1314");
	By Web_FRE_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Soft_Design = By.id("menu-item-1311");
	By Soft_Design_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Ruby_Rail = By.id("menu-item-1639");
	By Ruby_Rail_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By User_Interact = By.id("menu-item-1313");
	By User_Interact_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Web_Sol = By.id("menu-item-1308");
	By Web_Sol_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Ellipse = By.id("menu-item-1304");
	By Ellipse_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Enterpise_Int = By.id("menu-item-1305");
	By Enterpise_Int_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Soft_Test = By.id("menu-item-1312");
	By Soft_Test_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By PHP_Devp = By.id("menu-item-1625");
	By PHP_Devp_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By JavaSript_Devp = By.id("menu-item-1587");
	By JavaSript_Devp_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Managed_Serv = By.id("menu-item-1307");
	By Managed_Serv_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By LowCode_Devp = By.id("menu-item-1640");
	By LowCode_Devp_Text = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	
	public ServiceMenu_PO(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Hovering mouse on Service and Select
		public void HoverMouseonServices() throws InterruptedException
	{
		WebElement Services = driver.findElement(Services_Menu);
		Actions action1 = new Actions(driver); action1.moveToElement(Services).perform();
		Thread.sleep(2000);
	}
		//Validate MicrosoftWindowsApplications_TEST-actions
			public void CLICKmicrosoftWindowsApps() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(MicWinApp);
				Actions action2 = new Actions(driver); action2.moveToElement(submenu1).click().build().perform();   
				}
		
		//Validate MicrosoftWindowsApplications-assert
				public void ASSERTmicrosoftWindowsApps ()
				{
					driver.findElement(Microsoft_Text).isDisplayed();
				}
		
		//Validate MobileServices_TEST-actions
				public void CLICKmobileServices() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Mob_Serv);
				Actions action3 = new Actions(driver); action3.moveToElement(submenu1).click().build().perform();   
				}
				
		//Validate MicrosoftWindowsApplications-assert
				public void ASSERTmobileServices ()
				{
					driver.findElement(Mob_Serv_Text).isDisplayed();
				}
				
		//Validate JavaTechnologies_TEST_actions
				public void JavaTechnologies() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Java_Tech);
				Actions action17 = new Actions(driver); action17.moveToElement(submenu1).click().build().perform();   
				}
		//Validate JavaTechnologies-assert		
				public void ASSERTjavaTechnologies ()
				{
					driver.findElement(Java_Tech_Text).isDisplayed();
				}
				
		//Validate BusinessInteligence_TEST_actions
				public void CLICKbusinessIntelegence() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Business_Intl);
				Actions action4 = new Actions(driver); action4.moveToElement(submenu1).click().build().perform();   
				}
		//Validate BusinessIntelegence-assert	
				public void ASSERTbusinessIntelegence ()
				{
					driver.findElement(Business_Intl_Text).isDisplayed();
				}
				
		//Validate WebFrontEnd_TEST_actions
				public void CLICKwebFrontEnd() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Web_FRE);
				Actions action5 = new Actions(driver); action5.moveToElement(submenu1).click().build().perform();   
				}
		//Validate WebFrontEnd-assert		
				public void ASSERTwebFrontEnd ()
				{
					driver.findElement(Web_FRE_Text).isDisplayed();
				}
				
		//Validate  SoftwareDesignTools_TEST_actions
				public void CLICKsoftwareDesignTools() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Soft_Design);
				Actions action16 = new Actions(driver); action16.moveToElement(submenu1).click().build().perform();   
				}
		//Validate SoftwareDesignTools-assert
				public void ASSERTsoftwareDesignTools ()
				{
					driver.findElement(Soft_Design_Text).isDisplayed();
				}
				
		//Validate RubyOnRailsDevelopment_TEST_actions
				public void CLICKrubyOnRailsDevelopment() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Ruby_Rail);
				Actions action6 = new Actions(driver); action6.moveToElement(submenu1).click().build().perform();   
				}
		//Validate RubyOnRailsDevelopment-assert		
				public void ASSERTrubyOnRailsDevelopment ()
				{
					driver.findElement(Ruby_Rail_Text).isDisplayed();
				}
				
		//Validate UserInteractionDesign_TEST_actions
				public void CLICKuserInteractionDesign() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(User_Interact);
				Actions action15 = new Actions(driver); action15.moveToElement(submenu1).click().build().perform();   
				}
		//Validate UserInteractionDesign-assert	
				public void ASSERTuserInteractionDesign ()
				{
					driver.findElement(User_Interact_Text).isDisplayed();
				}
				
		//Validate WebSolution_TEST_actions
				public void CLICKwebSolution() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Web_Sol);
				Actions action7 = new Actions(driver); action7.moveToElement(submenu1).click().build().perform();   
				}
		//Validate WebSolution-assert			
				public void ASSERTwebSolution ()
				{
					driver.findElement(Web_Sol_Text).isDisplayed();
				}
				
		//Validate Ellipse_TEST_actions
				public void CLICKellipse() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Ellipse);
				Actions action8 = new Actions(driver); action8.moveToElement(submenu1).click().build().perform();   
				}
		//Validate Ellipse-assert		
				public void ASSERTellipse ()
				{
					driver.findElement(Ellipse_Text).isDisplayed();
				}
				
		//Validate EnterpriseIntegration_TEST_actions
				public void CLICKenterpriseIntegration() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Enterpise_Int);
				Actions action9 = new Actions(driver); action9.moveToElement(submenu1).click().build().perform();   
				}
				
		//Validate EnterpriseIntegration-assert
				public void ASSERTenterpriseIntegration ()
				{
					driver.findElement(Enterpise_Int_Text).isDisplayed();
				}
				
		//Validate SoftwareQualityAndTesting_TEST_actions
				public void CLICKsoftwareQualityAndTesting() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Soft_Test);
				Actions action10 = new Actions(driver); action10.moveToElement(submenu1).click().build().perform();   
				}
		//Validate SoftwareQualityAndTesting-assert		
				public void ASSERTsoftwareQualityAndTesting ()
				{
					driver.findElement(Soft_Test_Text).isDisplayed();
				}
				
		//Validate PHPDevelopment_TEST_actions
				public void CLICKphpDevelopment() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(PHP_Devp);
				Actions action11 = new Actions(driver); action11.moveToElement(submenu1).click().build().perform();   
				}
		//Validate PHPDevelopment-assert		
				public void ASSERTphpDevelopment ()
				{
					driver.findElement(PHP_Devp_Text).isDisplayed();
				}
				
		//Validate JavascriptDevelopment_TEST_actions
				public void CLICKjavascriptDevelopment() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(JavaSript_Devp);
				Actions action12 = new Actions(driver); action12.moveToElement(submenu1).click().build().perform();   
				}
		//Validate JavascriptDevelopment-assert	
				public void ASSERTjavascriptDevelopment()
				{
					driver.findElement(JavaSript_Devp_Text).isDisplayed();
				}
				
		//Validate ManagedService_TEST_actions
				public void CLICKmanagedService() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Managed_Serv);
				Actions action13 = new Actions(driver); action13.moveToElement(submenu1).click().build().perform();   
				}
		//Validate ManagedService-assert		
				public void ASSERTmanagedService()
				{
					driver.findElement(Managed_Serv_Text).isDisplayed();
				}
				
		//Validate LowCodeDevelopment_TEST_actions
				public void CLICKlowCodeDevelopment() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(LowCode_Devp);
				Actions action14 = new Actions(driver); action14.moveToElement(submenu1).click().build().perform();   
				}
		//Validate LowCodeDevelopment-assert				
				public void ASSERTlowCodeDevelopment()
				{
					driver.findElement(Managed_Serv_Text).isDisplayed();
				}
				
}
