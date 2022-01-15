package sel.SelOnline2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raham\\eclipse-workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//Finding link for entire page 
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println("Total link for the page : "+link.size());
		
		for(int i=0;i<link.size();i++){
			
			System.out.println(link.get(i).getText());
			
		}
		
		
		WebElement header = driver.findElement(By.xpath("//*[@id='menu-top']"));
		
		List<WebElement> headercount = header.findElements(By.tagName("a"));
		
		for(int j=0;j<headercount.size();j++){
			
			System.out.println(headercount.get(j).getText());
		}
		

	}

}
