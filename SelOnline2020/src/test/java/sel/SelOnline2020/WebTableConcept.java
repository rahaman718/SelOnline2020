package sel.SelOnline2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dsebd.org/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//*[@id='bvoluem']/div/table/tbody/tr[2]/td[2]")).getText());

		WebElement table = driver.findElement(By.xpath("//*[@id='bvoluem']/div/table/tbody"));
		
		List<WebElement> row = table.findElements(By.tagName("tr"));
		
		for (int j=0;j<row.size();j++){
				
		List<WebElement> col = row.get(j).findElements(By.tagName("td"));
		
		for(int i=0;i<col.size();i++ ){
			
			System.out.println(col.get(i).getText());
		}

		}
	}

}
