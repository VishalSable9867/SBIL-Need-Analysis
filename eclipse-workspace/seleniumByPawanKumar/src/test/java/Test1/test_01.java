package Test1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class test_01 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait ws = new WebDriverWait(driver, Duration.ofSeconds(10));
		ws.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='text']")));

	}

}
