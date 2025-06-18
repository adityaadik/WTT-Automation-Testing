package WTT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class linksofWTT {
	
	
	@Test
	
	public void findlinks() {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.whitetabletechnology.com/");
		System.out.println("The title of the page : " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total number of links in website displayed: "+links.size());
		
		       for(int i = 0; i<links.size();i++) {
			
			System.out.println(links.get(i).getText());
			
			
		   System.out.println("------------------------------------------------------------");
		
	
		       }
		
	}

}
