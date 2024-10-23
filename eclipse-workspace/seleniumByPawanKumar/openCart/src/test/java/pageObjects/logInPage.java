package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logInPage extends baseConstr {

	WebDriver driver;
	public logInPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']") 
    private WebElement e_MailAddress;
	
	@FindBy(xpath="//input[@id='input-password']") 
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']") 
	private WebElement login;
	
	public void EmailAddress(String email)
	{
		e_MailAddress.sendKeys(email);
	}
	
	public void password1(String email)
	{
		password.sendKeys(email);
	}
	
	public void loginbtn()
	{
		login.click();
	}
}
