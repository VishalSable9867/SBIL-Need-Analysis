package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // TakesScreenshot t = (TakesScreenshot) driver;   // common io need to add
		//  File src = t.getScreenshotAs(OutputType.FILE);
		//  File f = new File(".//screenshot/test1.png");
		//  FileUtils.copyFile(src, f);
       
		  WebElement sc1 = driver.findElement(By.xpath("//div[@id='gw-card-layout']"));
		   File src = sc1.getScreenshotAs(OutputType.FILE);
		   File f = new File(".//screenshot/test2.png");
		   FileUtils.copyFile(src, f);
	}

}
