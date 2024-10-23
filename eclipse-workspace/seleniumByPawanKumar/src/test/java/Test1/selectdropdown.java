package Test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class selectdropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		System.out.println(options.size());
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
			if(options.get(i).getText().equals("Java"))
			{
				options.get(i).click();
			}
		}
		
		

	}

}
