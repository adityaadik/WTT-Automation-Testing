package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class domainRedirection {
	
	  @Test
	  
	  public void domain() {
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://www.whitetabletechnology.com/");
		  
		WebElement element = driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div[2]/div/a"));
		element.click();
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView(true);", element);

		  
		  
	  }

}
