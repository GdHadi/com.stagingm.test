package com.stagingm.com.stagingm.test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagePattern_Chrome {
	WebDriver driver;
	By ContactUs_btn = By.xpath("//*[@id='el-a4311d0c']/a");
	By Locate_Us = By.id("contact-locate-us");
	By Mitrais_Logo = By.xpath("/html/body/div[2]/nav/div/div[1]/div[1]/a/img[1]::following-sibling[div@]");
	By LearnMore1 = By.xpath("//*[@id='el-020c24c2']/a");
	By About_Us = By.className("text-white");
	
	
	public HomePagePattern_Chrome(WebDriver driver) {
				this.driver = driver;
	}
	public void ContactUsBtn(){
		driver.findElement(ContactUs_btn).click();
	}
	
	public void Assrt1() {
		Assert.assertTrue(driver.findElement(Locate_Us).isDisplayed());
	}
	
	public void HomeMitrais() {
		driver.findElement(Mitrais_Logo).click();
	}
	
	public void LearnMore_AboutUS(){
	driver.findElement(LearnMore1).click();
	}
	
	public void Assrt2(){
		driver.findElement(About_Us).isDisplayed();
		}
	
}
