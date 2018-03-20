package Chrome;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.stagingm.com.stagingm.test.HomePage_PO;

public class ValidateHomepageLink_TEST {
	
@BeforeMethod
	public void intiateDriver (){
		System.setProperty ("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
	}; 
	
@Test(priority=1)
    public void aboutUsLink ()throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://stagingmitrais.com/en/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	HomePage_PO homepage = new HomePage_PO(driver);
	homepage.CLICKaboutUsLink();
	homepage.ASSERTaboutUsLink();
    
	//close browser
	driver.close();
	
	};
@Test(priority=2)
    public void ServiceSofDevLink (){
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://stagingmitrais.com/en/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	HomePage_PO homepage = new HomePage_PO(driver);
	homepage.HOVERservice();
	homepage.ASSERTserviceSofDev();

	//close browser
	driver.close();
    };
}
