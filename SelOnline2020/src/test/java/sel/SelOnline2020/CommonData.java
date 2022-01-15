package sel.SelOnline2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonData {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Data data=new Data();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.user_name);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(data.password);
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();

	}

}
