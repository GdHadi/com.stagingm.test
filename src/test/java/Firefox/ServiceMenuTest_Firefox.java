package Firefox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stagingm.com.stagingm.test.ServiceMenu_PO;

public class ServiceMenuTest_Firefox {
	public static WebDriver driver;
	public static ServiceMenu_PO Services;
	
	@BeforeMethod
	public void initiateDriver() {
		System.setProperty("webdriver.gecko.driver","C:\\WebDriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://stagingmitrais.com/en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Services = new ServiceMenu_PO(driver);
	} 
	
	 @AfterMethod
	 public void closeBrowser (){
		 driver.quit(); 
	 };	
		
	//Click on Sub menu Microsoft Windows Applications
		@Test(priority=1,enabled=true)
		public void MicrosoftWindowsAppsMenu() throws InterruptedException
				{	
					Services.CLICKmicrosoftWindowsApps();
					Services.WAITINGmicrosoftWindowsApps();	
					Services.ASSERTmicrosoftWindowsApps();
					
				};
		
		//Click on Sub menu Mobile Services	
		@Test(priority=2,enabled=true)							
		public void MobileServicesMenu() throws InterruptedException
				{
					Services.CLICKmobileServices();
					Services.WAITINGmobileServices();
					Services.ASSERTmobileServices();
					//Thread.sleep(2000);
				};		
		
		//Click on Sub menu Java Technologies
		@Test(priority=3,enabled=true)							
		public void JavaTechnologiesMenu() throws InterruptedException
				{
					Services.CLICKjavaTechnologies();
					Services.WAITINGjavaTechnologies();
					Services.ASSERTjavaTechnologies();
					//Thread.sleep(2000);
				};
		
		//Click on Sub menu Business Intelligence	
		@Test(priority=4,enabled=true)							
		public void BusinessIntelegenceMenu() throws InterruptedException
				{
					Services.CLICKbusinessIntelegence();
					Services.WAITINGbusinessIntelegence();
					Services.ASSERTbusinessIntelegence();
					//Thread.sleep(2000);
				};
						
		//Click on Sub menu Web Front End		
		@Test(priority=5,enabled=true)							
		public void WebFrontEndMenu() throws InterruptedException	
				{
					Services.CLICKwebFrontEnd();
					Services.WAITINGwebFrontEnd();
					Services.ASSERTwebFrontEnd();
					//Thread.sleep(2000);	
				};	
				
		//Click on Sub menu Software Design Tools
		@Test(priority=6,enabled=true)							
		public void SoftwareDesignToolsMenu() throws InterruptedException	
				{		
					Services.CLICKsoftwareDesignTools();
					Services.WAITINGsoftwareDesignTools();
					Services.ASSERTsoftwareDesignTools();
					//Thread.sleep(2000);	
				};
				
		//Click on Sub menu Ruby on Rails Development page	
		@Test(priority=7,enabled=true)
		public void RubyOnRailsDevelopmentMenu() throws InterruptedException	
				{						
					Services.CLICKrubyOnRailsDevelopment();
					Services.WAITINGrubyOnRailsDevelopment();
					Services.ASSERTrubyOnRailsDevelopment();
					//Thread.sleep(2000);	
				};
			
		//Click on Sub menu User Interaction Design
		@Test(priority=8,enabled=true)
		public void UserInteractionDesignMenu() throws InterruptedException	
				{						
					Services.CLICKuserInteractionDesign();
					Services.WAITINGuserInteractionDesign();
					Services.ASSERTuserInteractionDesign();
					//Thread.sleep(2000);
				};
			
		//Click on Sub menu Web Solution
		@Test(priority=9,enabled=true)
		public void WebSolutionMenu() throws InterruptedException	
				{
					Services.CLICKwebSolution();
					Services.WAITINGwebSolution();
					Services.ASSERTwebSolution();
					//Thread.sleep(2000);		
				};
		
		//Click on Sub menu Ellipse
		@Test(priority=10,enabled=true)
		public void EllipseMenu() throws InterruptedException	
				{	
					Services.CLICKellipse();
					Services.WAITINGellipse();
					Services.ASSERTellipse();
					//Thread.sleep(2000);		
				};
				
		//Click on Sub menu Enterprise Integration
		@Test(priority=11,enabled=true)
		public void EnterpriseIntegrationMenu() throws InterruptedException	
				{	
					Services.CLICKenterpriseIntegration();
					Services.WAITINGenterpriseIntegration();
					Services.ASSERTenterpriseIntegration();
					//Thread.sleep(2000);	
				};
		
		//Click on Sub menu Software Quality and Testing	
		@Test(priority=12,enabled=true)
		public void SoftwareQualityAndTestingMenu() throws InterruptedException		
				{
					Services.CLICKsoftwareQualityAndTesting();
					Services.WAITINGsoftwareQualityAndTesting();
					Services.ASSERTsoftwareQualityAndTesting();
					//Thread.sleep(2000);			
				};		
				
		//Click on Sub menu PHP Development
		@Test(priority=13,enabled=true)
		public void PHPDevelopmentMenu() throws InterruptedException		
				{
					Services.CLICKphpDevelopment();
					Services.WAITINGphpDevelopment();
					Services.ASSERTphpDevelopment();
					//Thread.sleep(2000);		
				};
				
		//Click on Sub menu Java script Development
		@Test(priority=14,enabled=true)
		public void JavascriptDevelopmentMenu() throws InterruptedException		
				{
					Services.CLICKjavascriptDevelopment();
					Services.WAITINGjavascriptDevelopment();
					Services.ASSERTjavascriptDevelopment();
					//Thread.sleep(2000);	
				};		
				
		//Click on Sub menu Managed Service
		@Test(priority=15,enabled=true)
		public void ManagedServiceMenu() throws InterruptedException		
				{			
					Services.CLICKmanagedService();
					Services.WAITINGmanagedService();
					Services.ASSERTmanagedService();
					//Thread.sleep(2000);			
				};
		
		//Click on Sub Low Code Development
		@Test(priority=16,enabled=true)
		public void LowCodeDevelopmentMenu() throws InterruptedException		
				{		
					Services.CLICKlowCodeDevelopment();
					Services.WAITINGlowCodeDevelopment();
					Services.ASSERTlowCodeDevelopment();
					//Thread.sleep(2000);		
				};	
		//Click on Sub Low Code Development
		@Test(priority=17,enabled=true)
		public void SoftwareDevelopmentMenu() throws InterruptedException		
				{		
					Services.CLICKsoftwareDevelopment();
					Services.WAITINGsoftwareDevelopment();
					Services.ASSERTsoftwareDevelopment();
					//Thread.sleep(2000);		
				};		
				
}
