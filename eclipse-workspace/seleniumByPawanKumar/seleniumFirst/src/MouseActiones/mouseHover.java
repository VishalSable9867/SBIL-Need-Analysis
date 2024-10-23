package MouseActiones;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://artoftesting.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement ele=driver.findElement(By.xpath("(//a[text()='Automation'])[1]"));
		WebElement drp= driver.findElement(By.xpath("//li[@id='menu-item-1008']//a[normalize-space()='Katalon Studio Tutorial']"));
		  
		  Actions a = new Actions(driver);
		  a.moveToElement(ele);
		  a. moveToElement(drp);
		  a.click().build().perform();

	}

}
