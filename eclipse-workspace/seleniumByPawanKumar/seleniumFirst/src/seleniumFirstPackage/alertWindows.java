package seleniumFirstPackage;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertWindows {

	public static void main(String[] args) throws InterruptedException {
		//https://demo.seleniumeasy.com/javascript-alert-box-demo.html
		System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		 // driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		//  driver.switchTo().alert().accept();
		//  driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][normalize-space()='Click me!']")).click();
		//  driver.switchTo().alert().accept();
		 // driver.switchTo().alert().dismiss();
		  driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Alert dta = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(dta.getText());
		dta.sendKeys("HDHGDGGG");
		Thread.sleep(5000);
		dta.accept();
		  
	}

}
