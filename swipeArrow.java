package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class swipeArrow {
  @Test
  
  public void swipe() {
	  
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.whitetabletechnology.com/");
	    System.out.println("The title of the page" + driver.getTitle());
	    
	    driver.findElement(By.xpath("//*[@id=\"header-carousel\"]/button[2]/span[1]")).click();
	    
	   

  }
}
