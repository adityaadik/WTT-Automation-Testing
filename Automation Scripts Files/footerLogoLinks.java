package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class footerLogoLinks {
	
	@Test
	
	public void footerlogo() {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.whitetabletechnology.com/");
		System.out.println("The title of the page" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		  
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	driver.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/div[1]/div[6]/a[4]")).click();    //i   insta
		
	driver.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/div[1]/div[6]/a[1]")).click();    // twitter (x)
		
		//driver.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/div[1]/div[6]/a[2]")).click();   //   fb

	//	WebElement logo =driver.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/div[1]/div[6]/a[3]")); //linkedin
		
		//logo.click();
		}

}
