package pom_qa;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class pom_forQA {
	@FindBy(id="firstName")
	private WebElement fname;
	
    @FindBy(id="lastName")
    private WebElement lname;
    
    @FindBy(id="userEmail")
    private WebElement email;
    
    @FindBy(xpath = "//label[text()='Female']")
    private WebElement radioButton;
    
    @FindBy(id="userNumber")
    private WebElement mobilenumber;
    
    @FindBy(id="dateOfBirthInput")
    private WebElement dob; 
    @FindBy(xpath ="//div[text()='22']")
    private WebElement date;
    @FindBy(xpath ="//option[text()='1995']")
    private WebElement year;
    @FindBy(xpath ="//option[text()='November']")
    private WebElement month;
    /* @FindBy(id="subjectsContainer")
    private WebElement subject;
    
    @FindBy(id="hobbies-checkbox-3")
    private WebElement hobby;
    
    @FindBy(id="uploadPicture")
    private WebElement choosefil;
    
    @FindBy(id="currentAddress")
    private WebElement curentadd;*/
    
    public  pom_forQA (WebDriver driver)
    {
		PageFactory.initElements(driver,this);
		
	}
    public void firstname()
    {
    	fname.sendKeys("chaitra");
    }
    public void lastname()
    {
    	lname.sendKeys("sc");
     }
    public void email1()
    {
    	email.sendKeys("chaitrasc02@gmail.com");
    }
    public void radiobutton1()
    {
    	radioButton.click();
    }
    public void mobilenumber1()
    {
    	mobilenumber.sendKeys("9831025678");
    }
    
    
    public void dob1()
    {
    	dob.click();
    }
    public void date1()
    {
    	fname.sendKeys("22");
    }
    public void year1()
    {
    	year.sendKeys("1995");
    }
    public void month1()
    {
    	month.sendKeys("november");
    }
}
