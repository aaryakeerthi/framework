package Testngggg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic2_script {
	public WebDriver driver;
	@BeforeMethod
	public void oppenApp()
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	}
	@AfterMethod
	public void closeApp()
	{
		driver. close(); 
		
	
	} 
	
	

}



