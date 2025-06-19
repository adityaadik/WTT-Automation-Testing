package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class unwantedsymbol {

	
	
	@Test
	
	public void sym() {
		
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.whitetabletechnology.com/");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/i")).click();
		
		
	}
}
