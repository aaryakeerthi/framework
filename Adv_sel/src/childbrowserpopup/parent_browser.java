package childbrowserpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_browser 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io//demo/links/");
	Thread.sleep(2000);
	String p_id=driver.getWindowHandle();
	System.out.println(p_id);
	driver.close();
	
}
}
