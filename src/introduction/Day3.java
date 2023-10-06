package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		/*
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("priy@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		
		//myntra
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("3556666444");
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
		//input[@type='tel']
		 */

		//amazon
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
	}

}
