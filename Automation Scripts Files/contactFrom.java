package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class contactFrom {
	
	@Test
	
	public void form() {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();   
	
	driver.get("https://www.whitetabletechnology.com/");
System.out.println("The title of the page" + driver.getTitle());


	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement scrolldown = driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/a[3]"));
	scrolldown.click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");


	//js.executeScript("arguments[0].scrollIntoView(true);", scrolldown);
	
	
	
	driver.findElement(By.name("uname")).sendKeys("Aditya");
	
	driver.findElement(By.name("umail")).sendKeys("aditya@gmail.com");
	driver.findElement(By.name("usub")).sendKeys("Regarding Interview");
	
	driver.findElement(By.name("uarea")).sendKeys("I want an Appointment for Interview");
	
	driver.findElement(By.xpath("\"//input[@value='submit']\"")).click();    //not clicking on Send Message button


}
}


