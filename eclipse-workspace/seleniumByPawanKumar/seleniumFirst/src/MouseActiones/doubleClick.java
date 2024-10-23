package MouseActiones;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement dc = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		  Actions a = new Actions(driver);
		  a.doubleClick(dc).perform();
		  driver.switchTo().alert().accept();

	}

}
