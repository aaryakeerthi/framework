package javascriptexe_;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollup_scrlldownapplicatin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0; i<3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}
		for(int i=0; i<3;i++)
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(2000);
		}
		
		
	}

}
