package Chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stagingm.com.stagingm.test.ProductMenu_PO;
import com.stagingm.com.stagingm.test.SiteMap_PO;

public class SiteMapTest_Chrome {
	public static WebDriver driver;
	public static SiteMap_PO linkmap;
	
	@BeforeMethod
	public void initiateDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://stagingmitrais.com/en/sitemap/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		linkmap = new SiteMap_PO(driver);
	} 
	
	 @AfterMethod
	 public void closeBrowser (){
		 driver.quit(); 
	 };	
	 
	//Click on About Us link text
		@Test(priority=1,enabled=true)
		public void AboutUsLink() throws InterruptedException
			{	
				linkmap.CLICKaboutUs();
				linkmap.WAITINGelementAboutUs();
				linkmap.ASSERTaboutUs();
				Thread.sleep(3000);
			};
				
	//Click on Software Development link text
		@Test(priority=2,enabled=true)
		public void SoftwareDevelopmentLink() throws InterruptedException
			{	
				linkmap.CLICKsoftwareDevelopment();
				linkmap.WAITINGelementSoftwareDevelopment();
				linkmap.ASSERTsoftwareDevelopment();
				Thread.sleep(3000);
			};	
	
	//Click on AMicrosoft Windows Applications link text
		@Test(priority=3,enabled=true)
		public void MicrosoftWindowsApplicationsLink() throws InterruptedException
			{	
				linkmap.CLICKmicrosoftWindowsApplications();
				linkmap.WAITINGelementMicrosoftWindowsApplications();
				linkmap.ASSERTmicrosoftWindowsApplications();
				Thread.sleep(3000);
				};
				
	//Click on Microsoft Web Solutions link text
		@Test(priority=4,enabled=true)
		public void MicrosoftWebSolutionsLink() throws InterruptedException
			{	
				linkmap.CLICKmicrosoftWebSolutions();
				linkmap.WAITINGelementMicrosoftWebSolutions();
				linkmap.ASSERTmicrosoftWebSolutions();
				Thread.sleep(3000);
			};	
			
	//Click on Mobile Services link text
		@Test(priority=5,enabled=true)
		public void MobileServicesLink() throws InterruptedException
			{	
				linkmap.CLICKmobileServices();
				linkmap.WAITINGelementMobileServices();
				linkmap.ASSERTmobileServices();
				Thread.sleep(3000);
			};		
			
	//Click on Ellipse link text
		@Test(priority=6,enabled=true)
		public void EllipseLink() throws InterruptedException
			{	
				linkmap.CLICKellipse();
				linkmap.WAITINGelementEllipse();
				linkmap.ASSERTellipse();
				Thread.sleep(3000);
			};	
}
