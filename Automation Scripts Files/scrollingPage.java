package WTT;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollingPage {

	
	@Test
	
	public void scrollUpDown() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   
		driver.get("https://www.whitetabletechnology.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    System.out.println("The title of the page" + driver.getTitle());
	    
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
	    
	    
	}
}
