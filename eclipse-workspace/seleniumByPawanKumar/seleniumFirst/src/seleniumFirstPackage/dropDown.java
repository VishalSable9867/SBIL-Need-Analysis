package seleniumFirstPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement drp = driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select s = new Select(drp);
		// s.selectByValue("Sunday");
		// s.selectByVisibleText("Monday");
		// s.selectByIndex(1);
		
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		for(int i=0; i<opt.size(); i++)
		{
			System.out.println(opt.get(i).getText());
		}
		

	}

}
