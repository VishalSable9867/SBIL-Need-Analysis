package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerAccount extends baseConstr{

	WebDriver driver;
	public registerAccount(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(id="input-firstname")
	private WebElement first_name;
	
	@FindBy(id="input-lastname")
	private WebElement last_name;
	
	@FindBy(id="input-email")
	private WebElement email_id;
	
	@FindBy(id="input-telephone")
	private WebElement phone_number;
	
	@FindBy(id="input-password")
	private WebElement password_field;
	
	@FindBy(id="input-confirm")
	private WebElement password_conf;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement checkbx_form;   // Encapsulation applied here  can't access outside the cls.
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement submt_btn;
	
	@FindBy(xpath="//div[@id='content']//child::h1")
	private WebElement confirm_message;
	
	public void first_name_txt(String name)
	{
		first_name.sendKeys(name);
	}
	public void last_name_txt(String Lname)
	{
		last_name.sendKeys(Lname);
	}
	public void email_id_txt(String Email)
	{
		email_id.sendKeys(Email);
	}
	public void phone_number_txt(String phone)
	{
		phone_number.sendKeys(phone);
	}
	public void password_txt(String pass)
	{
		password_field.sendKeys(pass);
	}
	public void password_conf_txt(String pass1)
	{
		password_conf.sendKeys(pass1);
	}
	public void checkbx_form_btn()
	{
		checkbx_form.click();
	}
	public void submt_btn_clk()
	{
		submt_btn.click();
	}
	
	public String confirm_msg_vrf()
	{
		try
		{
			return confirm_message.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
}
