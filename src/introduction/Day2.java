package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.id("email")).sendKeys("priy@gmail.com");
		driver1.findElement(By.id("pass")).sendKeys("1234");
		//driver1.close();
		
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://www.redbus.in/");
		Thread.sleep(10000);
		driver2.findElement(By.xpath("(//text[@class='placeHolderMainText'])[1]")).sendKeys("Chennai");
		driver2.findElement(By.xpath("(//text[@class='placeHolderMainText'])[2]")).sendKeys("Sholinganallur");
		//driver2.close();
		
	}
}
