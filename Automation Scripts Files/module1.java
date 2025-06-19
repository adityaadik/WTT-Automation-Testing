package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class module1 {
	
	@Test
	
	public void Services() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.whitetabletechnology.com/");
		
		System.out.println("The title of the page" + driver.getTitle());
		
				
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div/a")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"navbarCollapse\\\"]/div/div/div/a[2]")));
		WebElement webEle = driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div/div/a[2]"));
		
		 Thread.sleep(2000);
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
		
		 
		 
		 
		 
		
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div/a")).click();
		
		WebElement SAPSol = driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/div/div/a[6]"));
		
		SAPSol.click();
		
		
		
		
		
		
		
		
		

		

		
		
	}

}
