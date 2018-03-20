package fireFox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stagingm.com.stagingm.test.Pattern_ServiceMenu;

public class ServiceMenuTest_Firefox {
	@BeforeMethod
	public void initiateDriver() {
		System.setProperty("webdriver.gecko.driver","D:\\MY WORK DOC\\Document dewak\\Automation Testing\\Selenium\\geckodriver.exe");
	} 
	
		
	@Test
	public void AccessServicesMenu() throws InterruptedException
	{
			WebDriver driver=new FirefoxDriver();
			driver.get("https://stagingmitrais.com/en/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			

			//Click on Contact menu Services	
					Pattern_ServiceMenu Services = new Pattern_ServiceMenu(driver);
				//	Services.ServicesMenu();
					
			//Click on Sub menu Microsoft Windows Applications
					Services.CallSubmenu1();
			//Assertion by displaying Microsoft Windows Applications Page	
					Services.AsserMicWinApp();
					Thread.sleep(3000);
								
			//Click on Sub menu Mobile Services
					Services.CallSubmenu2();
			//Assertion by displaying Mobile Services Page	
					Services.AsserMobServ();
					Thread.sleep(3000);
					
			//Click on Sub menu Java Technologies
					Services.CallSubmenu3();
			//Assertion by displaying Java Technologies Page	
					Services.AsserJavaTech();
					Thread.sleep(3000);
					
			//Click on Sub menu Business Intelligence
					Services.CallSubmenu4();
			//Assertion by displaying Business Intelligence Page	
					Services.AsserBusinessIntl();
					Thread.sleep(3000);
					
			//Click on Sub menu Web Front End
					Services.CallSubmenu5();
			//Assertion by displaying Web Front End Page	
					Services.AsserWebFE();
					Thread.sleep(3000);	
					
			//Click on Sub menu Software Design Tools
					Services.CallSubmenu6();
			//Assertion by displaying Software Design Tools Page	
					Services.AsserSoftDesign();
					Thread.sleep(3000);		
					
			//Click on Sub menu Ruby on Rail Development page
					Services.CallSubmenu7();
			//Assertion by displaying Ruby on Rail Development
					Services.AsserRubyonRail();
					Thread.sleep(3000);		
							
			//Click on Sub menu User Interaction Design
					Services.CallSubmenu8();
			//Assertion by displaying User Interaction Design page
					Services.AsserUserInteract();
					Thread.sleep(3000);			
					
			//Click on Sub menu Web Solution
					Services.CallSubmenu9();
			//Assertion by displaying Web Solution page
					Services.AsserUserWebSol();
					Thread.sleep(3000);		
					
			//Click on Sub menu Ellipse
					Services.CallSubmenu10();
			//Assertion by displaying Ellipse page
					Services.AsserEllipse();
					Thread.sleep(3000);		
					
			//Click on Sub menu Eterprise Integration
					Services.CallSubmenu11();
					
			//Assertion by displaying Enterpise Integration page
					Services.AsserEnterpiseInt();
					Thread.sleep(3000);	
			
			//Click on Sub menu Software Quality and Testing
					Services.CallSubmenu12();
			//Assertion by displaying Quality and Testing page
					Services.AsserSoftTest();
					Thread.sleep(3000);			
					
			//Click on Sub menu PHP Development
					Services.CallSubmenu13();
			//Assertion by displaying PHP Development page
					Services.AsserPHPDevp();
					Thread.sleep(3000);		
			
			//Click on Sub menu Java script Development
					Services.CallSubmenu14();
			//Assertion by displaying Java script Development page
					Services.AsserJavasript();
					Thread.sleep(3000);	
					
			//Click on Sub menu Managed Service
					Services.CallSubmenu15();
			//Assertion by displaying Java script Development page
					Services.AsserManagedServ();
					Thread.sleep(3000);			
					
			//Click on Sub Low Code Development
					Services.CallSubmenu16();
			//Assertion by displaying Low Code Development page
					Services.AsserLowCodeDevp();
					Thread.sleep(3000);			
					
					//close browser
					driver.close(); 			
					
	}
}
