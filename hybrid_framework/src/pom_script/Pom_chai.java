package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_script.Base_page;

public class Pom_chai extends Base_page{
	

@FindBy(name="email")
private WebElement uName;
@FindBy(name="pass")
private WebElement pWord;
@FindBy(name="login")
private WebElement loginBtn;

public Pom_chai(WebDriver driver)
{
	super(driver);
}
	
public void uName(String un)
{
	uName.sendKeys(un);
}
public void pWord(String pwd)
{
	uName.sendKeys(pwd);
	
}
public void btn()
{
	loginBtn.click();
}

}

	


