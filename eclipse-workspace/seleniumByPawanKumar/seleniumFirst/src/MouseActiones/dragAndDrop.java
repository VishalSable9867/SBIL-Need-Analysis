package MouseActiones;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.guru99.com/test/drag_drop.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		  WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		  Actions a = new Actions(driver);
		  a.dragAndDrop(drag, drop).perform();

	}

}
