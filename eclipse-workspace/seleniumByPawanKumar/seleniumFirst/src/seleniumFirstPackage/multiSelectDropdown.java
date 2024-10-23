package seleniumFirstPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		 //https://www.jquery-az.com/boots/demo.php?ex=63.0_2 
		  System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	      Thread.sleep(5000); 
		  driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		   // Thread.sleep(5000);
		  List<WebElement> opt = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//label"));
		  System.out.println(opt.size()); // no of options
		  
		  for( int i=0; i<opt.size(); i++)
		  { 
		   System.out.println(opt.get(i).getText());
		  }
		  
		  for(int i=0; i<opt.size(); i++) 
		  { 
		  if(opt.get(i).getText().equals("Java")) 
		  {
		  opt.get(i).click(); 
		  } 
		  } driver.close();
		   		
		
	}

}
