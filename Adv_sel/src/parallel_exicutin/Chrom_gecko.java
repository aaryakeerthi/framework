package parallel_exicutin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Chrom_gecko 
{
	public WebDriver driver;
@Test
@Parameters({"browsers"})
public void exc(String browser) 
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	if(browser.equals("firefox"))
	{
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
	}
	else {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
}

}
