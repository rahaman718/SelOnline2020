package sel.SelOnline2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {


		//Open the Browser 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		System.out.println("This is the home page title :"+driver.getTitle());
		
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("Facebook - Log In or Sign Up")){
			
			System.out.println("Opened the right page ");
		}
		else
		{
			System.out.println("Opened wrong page ");
		}
		
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Somebody seems like ......");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Password...... ");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Somebody seems like ......");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password...... ");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
		//*[@id="email"]
		
		//Tag name[@Attribute='value']
		//input[@name='email']
		
		//<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email or Phone Number" autofocus="1" aria-label="Email or Phone Number">
	
	}
	

}
