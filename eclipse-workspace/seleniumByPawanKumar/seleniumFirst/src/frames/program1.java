package frames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class program1 {
	public static void main(String[] args) throws InterruptedException {
		// https://the-internet.herokuapp.com/nested_frames
		System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://jqueryui.com/switchClass/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[@id='button']")).click();
		  Thread.sleep(5000);
		  driver.switchTo().defaultContent();
		  driver.findElement(By.linkText("Draggable")).click();
		  
		  // we can use frames by using three ways
		   // 1. by using name or id directly in driver.switchTo().frame("name/id")
		  // 2. By writting selector/ webelement in switchTo().frame(webselector)
		  // 3. By using index number of frame

	}

}
