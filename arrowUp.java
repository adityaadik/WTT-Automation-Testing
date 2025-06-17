package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class arrowUp {

	
	
	@Test
	
	public void up() {
		
		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();   
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		
 		driver.get("https://www.whitetabletechnology.com/");
 	    System.out.println("The title of the page: " + driver.getTitle());
 	    
 	   JavascriptExecutor js = (JavascriptExecutor) driver;
 	   
 	  js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
 	  
 	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
 	  
 	// js.executeScript("window.scrollBy(0,1500)");
 	    
 	    driver.findElement(By.xpath("/html/body/a/i")).click();
	}
}
