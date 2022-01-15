package sel.SelOnline2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		//Tagname[@attribute='Value']
		
		//CSS selector
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("Css Concept");
		
		//   tagname[attributes='value']   
		
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Css Concept");
		
		//Travesing xpath
		
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//form[@class='_featuredLogin__formContainer']/div[1]/div[2]/input")).sendKeys("Travesing xpath");
		
	
	
	}

}
