package seleniumFirstPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggetionDropdown {
	public static void main(String[] args) throws InterruptedException {
		// https://www.google.com/
		  System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("tata tigor");
		  List<WebElement> txt = driver.findElements(By.xpath("//div[@class='OBMEnb']/child::ul[@class='G43f7e']/li"));
		  System.out.println(txt.size());
		  Thread.sleep(5000);
		  for(int i=0; i<txt.size(); i++)
		  {
			  System.out.println(txt.get(i).getText());
		  }
		  for(int i=0; i<txt.size(); i++)
		  {
			  String t1 = txt.get(i).getText();
			  if(t1.equals("tata tigor on road price"))
			  {
				  txt.get(i).click();
				  break;
			  }
		  }
		  driver.close();

	}

}
