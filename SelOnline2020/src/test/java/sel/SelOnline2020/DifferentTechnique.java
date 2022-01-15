package sel.SelOnline2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentTechnique {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Id 
		
		driver.findElement(By.id("email")).sendKeys("Id technique");
		//driver.findElement(By.id("pass")).sendKeys("id for password");
		
		//Name
		
		//driver.findElement(By.name("email")).sendKeys("Name Technique for finding element ");
		
		//LinkText
		
		//driver.findElement(By.linkText("Create New Account")).click();
		
		//Partial Link Text
		
		//driver.findElement(By.partialLinkText("New Account")).click();
		
		
		//useing gettext
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/h2")).getText());
		
		//System.out.println(driver.findElement(By.id("email")).getText());
		
		System.out.println(driver.findElement(By.id("email")).getAttribute("placeholder"));

	}

}
