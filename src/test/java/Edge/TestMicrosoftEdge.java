package Edge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestMicrosoftEdge {
	public void initiateDriver()
	{
		System.setProperty("webdriver.edge.driver","C:\\WebDriver\\MicrosoftWebDriver.exe");
	
	}
		public void Accesshomepage() 
		{
			WebDriver driver=new EdgeDriver();
			driver.get("https://stagingmitrais.com/en/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			
			driver.findElement(By.xpath("//*[@id='el-a4311d0c']/a")).click();	
	
		}
}
