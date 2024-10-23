package seleniumFirstPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Software testing\\Selenium jars\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[text()='Option 1']")).click();
        driver.findElement(By.xpath("//label[text()='Option 1']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//input[@class='cb1-element' and@type='checkbox' ]"));
	    /*  System.out.println(elements.size());
	     
	     for(int i=0; i< elements.size()  ; i++)
	     {
	    	 elements.get(i).click();
	     }
	     */
        
        // select last two checkboxes
        
		/*
		 * for( int i=2; i<elements.size(); i++) { elements.get(i).click(); }
		 */
        
        
        // select first two checkboxes.
        
		/*
		 * for( int i=0; i<2; i++) { elements.get(i).click(); }
		 */
        
        for( int i=0; i<elements.size(); i++)
        {
        	if(i <2)
        	{
        		elements.get(i).click();
        	}
        }
        Thread.sleep(5000);
        for( int i=0; i<elements.size(); i++)
        {
        	if(elements.get(i).isSelected())
        	{
        		elements.get(i).click();
        	}
        }
	     Thread.sleep(5000);
	     driver.close();

	}

}
