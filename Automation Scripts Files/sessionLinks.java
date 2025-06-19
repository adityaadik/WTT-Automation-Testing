package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sessionLinks {
	
	
	  @Test
	  
	  public void linkss() throws InterruptedException {
		  
		  
		  
         WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://www.whitetabletechnology.com/");
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		  
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	   
	 	  
		   
		 driver.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/div[2]/div[2]/a[2]")).click();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 /*
		 
		 JavascriptExecutor ss = (JavascriptExecutor) driver;
		  ss.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/div[2]/div[2]/a[3]")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 
		 JavascriptExecutor ms = (JavascriptExecutor) driver;
		  ms.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/div[2]/div[2]/a[4]")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 JavascriptExecutor ns = (JavascriptExecutor) driver;
		  ns.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		 
		   driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/div[3]/div[2]/a[1]")).click();
		 driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/div[3]/div[2]/a[1]")).click();
		 driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/div[3]/div[2]/a[1]")).click();
		 driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/div[3]/div[2]/a[1]")).click();
		 driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/div[3]/div[2]/a[5]")).click();
		 driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/div[3]/div[2]/a[5]")).click();        //All links are working
		 
		 */
		 
	  }
}
