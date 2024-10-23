package Test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alt.accept();
//		alt.dismiss();
		
//		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		Thread.sleep(2000);
//		Alert alt1 = driver.switchTo().alert();
//		alt1.accept();
//		alt1.dismiss();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alt3 = driver.switchTo().alert();
		alt3.sendKeys("Hey");
		Thread.sleep(3000);
		alt3.accept();
		WebElement path = driver.findElement(By.xpath("//p[@id='demo1']"));
		String text = path.getText();
		if(text.equals("Hello Hey How are you today"))
		{
			System.out.println("done");
		}
		else
		{
			System.out.println("again do");
		}

	}

}
