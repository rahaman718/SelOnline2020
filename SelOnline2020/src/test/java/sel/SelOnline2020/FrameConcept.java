package sel.SelOnline2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(200);
		
		List<WebElement> store = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of Frame :"+store.size());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/p[1]")).getText());
		
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='draggable']/p")).getText());
					
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/p[1]")).getText());
		
		//Tage name with iframe or frameset

	}

}
