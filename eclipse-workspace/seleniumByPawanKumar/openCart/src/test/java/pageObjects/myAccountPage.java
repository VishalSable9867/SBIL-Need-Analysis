package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage extends baseConstr {

	WebDriver driver;
	public myAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='content']/child::h2[text()='My Account']")
	private WebElement heading_myAccount;
	
	@FindBy(xpath="(//a[text()='Logout'])[2]")
	private WebElement logout;
	
	public void logoutbtn()
	{
		logout.click();
	}
	public boolean myAccountPageName()
	{
		try
		{
			return(heading_myAccount.isDisplayed());
		}
		catch(Exception e)
		{
			return (false);
		}
	}
}
