package advanced;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
	//open url https://www.hyrtutorials.com/p/window-handles-practice.html (parent1page)
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); 
		driver.manage().window().maximize();
	//click on 'open new window' button-child page1
		WebElement btn1 = driver.findElement(By.id("newWindowBtn"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", btn1);
		btn1.click();
		System.out.println("parent page url,home page"+driver.getCurrentUrl());
	//control to child page 1
		String parent = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		for(String allwindow :ids) {
			if(allwindow!=parent) {
				driver.switchTo().window(allwindow);
			}
		}
	//maximize child page 1 and click join telegram button
		System.out.println("Child page 1 url,new window page url"+driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='widget-content'])[9]")).click(); 
		Thread.sleep(2000);
	//control to new tab opening for telegram(child page 2)
		Set<String> child_ids = driver.getWindowHandles();
		List<String> childs=new ArrayList();
		childs.addAll(child_ids);
		driver.switchTo().window(childs.get(2));
		System.out.println("Child page 2 url,telegram join url"+driver.getCurrentUrl());
	//click on preview channel from child page2
		driver.findElement(By.xpath("//a[text()='Preview channel']")).click();
		Thread.sleep(2000);
	//switch control again to home page and click new tab button
		driver.switchTo().window(childs.get(0));
		System.out.println("home page url"+driver.getCurrentUrl());
		WebElement btn2 = driver.findElement(By.id("newTabBtn"));
		js.executeScript("arguments[0].scrollIntoView(true)", btn2);
		btn2.click();
		Thread.sleep(2000);
	//switch control new child page after clicking new tab button
		Set<String> childs_ids = driver.getWindowHandles();
		List<String> childss=new ArrayList();
		childss.addAll(childs_ids);
		driver.switchTo().window(childss.get(3));
		System.out.println("new tab btn"+driver.getCurrentUrl());
	//generate alert box and click ok
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
	}
}
