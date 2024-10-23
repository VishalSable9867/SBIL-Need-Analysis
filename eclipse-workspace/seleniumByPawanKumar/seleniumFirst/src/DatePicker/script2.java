package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class script2 {

	public static void main(String[] args) {
		// https://www.dummyticket.com/dummy-ticket-for-visa-application/
		  System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.findElement(By.xpath("//input[@id='dob']")).click();
		  String month = "Feb";
		  String year = "1990";
		  String day = "15";
		  WebElement opt = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		  Select s = new Select(opt);
		   // s.selectByVisibleText(month);
		List<WebElement> options1 = s.getOptions();
		System.out.println(options1.size());
		for(int i=0; i<options1.size(); i++)
		{
			if(options1.get(i).getText().equals(month))
			{
				options1.get(i).click();
				break;
			}
		}
		 WebElement opt2= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		  Select s1 = new Select(opt2);
		//   s1.selectByVisibleText(year);
		  List<WebElement> options2 = s1.getOptions();
		  System.out.println(options2.size());
		  for(int i=0; i<options2.size(); i++)
		  {
			  if(options2.get(i).getText().equals(year))
			  {
				  options2.get(i).click();
				  break;
			  }
		  }
		  
		  List<WebElement> dy = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		  for(int i=0; i<dy.size(); i++)
		  {
			 String di = dy.get(i).getText();
			  if(di.equals(day))
		       {
				  dy.get(i).click();
				  break;
			   } 
		  }
		  

	}

}
