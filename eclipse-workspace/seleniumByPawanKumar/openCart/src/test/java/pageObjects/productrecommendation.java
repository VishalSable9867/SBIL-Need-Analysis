package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productrecommendation extends baseConstr{
	
	WebDriver driver;
	
	public productrecommendation(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="WebDriver driver")
	private List<WebElement> productlist;
	
	public List<WebElement> productsuggestion()
	{
		return productlist;
	}
	

}
