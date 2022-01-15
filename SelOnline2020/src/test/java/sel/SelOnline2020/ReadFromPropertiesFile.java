package sel.SelOnline2020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromPropertiesFile {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		FileInputStream file=new FileInputStream("C:\\Users\\hasan\\workspace\\SelOnline2020\\online.properties");
		Properties obj=new Properties();
		obj.load(file);
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(obj.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(obj.getProperty("password"));
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();

	}

}
