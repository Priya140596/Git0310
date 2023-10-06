package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {
	public static void main(String[] args) {
	//mouse hover
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
	//mouse hover All departments tab
		WebElement allDeptbtn=driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions a=new Actions(driver);
		a.moveToElement(allDeptbtn).perform();
	//2nd mouse hover heating,cooling under All dept tab
		WebElement heatCoolbtn=driver.findElement(By.xpath("(//a[contains(text(),'Heating')])[1]"));		
		a.moveToElement(heatCoolbtn).perform();		
    //3rd mouse hover Air Conditioners under heating,cooling
		WebElement ac=driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));		
		a.moveToElement(ac).perform();	
	//click portable ac	
		driver.findElement(By.xpath("//a[contains(text(),'Portable')]")).click();	
	}	
}
