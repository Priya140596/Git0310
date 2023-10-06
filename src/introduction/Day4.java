package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		/*
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='close']")).click();
		WebElement center=driver.findElement(By.className("trainer-info"));
		System.out.println(center.getText());
		*/
//my example		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("home-tab")).click();
		WebElement e=driver.findElement(By.xpath("//div[contains(text(),'Demo')]"));
		String s=e.getText();
		System.out.println(s);
	/*	
		
//Print the email and password which was entered by user 		
		driver.get("https://www.facebook.com/");
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("priy@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("1234");
		String inputemail=user.getAttribute("value");
		System.out.println(inputemail);
		String inputpass=pass.getAttribute("value");
		System.out.println(inputpass);
*/
//
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("toys");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		
		
	}
}
