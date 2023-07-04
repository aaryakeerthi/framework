package  generic_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic_script {
	public WebDriver driver;
	@BeforeMethod
	public void oppenApp()
	{
		System.setProperty("webdriver.gecko.driver","./libraries/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	 
	@AfterMethod
	public void closeApp()
	{
		driver. close();
		
	
	}
	
	

}
