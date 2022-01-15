package sel.SelOnline2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(500);
		
		WebElement ag = driver.findElement(By.xpath("//*[@id='draggable']/p"));
		
		WebElement op = driver.findElement(By.xpath("//*[@id='droppable']/p"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(ag, op).build().perform();

	}

}
