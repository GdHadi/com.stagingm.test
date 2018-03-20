package com.stagingm.com.stagingm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Pattern_ServiceMenu {
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
	
	public Pattern_ServiceMenu(WebDriver driver)
	{
		this.driver = driver;
	}
	//public void ServicesMenu()
	//{
	//	driver.findElement(Services_Menu).click();
	//}

	//Hovering mouse on Service and Select
		public void HoverMouseonServices() throws InterruptedException
	{
		WebElement Services = driver.findElement(Services_Menu);
		Actions action1 = new Actions(driver); action1.moveToElement(Services).perform();
		Thread.sleep(2000);
	}
		//Click on Sub menu Microsoft Windows Applications
		public void CallSubmenu1() throws InterruptedException
		{
		HoverMouseonServices();
		WebElement submenu1 = driver.findElement(MicWinApp);
		Actions action2 = new Actions(driver); action2.moveToElement(submenu1).click().build().perform();   
		}
			
		public void AsserMicWinApp ()
		{
			driver.findElement(Microsoft_Text).isDisplayed();
		}
		
		//Click on Sub menu Mobile Services
				public void CallSubmenu2() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Mob_Serv);
				Actions action3 = new Actions(driver); action3.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserMobServ ()
				{
					driver.findElement(Mob_Serv_Text).isDisplayed();
				}
				
				//Click on Sub menu Java Technologies
				public void CallSubmenu3() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Java_Tech);
				Actions action3 = new Actions(driver); action3.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserJavaTech ()
				{
					driver.findElement(Java_Tech_Text).isDisplayed();
				}
				
				//Click on Sub menu Business Inteligent
				public void CallSubmenu4() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Business_Intl);
				Actions action4 = new Actions(driver); action4.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserBusinessIntl ()
				{
					driver.findElement(Business_Intl_Text).isDisplayed();
				}
				
				//Click on Sub menu Web Front End
				public void CallSubmenu5() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Web_FRE);
				Actions action5 = new Actions(driver); action5.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserWebFE ()
				{
					driver.findElement(Web_FRE_Text).isDisplayed();
				}
				
				//Click on Sub menu Software Design Tools
				public void CallSubmenu6() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Soft_Design);
				Actions action5 = new Actions(driver); action5.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserSoftDesign ()
				{
					driver.findElement(Soft_Design_Text).isDisplayed();
				}
				
				//Click on Sub menu Ruby On Rails Development
				public void CallSubmenu7() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Ruby_Rail);
				Actions action6 = new Actions(driver); action6.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserRubyonRail ()
				{
					driver.findElement(Ruby_Rail_Text).isDisplayed();
				}
				
				//Click on Sub menu User Interaction Design
				public void CallSubmenu8() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(User_Interact);
				Actions action6 = new Actions(driver); action6.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserUserInteract ()
				{
					driver.findElement(User_Interact_Text).isDisplayed();
				}
				
				//Click on Sub menu Web Solution
				public void CallSubmenu9() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Web_Sol);
				Actions action7 = new Actions(driver); action7.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserUserWebSol ()
				{
					driver.findElement(Web_Sol_Text).isDisplayed();
				}
				
				//Click on Sub menu Ellipse
				public void CallSubmenu10() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Ellipse);
				Actions action8 = new Actions(driver); action8.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserEllipse ()
				{
					driver.findElement(Ellipse_Text).isDisplayed();
				}
				
				//Click on Sub menu Enterpise Integration
				public void CallSubmenu11() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Enterpise_Int);
				Actions action9 = new Actions(driver); action9.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserEnterpiseInt ()
				{
					driver.findElement(Enterpise_Int_Text).isDisplayed();
				}
				
				//Click on Sub menu Software Quality and Testing
				public void CallSubmenu12() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Soft_Test);
				Actions action10 = new Actions(driver); action10.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserSoftTest ()
				{
					driver.findElement(Soft_Test_Text).isDisplayed();
				}
				
				//Click on Sub menu PHP Development
				public void CallSubmenu13() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(PHP_Devp);
				Actions action11 = new Actions(driver); action11.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserPHPDevp ()
				{
					driver.findElement(PHP_Devp_Text).isDisplayed();
				}
				
				//Click on Sub menu Java script Development
				public void CallSubmenu14() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(JavaSript_Devp);
				Actions action12 = new Actions(driver); action12.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserJavasript ()
				{
					driver.findElement(JavaSript_Devp_Text).isDisplayed();
				}
				
				//Click on Sub menu Managed Service
				public void CallSubmenu15() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(Managed_Serv);
				Actions action13 = new Actions(driver); action13.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserManagedServ ()
				{
					driver.findElement(Managed_Serv_Text).isDisplayed();
				}
				
				//Click on Low Code Development
				public void CallSubmenu16() throws InterruptedException
				{
				HoverMouseonServices();
				WebElement submenu1 = driver.findElement(LowCode_Devp);
				Actions action14 = new Actions(driver); action14.moveToElement(submenu1).click().build().perform();   
				}
				
				public void AsserLowCodeDevp()
				{
					driver.findElement(Managed_Serv_Text).isDisplayed();
				}
				
}
