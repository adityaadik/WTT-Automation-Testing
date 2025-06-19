package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logoLink {

	@Test
	
	public void logoRedirectLink() {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.whitetabletechnology.com/");
		System.out.println("The title of the page" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement logo =driver.findElement(By.xpath("/html/body/div[3]/nav/a"));
		
		logo.click();
	}
}
