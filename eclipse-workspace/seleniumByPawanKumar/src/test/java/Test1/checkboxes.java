package Test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class checkboxes {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		//driver.findElement(By.xpath("//input[@value='red']")).click();
		List<WebElement> chckbox = driver.findElements(By.xpath("//input[@type='checkbox' and @name='color']"));
		System.out.println(chckbox.size());
		/* for(int i=0; i<chckbox.size(); i++)
		{
			chckbox.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=0; i<chckbox.size(); i++)
		{
			chckbox.get(i).click();
		} */
		
//		for(WebElement sel:chckbox)
//		{
//			sel.click();
//		}
		
		for(int i=0; i<chckbox.size(); i++)
		{
			if(i <2)
		{
			chckbox.get(i).click();
		}
		}
    
	}

}
