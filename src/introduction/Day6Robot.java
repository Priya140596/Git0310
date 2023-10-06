package introduction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Robot {
	
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();	
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
	//Click Model Resume and  rightClick resume model 4 the page and click save as.
	//1.Click Model Resume
		driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[3]")).click();
		
	//2.right click resume model 4
		WebElement resumeModel = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		Actions a=new Actions(driver);
		a.contextClick(resumeModel).perform();
	//click save as after right click using robot class
		Robot r=new Robot();
		for(int i=0;i<3;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
