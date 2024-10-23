package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends baseConstr {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy (xpath="//span[text()='My Account']")
	private WebElement my_accnt_btn;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement register_btn;
	
	@FindBy(xpath="(//a[text()='Login'])[1]")
	private WebElement login_btn;
	
	public void loginButton()
	{
		login_btn.click();
	}
	
	public void my_accnt_btn1()
	{
		my_accnt_btn.click();
	}
	
	public void register_btn_cl()
	{
		register_btn.click();
	}

}

// https://tutorialsninja.com/demo/
