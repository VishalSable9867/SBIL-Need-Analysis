package MouseActiones;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://jqueryui.com/resources/demos/slider/range.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement tr = driver.findElement(By.xpath("//span[1]"));
		  Actions a = new Actions(driver);
		  System.out.println(tr.getLocation());
		  a.dragAndDropBy(tr,300,47).perform();
		  System.out.println(tr.getLocation());	  

	}

}
