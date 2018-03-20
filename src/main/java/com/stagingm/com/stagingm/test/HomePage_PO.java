package com.stagingm.com.stagingm.test;
//import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage_PO {
	WebDriver driver;
	
	//Elements
	By ContactUs_btn = By.xpath("//*[@id='el-a4311d0c']/a");
	By Contact_Us = By.xpath("//*[@id='el-598d5239']/h1");
	By Mitrais_Logo = By.xpath("/html/body/div[2]/nav/div/div[1]/div[1]/a/img[1]::following-sibling[div@]");
	By LearnMore1 = By.xpath("//*[@id='el-020c24c2']/a");
	By About_Us = By.className("text-white");
	By AboutUsLink = By.xpath("//*[@id='menu-item-1295']/a");
	By AboutUsTitle = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	By Service = By.xpath("//*[@id='menu-item-1299']/a");
	By softDevLink = By.xpath("//*[@id='menu-item-1301']/a");
	By softDevTitle = By.xpath("/html/body/div[3]/header/div[2]/div/div/h1");
	
	//HomePageTest_Chrome-actions
	public HomePage_PO(WebDriver driver) {
				this.driver = driver;
	}
	public void ContactUsBtn(){
		driver.findElement(ContactUs_btn).click();
	}
	//HomePageTest_Chrome-assert
	public void Assrt1() {
		Assert.assertTrue(driver.findElement(Contact_Us).isDisplayed());
	}

	//ValidateHomepageLink_TEST-actions
	public void CLICKaboutUsLink (){
	driver.findElement(AboutUsLink).click();
	}
	public void HOVERserviceCLICKsoftDevLink (){
	Actions builder = new Actions (driver);
	builder.moveToElement(driver.findElement(Service)).perform();
	driver.findElement(softDevLink).click();
	}
	//ValidateHomepageLink_TEST-assert
	public void ASSERTaboutUsLink(){
	Assert.assertTrue(driver.findElement(AboutUsTitle).isDisplayed());			
	}
	public void ASSERTserviceSofDev(){
	Assert.assertTrue(driver.findElement(softDevTitle).isDisplayed());	
	}
	
}