package pom_script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_logintofacebook 
{
	
	@FindBy(id="email")
	private WebElement unField;
	
	@FindBy(id="pass")
	private WebElement passField;
	
	@FindBy(xpath ="//a[text()='Log in']")
	private WebElement loginBtn;
	
	public  Pom_logintofacebook(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void sendUN()
	{
		unField.sendKeys("chaitra@gmail.com");
	}
	
	public void sendPWD()
	{
	passField.sendKeys("hello");	
     }
	
	public void clickLogin() 
	{
	loginBtn.click();
	

}
}
