package advanced;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/ ");
		driver.manage().window().maximize();
		//type iphone in search bar,click ok and click on first product from productslist page
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone7",Keys.ENTER);	
		driver.findElement(By.xpath("(//div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[1]")).click();
		//get webpage ids to access them using windowhandle	
		Set<String> ids = driver.getWindowHandles();
		Thread.sleep(2000);
		//adding set to list access using index
		List<String> l=new ArrayList<String>();
		l.addAll(ids);
		String child = l.get(1);
		driver.switchTo().window(child);
		//click on add to cart in child pa1ge and then click on view cart
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		driver.findElement(By.xpath("//div[text()='View Cart']")).click();
		Thread.sleep(2000);
		//type pincode and click on search
		driver.findElement(By.id("pincode-value")).sendKeys("692568");
		driver.findElement(By.id("send-pincode")).click();
		Thread.sleep(2000);
		//get text from page after typing in pin to check availability data and delivery date
		WebElement pin = driver.findElement(By.xpath("//div[@class='pincode-check-disable ']"));
		System.out.println(pin.getText());
		WebElement deli = driver.findElement(By.xpath("//div[@class='col-xs-6 delivery-container']"));
		System.out.println(deli.getText());
		driver.quit();
	}

}
