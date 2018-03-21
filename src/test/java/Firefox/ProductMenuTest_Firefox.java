package Firefox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stagingm.com.stagingm.test.ProductMenu_PO;

public class ProductMenuTest_Firefox {

	public static WebDriver driver;
	public static ProductMenu_PO Products;
	
	@BeforeMethod
	public void initiateDriver() {
		System.setProperty("webdriver.gecko.driver","C:\\WebDriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://stagingmitrais.com/en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Products = new ProductMenu_PO(driver);
	} 
	
	 @AfterMethod
	 public void closeBrowser (){
		 driver.close(); 
	 };	
	 
	//Click on Sub menu Mining Software
			@Test(priority=1)
			public void MiningSoftwareMenu() throws InterruptedException
					{	
						Products.CLICKminingSoftware();
						Thread.sleep(5000);
						Products.ASSERTminingSoftware();
						
					};
					
	 
	//Click on Sub menu CCLAS
		@Test(priority=2)
		public void CCLASMenu() throws InterruptedException
				{	
					Products.CLICKcclas();
					Thread.sleep(5000);
					Products.ASSERTcclas();
				};
				
				//Click on Sub menu CLASIC
				@Test(priority=3)
				public void CLASICMenu() throws InterruptedException
							{	
								Products.CLICKclasic();
								Products.ASSERTclasic();
							};
				//Click on Sub menu ELLIPSE
				@Test(priority=4)
				public void ELLIPSEMenu() throws InterruptedException
							{	
								Products.CLICKellipse();
								Products.ASSERTellipse();
							};	
				
				//Click on Sub menu LINKONE
				@Test(priority=5)
				public void LINKONEMenu() throws InterruptedException
							{	
								Products.CLICKlinkOne();
								Products.ASSERTlinkOne();
							};
				//Click on Sub menu MINEMARKET
				@Test(priority=6)
				public void MINEMARKETMenu() throws InterruptedException
							{
								Products.CLICKmineMarket();
								Products.ASSERTmineMarket();
							};	
							
				//Click on Sub menu MINESCAPE
				@Test(priority=7)
				public void MINESCAPEMenu() throws InterruptedException
							{
								Products.CLICKmineScape();
								Products.ASSERTmineScape();
							};	
				
				//Click on Sub menu SPRYSCHEDULER
				@Test(priority=8)
				public void SPRYSCHEDULERMenu() throws InterruptedException
							{
								Products.CLICKspryScheduler();
								Products.ASSERTspryScheduler();
							};	
										
				//Click on Sub menu MCAT
				@Test(priority=9)
				public void MCATMenu() throws InterruptedException
							{
								Products.CLICKmCat();
								Products.ASSERTmCat();
							};			
							
				//Click on Sub menu MEDICAL SOFTWARE
				@Test(priority=10)
				public void MEDICALSOFTWAREMenu() throws InterruptedException
							{
								Products.CLICKmedicalSoftware();
								Products.ASSERTmedicalSoftware();
							};
				
				//Click on Sub menu Hospital Information System
				@Test(priority=11)
				public void HISMenu() throws InterruptedException
							{
								Products.CLICKhis();
								Products.ASSERThis();
							};
							

				//Click on Sub menu PATIENT ADMIN SYSTEM
				@Test(priority=12)
				public void PATIENTADMINSYSTEMMenu() throws InterruptedException
							{
								Products.CLICKpatientAdminSystem();
								Products.ASSERTpatientAdminSystem();
							};
													
				//Click on Sub menu FINANCE FOR HOSPITAL
				@Test(priority=13)
				public void FINANCEFORHOSPITALMenu() throws InterruptedException
							{
								Products.CLICKfinanceForHospital();
								Products.ASSERTfinanceForHospital();
							};	
							
				//Click on Sub menu FINANCE FOR HOSPITAL
				@Test(priority=14)
				public void OCCUPATIONALHEALTHMenu() throws InterruptedException
							{
								Products.CLICKoccupatinalHealth();
								Products.ASSERToccupatinalHealth();
							};			
}
