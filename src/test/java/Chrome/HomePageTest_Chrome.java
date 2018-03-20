package Chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stagingm.com.stagingm.test.HomePage_PO;

public class HomePageTest_Chrome {
	@BeforeMethod
	public void initiateDriver() {
		System.setProperty("webdriver.chrome.driver","D:\\MY WORK DOC\\Document dewak\\Automation Testing\\Workspace\\com.stagingm.test\\web_driver\\chromedriver.exe");
	} 
	
		
	@Test
	public void Accesshomepage() throws InterruptedException
	{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://stagingmitrais.com/en/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
	//Click on Contact Us button	
			HomePage_PO homepage = new HomePage_PO(driver);
			homepage.ContactUsBtn();
			
	//validate by showing "Contact Us" on the Contact Page
			homepage.Assrt1();
	
			//wait for element ready
			//WebDriverWait wait=new WebDriverWait(driver,60);
			//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/nav/div/div[1]/div[1]")));	
	
	//click Mitrais homepage		
	//		homepage.HomeMitrais();
	
				
	//Click Learn More Button on About US at homepage1
		//	homepage.LearnMore_AboutUS();
			
	//Validate by showing About us page
		//	homepage.Assrt2();
	
				
	}
}
