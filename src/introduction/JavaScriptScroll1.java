package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScroll1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		
		WebElement add = driver.findElement(By.xpath("//span[text()='Greens Technology Perungudi ']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", add);
		js.executeScript("arguments[0].scrollIntoView()", add);
		Thread.sleep(2000);
		
		WebElement add1 = driver.findElement(By.xpath("//span[text()='Greens Technology Adyar']"));
		//js.executeScript("arguments[0].scrollIntoView(false)", add1);   
	    js.executeScript("arguments[0].scrollIntoView()", add1);
	}
}
