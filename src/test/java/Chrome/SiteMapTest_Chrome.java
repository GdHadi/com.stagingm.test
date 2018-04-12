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
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
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
			
	//Click on Java Technologies link text
		@Test(priority=7,enabled=true)
		public void JavaTechLink() throws InterruptedException
			{	
				linkmap.CLICKJavaTechnologies();
				linkmap.WAITINGelementJavaTechnologies();
				linkmap.ASSERTJavaTechnologies();
				Thread.sleep(3000);
			};
			
	//Click on Enterprise Intergration link text
		@Test(priority=8,enabled=true)
		public void EnterpriseIntergrationLink() throws InterruptedException
			{	
				linkmap.CLICKEnterpriseIntergration();
				linkmap.WAITINGEnterpriseIntergration();
				linkmap.ASSERTEnterpriseIntergration();
				Thread.sleep(3000);
			};
			
	//Click on Business Intelegence link text
		@Test(priority=9,enabled=true)
		public void BusinessIntelegenceLink() throws InterruptedException
			{	
				linkmap.CLICKBusinessIntelegence();
				linkmap.WAITINGBusinessIntelegence();
				linkmap.ASSERTBusinessIntelegence();
				Thread.sleep(3000);
			};
			
	//Click on Software Quality and Testing link text
		@Test(priority=10,enabled=true)
		public void SoftwareQualityandTestingLink() throws InterruptedException
			{	
				linkmap.CLICKSoftwareQualityandTesting();
				linkmap.WAITINGSoftwareQualityandTesting();
				linkmap.ASSERTSoftwareQualityandTesting();
				Thread.sleep(3000);
			};	
			
	//Click on Web Front-End link text
		@Test(priority=11,enabled=true)
		public void WebFrontEndLink() throws InterruptedException
			{	
				linkmap.CLICKWebFrontEnd();
				linkmap.WAITINGWebFrontEnd();
				linkmap.ASSERTWebFrontEnd();
				Thread.sleep(3000);
			};	
		
	//Click on PHP Development link text
		@Test(priority=12,enabled=true)
		public void PHPDevelopmentLink() throws InterruptedException
			{	
				linkmap.CLICKPHPDevelopment();
				linkmap.WAITINGPHPDevelopment();
				linkmap.ASSERTPHPDevelopment();
				Thread.sleep(3000);
			};
			
	//Click on Software Design Tools link text
		@Test(priority=13,enabled=true)
		public void SoftwareDesignToolsLink() throws InterruptedException
			{	
				linkmap.CLICKSoftwareDesignTools();
				linkmap.WAITINGSoftwareDesignTools();
				linkmap.ASSERTSoftwareDesignTools();
				Thread.sleep(3000);
			};	
			
		//Click on Java Script App Development link text			
			@Test(priority=14,enabled=true)		
			public void JavaScriptAppDevelopmentLink() throws InterruptedException		
				{	
					linkmap.CLICKJavaScriptAppDevelopment();
					linkmap.WAITINGJavaScriptAppDevelopment();
					linkmap.ASSERTJavaScriptAppDevelopment();
				};
			
		//Click on Ruby On Rail link text			
			@Test(priority=15,enabled=true)		
			public void RubyOnRailLink() throws InterruptedException		
				{	
					linkmap.CLICKRubyOnRail();
					linkmap.WAITINGRubyOnRail();
					linkmap.ASSERTRubyOnRail();
				};	

		//Click on ManagedServices link text			
			@Test(priority=16,enabled=true)		
			public void ManagedServicesLink() throws InterruptedException		
				{	
					linkmap.CLICKManagedServices();
					linkmap.WAITINGManagedServices();
					linkmap.ASSERTManagedServices();
				};	
	
		//Click on UserInteractionDesign link text			
			@Test(priority=17,enabled=true)		
			public void UserInteractionDesignLink() throws InterruptedException		
				{	
					linkmap.CLICKUserInteractionDesign();
					linkmap.WAITINGUserInteractionDesign();
					linkmap.ASSERTUserInteractionDesign();
				};	
		
		//Click on LowCodeDevelopment link text			
			@Test(priority=18,enabled=true)		
			public void LowCodeDevelopmentLink() throws InterruptedException		
				{	
					linkmap.CLICKLowCodeDevelopment();
					linkmap.WAITINGLowCodeDevelopment();
					linkmap.ASSERTLowCodeDevelopment();
				};	
				
	//Click on MiningSoftware link text			
		@Test(priority=19,enabled=true)		
		public void MiningSoftwareLink() throws InterruptedException		
				{	
					linkmap.CLICKMiningSoftware();
					linkmap.WAITINGMiningSoftware();
					linkmap.ASSERTMiningSoftware();
				};

	//Click on CCLAS link text			
		@Test(priority=20,enabled=true)		
		public void CCLASLink() throws InterruptedException		
				{	
					linkmap.CLICKCCLAS();
					linkmap.WAITINGCCLAS();
					linkmap.ASSERTCCLAS();
				};	
				
	//Click on Classic link text			
		@Test(priority=21,enabled=true)		
		public void ClassicLink() throws InterruptedException		
				{	
					linkmap.CLICKClassic();
					linkmap.WAITINGClassic();
					linkmap.ASSERTClassic();
				};	
			
	//Click on Ellipse2 link text			
		@Test(priority=22,enabled=true)		
		public void Ellipse2Link() throws InterruptedException		
				{	
					linkmap.CLICKEllipse2();
					linkmap.WAITINGEllipse2();
					linkmap.ASSERTEllipse2();
				};	
				
	//Click on LinkOne link text			
		@Test(priority=23,enabled=true)		
		public void LinkOneLink() throws InterruptedException		
				{	
					linkmap.CLICKLinkOne();
					linkmap.WAITINGLinkOne();
					linkmap.ASSERTLinkOne();
				};	
	//Click on MineMarket link text			
		@Test(priority=24,enabled=true)		
		public void MineMarketLink() throws InterruptedException		
				{	
					linkmap.CLICKMineMarket();
					linkmap.WAITINGMineMarket();
					linkmap.ASSERTMineMarket();
				};	
	//Click on MineSpace link text			
		@Test(priority=25,enabled=true)		
		public void MineScapeLink() throws InterruptedException		
				{	
					linkmap.CLICKMineScape();
					linkmap.WAITINGMineScape();
					linkmap.ASSERTMineScape();
				};	
	
	//Click on MCat link text			
		@Test(priority=26,enabled=true)		
		public void MCatLink() throws InterruptedException		
				{	
					linkmap.CLICKMCat();
					linkmap.WAITINGMCat();
					linkmap.ASSERTMCat();
				};	
	
	//Click on SPRY Scheduler link text			
		@Test(priority=27,enabled=true)		
		public void SPRYSchedulerLink() throws InterruptedException		
				{	
					linkmap.CLICKSPRYScheduler();
					linkmap.WAITINGSPRYScheduler();
					linkmap.ASSERTSPRYScheduler();
				};	

	//Click on Medical Software link text			
		@Test(priority=28,enabled=true)		
		public void MedicalSoftwareLink() throws InterruptedException		
				{	
					linkmap.CLICKMedicalSoftware();
					linkmap.WAITINGMedicalSoftware();
					linkmap.ASSERTMedicalSoftware();
				};
	
	//Click on Hospital Information System link text			
		@Test(priority=29,enabled=true)		
		public void HospitalInformationSystemLink() throws InterruptedException		
			{	
				linkmap.CLICKHospitalInformationSystem();
				linkmap.WAITINGHospitalInformationSystem();
				linkmap.ASSERTHospitalInformationSystem();
			};	
	
	//Click on Patient Administration System link text			
		@Test(priority=30,enabled=true)		
		public void PatientAdministrationSystemLink() throws InterruptedException		
			{	
				linkmap.CLICKPatientAdministrationSystem();
				linkmap.WAITINGPatientAdministrationSystem();
				linkmap.ASSERTPatientAdministrationSystem();
			};	
	
	//Click on Finance Software For Hospitals link text			
		@Test(priority=31,enabled=true)		
		public void FinanceSoftwareForHospitalsLink() throws InterruptedException		
			{	
				linkmap.CLICKFinanceSoftwareForHospitals();
				linkmap.WAITINGFinanceSoftwareForHospitals();
				linkmap.ASSERTFinanceSoftwareForHospitals();
	};	

	//Click on Occupational HealthSafety System link text			
		@Test(priority=32,enabled=true)		
		public void OccupationalHealthSafetySystemLink() throws InterruptedException		
			{	
				linkmap.CLICKOccupationalHealthSafetySystem();
				linkmap.WAITINGOccupationalHealthSafetySystem();
				linkmap.ASSERTOccupationalHealthSafetySystem();
			};	

	//Click on Team link text			
		@Test(priority=33,enabled=true)		
		public void TeamLink() throws InterruptedException		
			{	
				linkmap.CLICKTeam();
				linkmap.WAITINGTeam();
				linkmap.ASSERTTeam();
			};	
	
	//Click on Software Development Newsletter link text			
		@Test(priority=34,enabled=true)		
		public void SoftwareDevelopmentNewsletterLink() throws InterruptedException		
			{	
				linkmap.CLICKSoftwareDevelopmentNewsletter();
				linkmap.WAITINGSoftwareDevelopmentNewsletter();
				linkmap.ASSERTSoftwareDevelopmentNewsletter();
			};	
	
	//Click on Mining Newsletter link text			
		@Test(priority=35,enabled=true)		
		public void MiningNewsletterLink() throws InterruptedException		
			{	
				linkmap.CLICKMiningNewsletter();
				linkmap.WAITINGMiningNewsletter();
				linkmap.ASSERTMiningNewsletter();
			};	

	//Click on SeputarMedisIndonesia link text			
		@Test(priority=36,enabled=true)		
		public void SeputarMedisIndonesiaLink() throws InterruptedException		
			{	
				linkmap.CLICKSeputarMedisIndonesia();
				linkmap.WAITINGSeputarMedisIndonesia();
				linkmap.ASSERTSeputarMedisIndonesia();
			};	
	
	//Click on Careers link text			
		@Test(priority=37,enabled=true)		
		public void CareersLink() throws InterruptedException		
			{	
				linkmap.CLICKCareers();
				linkmap.WAITINGCareers();
				//linkmap.ASSERTCareers();
			};	

	//Click on Blog link text			
		@Test(priority=38,enabled=true)		
		public void BlogLink() throws InterruptedException		
			{	
				linkmap.CLICKBlog();
				linkmap.WAITINGBlog();
				linkmap.ASSERTBlog();
			};	

	//Click on ContactUs link text			
		@Test(priority=39,enabled=true)		
		public void ContactUsLink() throws InterruptedException		
			{	
				linkmap.CLICKContactUs();
				linkmap.WAITINGContactUs();
				linkmap.ASSERTContactUs();
			};
			
	//Click on MitraisPrivacyPolicy link text			
		@Test(priority=40,enabled=true)		
		public void MitraisPrivacyPolicyLink() throws InterruptedException		
			{	
				linkmap.CLICKMitraisPrivacyPolicy();
				linkmap.WAITINGMitraisPrivacyPolicy();
				linkmap.ASSERTMitraisPrivacyPolicy();
			};
			
	//Click on FrequentlyAskedQuestions link text			
		@Test(priority=41,enabled=true)		
		public void FrequentlyAskedQuestionsLink() throws InterruptedException		
			{	
				linkmap.CLICKFrequentlyAskedQuestions();
				linkmap.WAITINGFrequentlyAskedQuestions();
				linkmap.ASSERTFrequentlyAskedQuestions();
			};	

	
}
