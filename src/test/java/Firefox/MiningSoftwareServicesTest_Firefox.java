package Firefox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stagingm.com.stagingm.test.MiningSoftwareServices_PO;

public class MiningSoftwareServicesTest_Firefox {

	public static WebDriver driver;
	public static MiningSoftwareServices_PO miningsoft;
	
	@BeforeMethod
	public void initiateDriver() {
		System.setProperty("webdriver.gecko.driver","C:\\WebDriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://stagingmitrais.com/en/miningsoftware/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		miningsoft = new MiningSoftwareServices_PO(driver);
	} 
	
	 @AfterMethod
	 public void closeBrowser (){
		 driver.quit(); 
	 };	
	 
	//Click on CCLAS icon text
		@Test(priority=1,enabled=true)
		public void CCLASicon() throws InterruptedException
			{	
				miningsoft.CLICKCCLAS_icon();
				miningsoft.WAITINGelementCCLAS();
				miningsoft.ASSERTCCLAS();
				Thread.sleep(2000);
			};

	//Click on Classic icon			
		@Test(priority=2,enabled=true)		
		public void Classic_icon() throws InterruptedException		
			{	
				miningsoft.CLICKClassic_icon();
				miningsoft.WAITINGelementClassic();
				miningsoft.ASSERTClassic();
				Thread.sleep(2000);
			};	

	//Click on Ellipse icon			
		@Test(priority=3,enabled=true)		
		public void Ellipse_icon() throws InterruptedException		
			{	
				miningsoft.CLICKEllipse_icon();
				miningsoft.WAITINGelementEllipse();
				miningsoft.ASSERTEllipse();
				Thread.sleep(2000);
			};	

	//Click on LinkOne icon			
		@Test(priority=4,enabled=true)		
		public void LinkOne_icon() throws InterruptedException		
			{	
				miningsoft.CLICKLinkOne_icon();
				miningsoft.WAITINGelementLinkOne();
				miningsoft.ASSERTLinkOne();
				Thread.sleep(2000);
			};	

	//Click on MineMarket icon			
		@Test(priority=5,enabled=true)		
		public void MineMarket_icon() throws InterruptedException		
			{	
				miningsoft.CLICKMineMarket_icon();
				miningsoft.WAITINGelementMineMarket();
				miningsoft.ASSERTMineMarket();
				Thread.sleep(2000);
			};	
	
	//Click on MineScape icon			
		@Test(priority=6,enabled=true)		
		public void MineScape_icon() throws InterruptedException		
			{	
				miningsoft.CLICKMineScape_icon();
				miningsoft.WAITINGelementMineScape();
				miningsoft.ASSERTMineScape();
				Thread.sleep(2000);
			};	

	//Click on SpryScheduler icon			
		@Test(priority=7,enabled=true)		
		public void SpryScheduler_icon() throws InterruptedException		
			{	
				miningsoft.CLICKSpryScheduler_icon();
				miningsoft.WAITINGelementSpryScheduler();
				miningsoft.ASSERTSpryScheduler();
				Thread.sleep(2000);
			};	

	//Click on MCat icon			
		@Test(priority=8,enabled=true)		
		public void MCat_icon() throws InterruptedException		
			{	
				miningsoft.CLICKMCat_icon();
				miningsoft.WAITINGelementMCat();
				miningsoft.ASSERTMCat();
				Thread.sleep(2000);
			};	
}
