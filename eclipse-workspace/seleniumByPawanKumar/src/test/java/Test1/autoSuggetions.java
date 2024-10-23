package Test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggetions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Pen");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion-container']//div"));
		System.out.println(list.size());
		Thread.sleep(2000);
		for(int i=0; i<list.size(); i++)
		{
			String name1=list.get(i).getText();
			Thread.sleep(2000);
			System.out.println(name1);
//			//Thread.sleep(2000);
//			if(name1.equals("pencil"))
//			{
//				list.get(i).click();
//			}
		}

	}

}
