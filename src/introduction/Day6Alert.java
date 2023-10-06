package introduction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6Alert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
  //nrml Alert		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
  //confirm alert	
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		WebElement out=driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(out.getText());
		//Thread.sleep(5000);
		
 //prompt alert
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert=driver.switchTo().alert(); 
		alert.sendKeys("priya");
		alert.accept();
		WebElement out1=driver.findElement(By.id("demo1"));
		System.out.println(out1.getText());	
	}
}
