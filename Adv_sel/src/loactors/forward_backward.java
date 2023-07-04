package loactors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forward_backward 
{ public static void main(String[] args) throws InterruptedException 
{
	
	 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instgram.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
}
		
		
		
		
		
		
}

