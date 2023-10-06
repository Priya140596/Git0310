package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day8DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		List<WebElement> l=s.getOptions();
		System.out.println("The num of elements in dropdown are: "+l.size());
		System.out.println("The elements in dropdown are");
		for (WebElement ele : l) {
			System.out.println(ele.getText());
		}
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("orange");
		Thread.sleep(2000);
		s.selectByVisibleText("Apple");
		Thread.sleep(2000);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> l1=s.getAllSelectedOptions();
		System.out.println("The elements selected in dropdown are");
		for (WebElement ele : l1) {
			System.out.println(ele.getText());
		}
		WebElement firstSelect = s.getFirstSelectedOption();
		System.out.println("The first selected option in dropdown is "+firstSelect.getText());
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByValue("apple");
		Thread.sleep(2000);
		s.deselectByVisibleText("Orange");
		Thread.sleep(2000);
		driver.close();
	}
}
