package Generic_script;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements framework_const1 
{
public WebDriver driver;
@BeforeMethod
public void openApp() {
	
	System.setProperty(chrome_key, chrome_value);
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(base_url);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterMethod
public void closeApp()
{
	driver.close();
	
	
	
}
}

