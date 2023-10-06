package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		//all.click();
		Select s= new Select(all);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("search-alias=beauty");
		Thread.sleep(3000);
		s.selectByVisibleText("Appliances");
		Thread.sleep(3000);
		


		
		
		
		
		
		
		
		
		driver.close();
		
	
	}

}
