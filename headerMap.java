package WTT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class headerMap {
@Test

    public void MapClick() {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();   
	
	driver.get("https://www.whitetabletechnology.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    System.out.println("The title of the page" + driver.getTitle());

     driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/small[1]")).click();
}
}
