package introduction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Actions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	//Click search bar and type toys using Action class methods.
	//1.Click search bar
		driver.findElement(By.id("twotabsearchtextbox")).click();
	//type toy in search bar using action class	keys mothod
		Actions a=new Actions(driver);
		a.keyUp("T").perform();
		a.keyDown("T").perform();
		
		a.keyUp("O").perform();
		a.keyDown("O").perform();
		
		a.keyUp("Y").perform();
		a.keyDown("Y").perform();
	//click enter for search 			
		a.keyUp(Keys.ENTER).perform();
		a.keyDown(Keys.ENTER).perform();
	//clearing searchbar	
		driver.findElement(By.id("twotabsearchtextbox")).click();
		for(int i=0;i<3;i++) {
			a.keyUp(Keys.BACK_SPACE).perform();
			a.keyDown(Keys.BACK_SPACE).perform();
		}
	//type toy in search bar using action class sendkeys method	
		WebElement searchButton = driver.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys(searchButton,"barbie girl toy",Keys.ENTER).perform();
	}
}
