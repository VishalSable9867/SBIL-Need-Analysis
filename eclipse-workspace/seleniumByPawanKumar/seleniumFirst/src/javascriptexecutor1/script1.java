package javascriptexecutor1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import frames.windowHandle;
public class script1 {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)", args);
		  
		  WebElement txt = driver.findElement(By.xpath("//span[@class='action-inner']"));
		  js.executeScript("arguments[0].click();", txt);  // when there is problem in webdriver methods then use js executor to perform the action
		  

	}

}
