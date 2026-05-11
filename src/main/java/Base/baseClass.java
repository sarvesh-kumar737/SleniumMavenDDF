package Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import Utilities.configReader;



public class baseClass
{
	
	// cross browser testing
	
	// @beforesuite to intiate report
	// @before method to open  browser on diffrent browser
	
	// screenshot if failed
	Properties prop;
	
	public WebDriver driver;
	public configReader cr;
	
	
	@BeforeSuite
	public void setupReport()
	{
		
		System.out.print("first it will be execute");
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		
		
		
		cr = new configReader();
		String Browser = cr.getBrowser();
		String URL = cr.getUrl();
		
		if(Browser.equalsIgnoreCase("CHROME"))
		{
			
			driver = new ChromeDriver();
			
			
		}
		
		else if(Browser.equalsIgnoreCase("EDGE"))
		{
			
			
			driver = new EdgeDriver();
			
			
			
		}
		
		else
		{
			
		}
		driver.manage().window().maximize();
		driver.get(URL);
		
	
		
		
		
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		
		
		//driver.close();
		
		
	}
	
	
	@AfterSuite
	public void endReport()
	{
		

		System.out.print("first it will be execute in the end");
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
