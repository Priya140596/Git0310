package advanced;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		
		List<WebElement> head = table.findElements(By.tagName("th"));
		int heading = head.size();
		System.out.println("heading count:"+heading);
		List<WebElement> row = table.findElements(By.tagName("tr"));
		int rsize = row.size();
		System.out.println("row size:"+rsize);
		List<WebElement> cell = table.findElements(By.tagName("td"));
		int csize = cell.size();
		System.out.println("cell size:"+csize);
		
//		for(WebElement e:head) {
//			System.out.println(e.getText());
//		}
//		
//		for(int i=0;i<rsize;i++) {
//			System.out.println("row num"+i+"elements are");
//			System.out.println(row.get(i).getText());
//		}
		System.out.println("--------------");
		for(int i=0;i<csize;i++) {
			System.out.println("cell num"+i+"element is");
			System.out.println(cell.get(i).getText());
		}

	}
}
