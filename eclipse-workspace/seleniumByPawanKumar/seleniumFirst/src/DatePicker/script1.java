package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {

	public static void main(String[] args) {
		// https://jqueryui.com/datepicker/
		System.setProperty("webdriver.chrome.driver","F:\\Software testing\\Selenium jars\\chromedriver-win32\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://jqueryui.com/datepicker/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.switchTo().frame(0);
		//  driver.findElement(By.id("datepicker")).sendKeys("11/28/2024");  // Approch 1
		  driver.findElement(By.id("datepicker")).click();
		  
		  String date = "21";
		  String month = "March";
		  String year = "2025";
		  while(true)
		  {
			  String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			  String yrs = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			  if(mon.equals(month) && yrs.equals(year))
			  {
				  break;
			  }
			  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  }
		  List<WebElement> dts = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			/*
			 * for(WebElement dt: dts) 
			 * { 
			 * if(dt.getText().equals(date)) 
			 * { 
			 *  dt.click();
			 *  break;
			 * }
			 * }
			 */
		  for(int i=0; i<dts.size(); i++)
		  {
			  if(dts.get(i).getText().equals(date))
			  {
				  dts.get(i).click();
			  }
			 
		  }
	}

}
