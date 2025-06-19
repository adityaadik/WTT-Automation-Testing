package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class footerLogo {
     @Test
     
     public void logoLink() {
    	 
    	 WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();   
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		
 		driver.get("https://www.whitetabletechnology.com/");
 	    System.out.println("The title of the page" + driver.getTitle());
 	    
 	   // driver.findElement(By.xpath("/html/body/div[11]/div/div/div[1]/div/a/img")).click();
 	    
 	    driver.findElement(By.xpath("/html/body/div[11]/div/div/div[1]/div/a")).click();
     }
}
