package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class phoneNo {
     @Test
     
     public void Num() {
    	 
    	 WebDriver driver = new ChromeDriver();
    		driver.manage().window().maximize();   
    		
    		driver.get("https://www.whitetabletechnology.com/");
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	    System.out.println("The title of the page" + driver.getTitle());

    	     driver.findElement(By.className("me-3 text-light")).click();
     }
}
