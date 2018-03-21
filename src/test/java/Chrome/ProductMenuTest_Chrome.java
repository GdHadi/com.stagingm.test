package Chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stagingm.com.stagingm.test.ProductMenu_PO;

public class ProductMenuTest_Chrome {

	public static WebDriver driver;
	public static ProductMenu_PO Products;
	
	@BeforeMethod
	public void initiateDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
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
						Products.ASSERTminingSoftware();
					};
					
	 
	//Click on Sub menu CCLAS
		@Test(priority=2)
		public void CCLASMenu() throws InterruptedException
				{	
					Products.CLICKcclas();
					Products.ASSERTcclas();
				};
		
}
