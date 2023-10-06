package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5DragAndDrop {
	public static void main(String[] args) {
		//drag and drop
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			
			WebElement source1=driver.findElement(By.xpath("//a[text()=' BANK ']"));
			WebElement dest1=driver.findElement(By.id("bank"));
			Actions a=new Actions(driver);
			a.dragAndDrop(source1, dest1).perform();
	
			WebElement source2=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
			WebElement dest2=driver.findElement(By.id("amt7"));
			a.dragAndDrop(source2, dest2).perform();
			
			WebElement source3=driver.findElement(By.xpath("//a[text()=' SALES ']"));
			WebElement dest3=driver.findElement(By.id("loan"));
			a.dragAndDrop(source3, dest3).perform();
				
			WebElement source4=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
			WebElement dest4=driver.findElement(By.id("amt8"));
	        a.dragAndDrop(source4, dest4).perform();
	        
	        WebElement ele=driver.findElement(By.id("equal"));
	        System.out.println(ele.getText());
	}
}
