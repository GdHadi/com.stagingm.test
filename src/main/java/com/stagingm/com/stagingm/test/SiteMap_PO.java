package com.stagingm.com.stagingm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SiteMap_PO {
	WebDriver driver;
	By AboutUs_link = By.linkText("About Us");
	By AboutUS_Text = By.xpath("//*[@class='text-white' and contains(text(),'About Us')]");
	By SoftwareDevp_link = By.linkText("Software Development");
	By SoftwareDevp_Text = By.xpath("//*[@class='text-white' and contains(text(),'Software Development Service Provider')]");
	By MicrosoftWindowsApps_link = By.linkText("Microsoft Windows Applications");
	By MicrosoftWindowsApps_Text = By.xpath("//*[@class='text-white' and contains(text(),'Microsoft Windows Apps')]");
	By MicrosoftWebSolutions_link = By.linkText("Microsoft Web Solutions");
	By MicrosoftWebSolutions_Text = By.xpath("//*[@class='text-white' and contains(text(),'Microsoft Web Solutions')]");
	By MobileServices_link = By.linkText("Mobile Services");
	By MobileServices_Text = By.xpath("//*[@class='text-white' and contains(text(),'Mobile Services')]");
	By Ellipse_link = By.linkText("Ellipse");
	By Ellipse_Text = By.xpath("//*[@class='text-white' and contains(text(),'Ellipse')]");
	By JavaTech_link = By.linkText("Java Technologies");
	By JavaTech_Text = By.xpath("//*[@class='text-white' and contains(text(),'Java Technologies')]");
	By EnterpiseInt_link = By.linkText("Enterprise Integration");
	By EnterpiseInt_Text = By.xpath("//*[@class='text-white' and contains(text(),'Enterprise Integration')]");
	By BusinessIntl_link = By.linkText("Business Intelligence");
	By BusinessIntl_Text = By.xpath("//*[@class='text-white' and contains(text(),'Business Intelligence')]");
	By SoftwareTest_link = By.linkText("Software Quality and Testing");
	By SoftwareTest_Text = By.xpath("//*[@class='text-white' and contains(text(),'Software Quality and Testing')]");
	By WebFrontEnd_link = By.linkText("Web Front-End");
	By WebFrontEnd_Text = By.xpath("//*[@class='text-white' and contains(text(),'Web Front End')]");
	By PHPDevp_link = By.linkText("PHP Development");
	By PHPDevp_Text = By.xpath("//*[@class='text-white' and contains(text(),'PHP Development')]");
	By SoftwareDesignTools_link = By.linkText("Software Design Tools");
	By SoftwareDesignTools_Text = By.xpath("//*[@class='text-white' and contains(text(),'Software Design Tools')]");
	By JavaScriptApp_link = By.linkText("JavaScript App Development");
	By JavaScriptApp_Text = By.xpath("//*[@class='text-white' and contains(text(),'JavaScript App Development')]");
	By RubyOnRail_link = By.linkText("Ruby on Rails Development");
	By RubyOnRail_Text = By.xpath("//*[@class='text-white' and contains(text(),'Ruby on Rails Development')]");
	By ManagedServices_link = By.linkText("Managed Services");
	By ManagedServices_Text = By.xpath("//*[@class='text-white' and contains(text(),'Managed Services')]");
	By UserInteractionDesign_link = By.linkText("User Interaction Design");
	By UserInteractionDesign_Text = By.xpath("//*[@class='text-white' and contains(text(),'User Interaction Design')]");
	By LowCodeDevp_link = By.linkText("Low-Code Development");
	By LowCodeDevp_Text = By.xpath("//*[@class='text-white' and contains(text(),'Low-Code Development')]");
	
	By MiningSoftware_link = By.linkText("Mining Software");
	By MiningSoftware_Text = By.xpath("//*[@class='text-white' and contains(text(),'Mining Software')]");
	By CCLAS_link = By.linkText("CCLAS");
	By CCLAS_Text = By.xpath("//*[@class='text-white' and contains(text(),'CCLAS')]");
	By Classic_link = By.linkText("Classic");
	By Classic_Text = By.xpath("//*[@class='text-white' and contains(text(),'Classic')]");
	By Ellipse2_link = By.xpath("//*[@id='el-7924c188']/ul/li[3]/ul/li[3]/a");
	By Ellipse2_Text = By.xpath("//*[@class='text-white' and contains(text(),'Ellipse')]");
	By LinkOne_link = By.linkText("LinkOne");
	By LinkOne_Text = By.xpath("//*[@class='text-white' and contains(text(),'LinkOne')]");
	By MineMarket_link = By.linkText("MineMarket");
	By MineMarket_Text = By.xpath("//*[@class='text-white' and contains(text(),'MineMarket')]");
	By MineScape_link = By.linkText("MineScape");
	By MineScape_Text = By.xpath("//*[@class='text-white' and contains(text(),'MineScape')]");
	By MCat_link = By.linkText("MCat");
	By MCat_Text = By.xpath("//*[@class='text-white' and contains(text(),'MCat')]");
	By SPRYScheduler_link = By.linkText("SPRY Scheduler");
	By SPRYScheduler_Text = By.xpath("//*[@class='text-white' and contains(text(),'Spry Scheduler')]");
	
	By MedicalSoftware_link = By.linkText("Medical Software");
	By MedicalSoftware_Text = By.xpath("//*[@class='text-white' and contains(text(),'Medical Software')]");
	By HospitalInformationSystem_link = By.linkText("Hospital Information System");
	By HospitalInformationSystem_Text = By.xpath("//*[@class='text-white' and contains(text(),'Hospital Information System')]");
	By PatientAdministrationSystem_link = By.linkText("Patient Administration System");
	By PatientAdministrationSystem_Text = By.xpath("//*[@class='text-white' and contains(text(),'Patient Administration System')]");
	By FinanceSoftwareForHospitals_link = By.linkText("Finance Software For Hospitals");
	By FinanceSoftwareForHospitals_Text = By.xpath("//*[@class='text-white' and contains(text(),'Finance Software for Hospitals')]");
	By OccupationalHealthSafetySystem_link = By.linkText("Occupational Health & Safety System");
	By OccupationalHealthSafetySystem_Text = By.xpath("//*[@class='text-white' and contains(text(),'Occupational Health & Safety System')]");
	By Team_link = By.linkText("Team");
	By Team_Text = By.xpath("//*[@class='text-white' and contains(text(),'Our Management Team')]");
	By SoftwareDevelopmentNewsletter_link = By.linkText("Software Development Newsletter");
	By SoftwareDevelopmentNewsletter_Text = By.xpath("//*[@class='text-white' and contains(text(),'Software Development Newsletter')]");
	By MiningNewsletter_link = By.linkText("Mining Newsletter");
	By MiningNewsletter_Text = By.xpath("//*[@class='text-white' and contains(text(),'Mining Newsletter')]");
	By SeputarMedisIndonesia_link = By.linkText("Seputar Medis Indonesia");
	By SeputarMedisIndonesia_Text = By.xpath("//*[@class='text-white' and contains(text(),'Mitrais Medical Newsletter')]");
	
	By Careers_link = By.linkText("Careers");
	By Careers_Text = By.xpath("//*[@class='text-white' and contains(text(),'Careers')]");
	By Blog_link = By.linkText("Blog");
	By Blog_Text = By.xpath("//*[@class='text-white' and contains(text(),'Web Development & Programming Updates')]");
	By ContactUs_link = By.linkText("Contact Us");
	By ContactUs_Text = By.xpath("//*[@class='text-white' and contains(text(),'Contact Us')]");
	By MitraisPrivacyPolicy_link = By.linkText("Mitrais Privacy Policy");
	By MitraisPrivacyPolicy_Text = By.xpath("//*[@class='text-white' and contains(text(),'Privacy Policy')]");
	By FrequentlyAskedQuestions_link = By.linkText("Frequently Asked Questions");
	By FrequentlyAskedQuestions_Text = By.xpath("//*[@class='text-white' and contains(text(),'Frequently Asked Questions')]");
	
	public SiteMap_PO(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//Validate AboutUs_TEST-actions
		public void CLICKaboutUs ()
			{
				driver.findElement(AboutUs_link).click();
			}
	//Explicit wait for AboutUs
		public void WAITINGelementAboutUs()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element201= wait.until(ExpectedConditions.visibilityOfElementLocated(AboutUS_Text));
			}
	//Validate AboutUs-assert
		public void ASSERTaboutUs ()
			{
				driver.findElement(AboutUS_Text).isDisplayed();
			}
			
	//Validate SoftwareDevelopment_TEST-actions
		public void CLICKsoftwareDevelopment()
			{
				driver.findElement(SoftwareDevp_link).click();
			}
	//Explicit wait for element SoftwareDevelopment
		public void WAITINGelementSoftwareDevelopment()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element202= wait.until(ExpectedConditions.visibilityOfElementLocated(SoftwareDevp_Text));
			}
		//Validate SoftwareDevelopment-assert
			public void ASSERTsoftwareDevelopment ()
			{
				driver.findElement(SoftwareDevp_Text).isDisplayed();
			}
		//Validate MicrosoftWindowsApplications_TEST-actions
			public void CLICKmicrosoftWindowsApplications()
			{
				driver.findElement(MicrosoftWindowsApps_link).click();
			}
		//Explicit wait for element MicrosoftWindowsApplications
			public void WAITINGelementMicrosoftWindowsApplications()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element203= wait.until(ExpectedConditions.visibilityOfElementLocated(MicrosoftWindowsApps_Text));
			}
		//Validate MicrosoftWindowsApplications-assert
			public void ASSERTmicrosoftWindowsApplications ()
			{
				driver.findElement(MicrosoftWindowsApps_Text).isDisplayed();
			}
			
		//Validate MicrosoftWebSolutions_TEST-actions
			public void CLICKmicrosoftWebSolutions()
			{
				driver.findElement(MicrosoftWebSolutions_link).click();
			}
		//Explicit wait for element MicrosoftWebSolutions
			public void WAITINGelementMicrosoftWebSolutions()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element204= wait.until(ExpectedConditions.visibilityOfElementLocated(MicrosoftWebSolutions_Text));
			}
		//Validate MicrosoftWebSolutions-assert
			public void ASSERTmicrosoftWebSolutions()
			{
				driver.findElement(MicrosoftWebSolutions_Text).isDisplayed();
			}
			
		//Validate MobileServices_TEST-actions
			public void CLICKmobileServices()
			{
				driver.findElement(MobileServices_link).click();
			}
		//Explicit wait for element MobileServices
			public void WAITINGelementMobileServices()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element205= wait.until(ExpectedConditions.visibilityOfElementLocated(MobileServices_Text));
			}
		//Validate MobileServices-assert
			public void ASSERTmobileServices()
			{
				driver.findElement(MobileServices_Text).isDisplayed();
			}		

		//Validate Ellipse_TEST-actions
			public void CLICKellipse()
			{
				driver.findElement(Ellipse_link).click();
			}
		//Explicit wait for elementEllipse
			public void WAITINGelementEllipse()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element206= wait.until(ExpectedConditions.visibilityOfElementLocated(Ellipse_Text));
			}
		//Validate Ellipse-assert
			public void ASSERTellipse()
			{
				driver.findElement(Ellipse_Text).isDisplayed();
			}	
			
		//Validate JavaTechnologies_link_TEST-actions
			public void CLICKJavaTechnologies()
			{
				driver.findElement(JavaTech_link).click();
			}
		//Explicit wait for element JavaTechnologies
			public void WAITINGelementJavaTechnologies()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element207= wait.until(ExpectedConditions.visibilityOfElementLocated(JavaTech_Text));
			}
		//Validate JavaTechnologies-assert
			public void ASSERTJavaTechnologies()
			{
				driver.findElement(JavaTech_Text).isDisplayed();
			}		
			
		//Validate EnterpriseIntergration_link_TEST-actions
			public void CLICKEnterpriseIntergration()
			{
				driver.findElement(EnterpiseInt_link).click();
			}
		//Explicit wait for element EnterpriseIntergration
			public void WAITINGEnterpriseIntergration()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element208= wait.until(ExpectedConditions.visibilityOfElementLocated(EnterpiseInt_Text));
			}
		//Validate EnterpriseIntergration-assert
			public void ASSERTEnterpriseIntergration()
			{
				driver.findElement(EnterpiseInt_Text).isDisplayed();
			}	
			
		//Validate BusinessIntelegence_link_TEST-actions
		public void CLICKBusinessIntelegence()
			{
				driver.findElement(BusinessIntl_link).click();
			}
		//Explicit wait for element BusinessIntelegence
			public void WAITINGBusinessIntelegence()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element209= wait.until(ExpectedConditions.visibilityOfElementLocated(BusinessIntl_Text));
			}
		//Validate BusinessIntelegence-assert
			public void ASSERTBusinessIntelegence()
			{
				driver.findElement(BusinessIntl_Text).isDisplayed();
			}
			
		//Validate SoftwareQualityandTesting_link_TEST-actions
			public void CLICKSoftwareQualityandTesting()
			{
				driver.findElement(SoftwareTest_link).click();
			}
		//Explicit wait for element SoftwareQualityandTesting
			public void WAITINGSoftwareQualityandTesting()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element210= wait.until(ExpectedConditions.visibilityOfElementLocated(SoftwareTest_Text));
			}
		//Validate SoftwareQualityandTesting-assert
			public void ASSERTSoftwareQualityandTesting()
			{
				driver.findElement(SoftwareTest_Text).isDisplayed();
			}
			
		//Validate WebFrontEnd_link_TEST-actions
			public void CLICKWebFrontEnd()
			{
				driver.findElement(WebFrontEnd_link).click();
			}
		//Explicit wait for element WebFrontEnd
			public void WAITINGWebFrontEnd()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element211= wait.until(ExpectedConditions.visibilityOfElementLocated(WebFrontEnd_Text));
			}
		//Validate WebFrontEnd-assert
			public void ASSERTWebFrontEnd()
			{
				driver.findElement(WebFrontEnd_Text).isDisplayed();
			}
			
		//Validate PHPDevelopment_link_TEST-actions
			public void CLICKPHPDevelopment()
			{
				driver.findElement(PHPDevp_link).click();
			}
		//Explicit wait for element PHPDevelopment
			public void WAITINGPHPDevelopment()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element212= wait.until(ExpectedConditions.visibilityOfElementLocated(PHPDevp_Text));
			}
		//Validate PHPDevelopment-assert
			public void ASSERTPHPDevelopment()
			{
				driver.findElement(PHPDevp_Text).isDisplayed();
			}
			
		//Validate SoftwareDesignTools_link_TEST-actions
			public void CLICKSoftwareDesignTools()
			{
				driver.findElement(SoftwareDesignTools_link).click();
			}
		//Explicit wait for element SoftwareDesignTools
			public void WAITINGSoftwareDesignTools()
			{	
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element213= wait.until(ExpectedConditions.visibilityOfElementLocated(SoftwareDesignTools_Text));
			}
		//Validate PHPDevelopment-assert
			public void ASSERTSoftwareDesignTools()
			{
				driver.findElement(SoftwareDesignTools_Text).isDisplayed();
			}
			
		//Validate JavaScriptAppDevelopment_link_TEST-actions
			public void CLICKJavaScriptAppDevelopment()
			{
				driver.findElement(JavaScriptApp_link).click();
			}
		//Explicit wait for element JavaScriptAppDevelopment
				public void WAITINGJavaScriptAppDevelopment()
			{
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement element214= wait.until(ExpectedConditions.visibilityOfElementLocated(JavaScriptApp_Text));
			}

		//Validate JavaScriptAppDevelopment-assert
			public void ASSERTJavaScriptAppDevelopment()
			{
				driver.findElement(JavaScriptApp_Text).isDisplayed();
			}
			
		//Validate RubyOnRail_link_TEST-actions		
			public void CLICKRubyOnRail()		
				{	
					driver.findElement(RubyOnRail_link).click();
				}	
		//Explicit wait for element RubyOnRail		
			public void WAITINGRubyOnRail()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element215= wait.until(ExpectedConditions.visibilityOfElementLocated(RubyOnRail_Text));
				}	
					
		//Validate RubyOnRail-assert		
			public void ASSERTRubyOnRail()
				{	
					driver.findElement(RubyOnRail_Text).isDisplayed();
				}
			
		//Validate ManagedServices_link_TEST-actions		
			public void CLICKManagedServices()		
				{	
					driver.findElement(ManagedServices_link).click();
				}	
		//Explicit wait for element ManagedServices		
			public void WAITINGManagedServices()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element216= wait.until(ExpectedConditions.visibilityOfElementLocated(ManagedServices_Text));
				}	
							
		//Validate ManagedServices-assert		
			public void ASSERTManagedServices()
				{	
					driver.findElement(ManagedServices_Text).isDisplayed();
				}	
		//Validate UserInteractionDesign_link_TEST-actions		
			public void CLICKUserInteractionDesign()		
				{	
					driver.findElement(UserInteractionDesign_link).click();
				}	
		//Explicit wait for element UserInteractionDesign		
			public void WAITINGUserInteractionDesign()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element217= wait.until(ExpectedConditions.visibilityOfElementLocated(UserInteractionDesign_Text));
				}	
					
		//Validate UserInteractionDesign-assert		
			public void ASSERTUserInteractionDesign()
				{	
					driver.findElement(UserInteractionDesign_Text).isDisplayed();
				}	
		//Validate LowCodeDevelopment_link_TEST-actions		
			public void CLICKLowCodeDevelopment()		
				{	
					driver.findElement(LowCodeDevp_link).click();
				}	
		//Explicit wait for element LowCodeDevelopment		
			public void WAITINGLowCodeDevelopment()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element218= wait.until(ExpectedConditions.visibilityOfElementLocated(LowCodeDevp_Text));
				}	
					
		//Validate LowCodeDevelopment-assert		
			public void ASSERTLowCodeDevelopment()
				{	
					driver.findElement(LowCodeDevp_Text).isDisplayed();
				}	

		//Validate MiningSoftware_link_TEST-actions		
			public void CLICKMiningSoftware()		
				{	
					driver.findElement(MiningSoftware_link).click();
				}	
		//Explicit wait for element MiningSoftware		
			public void WAITINGMiningSoftware()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element219= wait.until(ExpectedConditions.visibilityOfElementLocated(MiningSoftware_Text));
				}	
							
		//Validate MiningSoftware-assert		
			public void ASSERTMiningSoftware()
				{	
					driver.findElement(MiningSoftware_Text).isDisplayed();
				}	
		
		//Validate CCLAS_link_TEST-actions		
			public void CLICKCCLAS()		
				{	
					driver.findElement(CCLAS_link).click();
				}	
		//Explicit wait for element CCLAS		
			public void WAITINGCCLAS()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element220= wait.until(ExpectedConditions.visibilityOfElementLocated(CCLAS_Text));
				}	
					
		//Validate CCLAS-assert		
					public void ASSERTCCLAS()
				{	
					driver.findElement(CCLAS_Text).isDisplayed();
				}	
		
		//Validate Classic_link_TEST-actions		
			public void CLICKClassic()		
				{	
					driver.findElement(Classic_link).click();
				}	
		//Explicit wait for element Classic		
			public void WAITINGClassic()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element221= wait.until(ExpectedConditions.visibilityOfElementLocated(Classic_Text));
				}	
					
		//Validate Classic-assert		
			public void ASSERTClassic()
				{	
					driver.findElement(Classic_Text).isDisplayed();
				}	

		//Validate Ellipse2_link_TEST-actions		
			public void CLICKEllipse2()		
				{	
					driver.findElement(Ellipse2_link).click();
				}	
		//Explicit wait for element Ellipse2		
			public void WAITINGEllipse2()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element222= wait.until(ExpectedConditions.visibilityOfElementLocated(Ellipse2_Text));
				}	
					
		//Validate Ellipse2-assert		
			public void ASSERTEllipse2()
				{	
					driver.findElement(Ellipse2_Text).isDisplayed();
				}	
		//Validate LinkOne_link_TEST-actions		
			public void CLICKLinkOne()		
				{	
					driver.findElement(LinkOne_link).click();
				}	
		//Explicit wait for element LinkOne		
			public void WAITINGLinkOne()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element223= wait.until(ExpectedConditions.visibilityOfElementLocated(LinkOne_Text));
				}	
					
		//Validate LinkOne-assert		
			public void ASSERTLinkOne()
				{	
					driver.findElement(LinkOne_Text).isDisplayed();
				}	

		//Validate MineMarket_link_TEST-actions		
			public void CLICKMineMarket()		
				{	
					driver.findElement(MineMarket_link).click();
				}	
		//Explicit wait for element MineMarket		
			public void WAITINGMineMarket()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element224= wait.until(ExpectedConditions.visibilityOfElementLocated(MineMarket_Text));
				}	
							
		//Validate MineMarket-assert		
			public void ASSERTMineMarket()
				{	
					driver.findElement(MineMarket_Text).isDisplayed();
				}	

		//Validate MineScape_link_TEST-actions		
			public void CLICKMineScape()		
				{	
					driver.findElement(MineScape_link).click();
				}	
		//Explicit wait for element MineSpace		
			public void WAITINGMineScape()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element225= wait.until(ExpectedConditions.visibilityOfElementLocated(MineScape_Text));
				}	
					
		//Validate MineSpace-assert		
			public void ASSERTMineScape()
				{	
					driver.findElement(MineScape_Text).isDisplayed();
				}	

		//Validate MCat_link_TEST-actions		
			public void CLICKMCat()		
				{	
					driver.findElement(MCat_link).click();
				}	
		//Explicit wait for element MCat		
			public void WAITINGMCat()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element226= wait.until(ExpectedConditions.visibilityOfElementLocated(MCat_Text));
				}	
							
		//Validate MCat-assert		
			public void ASSERTMCat()
				{	
					driver.findElement(MCat_Text).isDisplayed();
				}	

		//Validate SPRYScheduler_link_TEST-actions		
			public void CLICKSPRYScheduler()		
				{	
					driver.findElement(SPRYScheduler_link).click();
				}	
		//Explicit wait for element SPRYScheduler		
			public void WAITINGSPRYScheduler()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element227= wait.until(ExpectedConditions.visibilityOfElementLocated(SPRYScheduler_Text));
				}	
					
		//Validate SPRYScheduler-assert		
			public void ASSERTSPRYScheduler()
				{	
					driver.findElement(SPRYScheduler_Text).isDisplayed();
				}	

		//Validate MedicalSoftware_link_TEST-actions		
			public void CLICKMedicalSoftware()		
				{	
					driver.findElement(MedicalSoftware_link).click();
				}	
		//Explicit wait for element MedicalSoftware		
			public void WAITINGMedicalSoftware()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element228= wait.until(ExpectedConditions.visibilityOfElementLocated(MedicalSoftware_Text));
				}	
						
		//Validate MedicalSoftware-assert		
			public void ASSERTMedicalSoftware()
				{	
					driver.findElement(MedicalSoftware_Text).isDisplayed();
				}	
		//Validate HospitalInformationSystem_link_TEST-actions		
			public void CLICKHospitalInformationSystem()		
				{	
					driver.findElement(HospitalInformationSystem_link).click();
				}	
		//Explicit wait for element HospitalInformationSystem		
			public void WAITINGHospitalInformationSystem()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element229= wait.until(ExpectedConditions.visibilityOfElementLocated(HospitalInformationSystem_Text));
				}	
					
		//Validate HospitalInformationSystem-assert		
			public void ASSERTHospitalInformationSystem()
				{	
					driver.findElement(HospitalInformationSystem_Text).isDisplayed();
				}	

		//Validate PatientAdministrationSystem_link_TEST-actions		
			public void CLICKPatientAdministrationSystem()		
				{	
					driver.findElement(PatientAdministrationSystem_link).click();
				}	
		//Explicit wait for element PatientAdministrationSystem		
			public void WAITINGPatientAdministrationSystem()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element230= wait.until(ExpectedConditions.visibilityOfElementLocated(PatientAdministrationSystem_Text));
				}	
					
		//Validate PatientAdministrationSystem-assert		
			public void ASSERTPatientAdministrationSystem()
				{	
					driver.findElement(PatientAdministrationSystem_Text).isDisplayed();
				}	

		//Validate FinanceSoftwareForHospitals_link_TEST-actions		
			public void CLICKFinanceSoftwareForHospitals()		
				{	
					driver.findElement(FinanceSoftwareForHospitals_link).click();
				}	
		//Explicit wait for element FinanceSoftwareForHospitals		
			public void WAITINGFinanceSoftwareForHospitals()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element231= wait.until(ExpectedConditions.visibilityOfElementLocated(FinanceSoftwareForHospitals_Text));
				}	
							
		//Validate FinanceSoftwareForHospitals-assert		
			public void ASSERTFinanceSoftwareForHospitals()
				{	
					driver.findElement(FinanceSoftwareForHospitals_Text).isDisplayed();
				}	

		//Validate OccupationalHealthSafetySystem_link_TEST-actions		
			public void CLICKOccupationalHealthSafetySystem()		
				{	
					driver.findElement(OccupationalHealthSafetySystem_link).click();
				}	
		//Explicit wait for element OccupationalHealthSafetySystem		
			public void WAITINGOccupationalHealthSafetySystem()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element232= wait.until(ExpectedConditions.visibilityOfElementLocated(OccupationalHealthSafetySystem_Text));
				}	
					
		//Validate OccupationalHealthSafetySystem-assert		
			public void ASSERTOccupationalHealthSafetySystem()
				{	
					driver.findElement(OccupationalHealthSafetySystem_Text).isDisplayed();
				}	

		//Validate Team_link_TEST-actions		
			public void CLICKTeam()		
				{	
					driver.findElement(Team_link).click();
				}	
		//Explicit wait for element Team		
			public void WAITINGTeam()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element233= wait.until(ExpectedConditions.visibilityOfElementLocated(Team_Text));
				}	
					
		//Validate Team-assert		
			public void ASSERTTeam()
				{	
					driver.findElement(Team_Text).isDisplayed();
				}	

		//Validate SoftwareDevelopmentNewsletter_link_TEST-actions		
			public void CLICKSoftwareDevelopmentNewsletter()		
				{	
					driver.findElement(SoftwareDevelopmentNewsletter_link).click();
				}	
		//Explicit wait for element SoftwareDevelopmentNewsletter		
			public void WAITINGSoftwareDevelopmentNewsletter()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element234= wait.until(ExpectedConditions.visibilityOfElementLocated(SoftwareDevelopmentNewsletter_Text));
				}	
					
		//Validate SoftwareDevelopmentNewsletter-assert		
			public void ASSERTSoftwareDevelopmentNewsletter()
				{	
					driver.findElement(SoftwareDevelopmentNewsletter_Text).isDisplayed();
				}	

		//Validate MiningNewsletter_link_TEST-actions		
			public void CLICKMiningNewsletter()		
				{	
					driver.findElement(MiningNewsletter_link).click();
				}	
		//Explicit wait for element MiningNewsletter		
			public void WAITINGMiningNewsletter()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element235= wait.until(ExpectedConditions.visibilityOfElementLocated(MiningNewsletter_Text));
				}	
					
		//Validate MiningNewsletter-assert		
			public void ASSERTMiningNewsletter()
				{	
					driver.findElement(MiningNewsletter_Text).isDisplayed();
				}	

		//Validate SeputarMedisIndonesia_link_TEST-actions		
			public void CLICKSeputarMedisIndonesia()		
				{	
					driver.findElement(SeputarMedisIndonesia_link).click();
				}	
		//Explicit wait for element SeputarMedisIndonesia		
			public void WAITINGSeputarMedisIndonesia()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element236= wait.until(ExpectedConditions.visibilityOfElementLocated(SeputarMedisIndonesia_Text));
				}	
					
		//Validate SeputarMedisIndonesia-assert		
			public void ASSERTSeputarMedisIndonesia()
				{	
					driver.findElement(SeputarMedisIndonesia_Text).isDisplayed();
				}	

		//Validate Careers_link_TEST-actions		
			public void CLICKCareers()		
				{	
					driver.findElement(Careers_link).click();
				}	
		//Explicit wait for element Careers		
			public void WAITINGCareers()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element237= wait.until(ExpectedConditions.visibilityOfElementLocated(Careers_Text));
				}	
					
		//Validate Careers-assert		
			public void ASSERTCareers()
				{	
					driver.findElement(Careers_Text).isDisplayed();
				}	
	
		//Validate Blog_link_TEST-actions		
			public void CLICKBlog()		
				{	
					driver.findElement(Blog_link).click();
				}	
		//Explicit wait for element Blog		
			public void WAITINGBlog()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element238= wait.until(ExpectedConditions.visibilityOfElementLocated(Blog_Text));
				}	
					
		//Validate Blog-assert		
			public void ASSERTBlog()
				{	
					driver.findElement(Blog_Text).isDisplayed();
				}	

		//Validate ContactUs_link_TEST-actions		
			public void CLICKContactUs()		
				{	
					driver.findElement(ContactUs_link).click();
				}	
		//Explicit wait for element ContactUs		
			public void WAITINGContactUs()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element239= wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUs_Text));
				}	
					
		//Validate ContactUs-assert		
			public void ASSERTContactUs()
				{	
					driver.findElement(ContactUs_Text).isDisplayed();
				}	

		//Validate MitraisPrivacyPolicy_link_TEST-actions		
			public void CLICKMitraisPrivacyPolicy()		
				{	
					driver.findElement(MitraisPrivacyPolicy_link).click();
				}	
		//Explicit wait for element MitraisPrivacyPolicy		
			public void WAITINGMitraisPrivacyPolicy()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element240= wait.until(ExpectedConditions.visibilityOfElementLocated(MitraisPrivacyPolicy_Text));
				}	
					
		//Validate MitraisPrivacyPolicy-assert		
			public void ASSERTMitraisPrivacyPolicy()
				{	
					driver.findElement(MitraisPrivacyPolicy_Text).isDisplayed();
				}	
	
		//Validate FrequentlyAskedQuestions_link_TEST-actions		
			public void CLICKFrequentlyAskedQuestions()		
				{	
					driver.findElement(FrequentlyAskedQuestions_link).click();
				}	
		//Explicit wait for element FrequentlyAskedQuestions		
			public void WAITINGFrequentlyAskedQuestions()		
				{	
					WebDriverWait wait=new WebDriverWait(driver,20);
					WebElement element241= wait.until(ExpectedConditions.visibilityOfElementLocated(FrequentlyAskedQuestions_Text));
				}	
					
		//Validate FrequentlyAskedQuestions-assert		
			public void ASSERTFrequentlyAskedQuestions()
				{	
					driver.findElement(FrequentlyAskedQuestions_Text).isDisplayed();
				}	
			
}
