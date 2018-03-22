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
		@Test(priority=1,enabled=false)
		public void MiningSoftwareMenu() throws InterruptedException
				{	
					Products.CLICKminingSoftware();
					Products.WAITINGelementMiningSoftware();
					Products.ASSERTminingSoftware();
						
				};	
	 
	//Click on Sub menu CCLAS
		@Test(priority=2,enabled=false)
		public void CCLASMenu() throws InterruptedException
				{	
					Products.CLICKcclas();
					Products.WAITINGelementCCLAS();
					Products.ASSERTcclas();
				};
				
	//Click on Sub menu CLASIC
		@Test(priority=3,enabled=false)
		public void CLASICMenu() throws InterruptedException
				{	
					Products.CLICKclasic();
					Products.WAITINGelementCLASIC();
					Products.ASSERTclasic();
				};
				
	//Click on Sub menu ELLIPSE
		@Test(priority=4,enabled=false)
		public void ELLIPSEMenu() throws InterruptedException
				{	
					Products.CLICKellipse();
					Products.WAITINGelementEllipse();
					Products.ASSERTellipse();
				};	
				
	//Click on Sub menu LINKONE
		@Test(priority=5,enabled=false)
		public void LINKONEMenu() throws InterruptedException
				{	
					Products.CLICKlinkOne();
					Products.WAITINGelementLinkOne();
					Products.ASSERTlinkOne();
				};
				
	//Click on Sub menu MINEMARKET
		@Test(priority=6,enabled=false)
		public void MINEMARKETMenu() throws InterruptedException
				{
					Products.CLICKmineMarket();
					Products.WAITINGelementMinemarket();
					Products.ASSERTmineMarket();
				};	
							
	//Click on Sub menu MINESCAPE
		@Test(priority=7,enabled=false)
		public void MINESCAPEMenu() throws InterruptedException
				{
					Products.CLICKmineScape();
					Products.WAITINGelementMinescape();
					Products.ASSERTmineScape();
				};	
				
	//Click on Sub menu SPRYSCHEDULER
		@Test(priority=8,enabled=false)
		public void SPRYSCHEDULERMenu() throws InterruptedException
				{
					Products.CLICKspryScheduler();
					Products.WAITINGelementSpryScheduler();
					Products.ASSERTspryScheduler();
				};	
										
	//Click on Sub menu MCAT
		@Test(priority=9,enabled=false)
		public void MCATMenu() throws InterruptedException
				{
					Products.CLICKmCat();
					Products.WAITINGelementMcat();
					Products.ASSERTmCat();
				};			
							
	//Click on Sub menu MEDICAL SOFTWARE
		@Test(priority=10,enabled=false)
		public void MEDICALSOFTWAREMenu() throws InterruptedException
				{
					Products.CLICKmedicalSoftware();
					Products.WAITINGelementMedicalSoftware();
					Products.ASSERTmedicalSoftware();
				};
				
	//Click on Sub menu Hospital Information System
		@Test(priority=11,enabled=true)
		public void HISMenu() throws InterruptedException
				{
					Products.CLICKhis();
					Products.WAITINGelementHIS();
					Products.ASSERThis();
				};
							
	//Click on Sub menu PATIENT ADMIN SYSTEM
		@Test(priority=12,enabled=false)
		public void PATIENTADMINSYSTEMMenu() throws InterruptedException
				{
					Products.CLICKpatientAdminSystem();
					Products.WAITINGelementPatientAdminSystem();
					Products.ASSERTpatientAdminSystem();
				};
													
	//Click on Sub menu FINANCE FOR HOSPITAL
		@Test(priority=13,enabled=false)
		public void FINANCEFORHOSPITALMenu() throws InterruptedException
				{
					Products.CLICKfinanceForHospital();
					Products.WAITINGelementFinanceForHospital();
					Products.ASSERTfinanceForHospital();
				};	
							
	//Click on Sub menu FINANCE FOR HOSPITAL
		@Test(priority=14,enabled=false)
		public void OCCUPATIONALHEALTHMenu() throws InterruptedException
				{
					Products.CLICKoccupatinalHealth();
					Products.WAITINGelementOccupationalHealth();
					Products.ASSERToccupatinalHealth();
				};			
}
