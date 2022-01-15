package sel.SelOnline2020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\SelOnline2020\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//FileInputStream file=new FileInputStream("C:\\temp\\Test.xlsx");
		//XSSFWorkbook wb=new XSSFWorkbook(file);
		//XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//DataFormatter data=new DataFormatter();
		
//		 String user=data.formatCellValue(sheet.getRow(1).getCell(0));
//		 String password=data.formatCellValue(sheet.getRow(1).getCell(1));		
//		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
//		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
		Iterator<Row> it = sheet.iterator();	
		
		while(it.hasNext()){
			Row row = it.next();
			Iterator<Cell> cell = row.iterator();
			
			while(cell.hasNext()){
				 System.out.println(data.formatCellValue(cell.next()));
				
				
			}
		}
		

	}

}
