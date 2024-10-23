package seleniumFirstPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdDown {

	public static void main(String[] args) {
		// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		  System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		  driver.findElement(By.xpath("(//i[contains(@class,'oxd-icon bi-caret-down-fill oxd-select-text--arrow')])[4]")).click();
		  
		 List<WebElement> options = driver.findElements(By.xpath("//div[@class='oxd-select-option']//span"));
		 System.out.println(options.size());
		 for(int i=0; i<options.size(); i++)
		 {
			String lis=options.get(i).getText();
			if(lis.equals("Job Offered"))
			{
				options.get(i).click();
			}
		 }

	}

}
