package pom_script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pom_runnerscript {
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Pom_logintofacebook  p=new Pom_logintofacebook (driver);
		p.sendUN();
		Thread.sleep(2000);
		p.sendPWD();
		Thread.sleep(2000);
		p.clickLogin();
		driver.close();
	} 

}
