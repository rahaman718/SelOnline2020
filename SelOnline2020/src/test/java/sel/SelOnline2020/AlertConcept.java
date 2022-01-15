package sel.SelOnline2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		Thread.sleep(5000);
		
		//driver.switchTo().alert().sendKeys("for writting");
		//driver.switchTo().alert().dismiss();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.quit();


	}

}
