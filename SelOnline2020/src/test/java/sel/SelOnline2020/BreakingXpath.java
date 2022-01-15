package sel.SelOnline2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BreakingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		
		
		
		//Tag name
		
		//System.out.println(driver.findElement(By.tagName("h2")).getText());
		
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		
		Thread.sleep(400);
		
		 WebElement el = driver.findElement(By.xpath("//*[@id='month']"));
		
		Select si=new Select(el);
		
		//si.selectByVisibleText("Mar");
		//si.selectByIndex(4);
		//si.selectByValue("5");
		
		
		WebElement rad = driver.findElement(By.name("sex"));
		
		System.out.println(rad.isDisplayed());
		System.out.println(rad.isEnabled());
		System.out.println(rad.isSelected());
		
		//Explicit Wait 
		
		WebDriverWait wait=new WebDriverWait(driver, 20000);
		wait.until(ExpectedConditions.visibilityOf(rad));
		
		
		
	}

}
