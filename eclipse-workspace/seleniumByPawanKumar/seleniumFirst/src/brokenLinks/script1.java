package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {

	public static void main(String[] args) throws MalformedURLException, IOException  {
		  System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.zlti.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         List<WebElement> tn=driver.findElements(By.tagName("a"));
         System.out.println(tn.size());
         int broken=0;
         
         for(WebElement t:tn)
         {
        	String att = t.getAttribute("href");
        	if(att == null || att.isEmpty())
        	{
        		System.out.println("Link are not broken or empty");
        		continue;
        	}
        	
        	URL ur = new URL(att);
        	HttpURLConnection con=(HttpURLConnection) ur.openConnection();
        	con.connect();
        	if(con.getResponseCode() >= 400)
        	{
        		System.out.println("links broken" + t.getText());
        		broken++;
        	}
        	else
        	{
        		System.out.println("Not broken" + t.getText());
        	}
        	
         }
         System.out.println(broken);
         driver.close();
	}

}
