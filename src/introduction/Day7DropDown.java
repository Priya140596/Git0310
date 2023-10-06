package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day7DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(all);
		//selecting Amazon Pharmacy which is at 5th index position 
		s.selectByIndex(5);

		Thread.sleep(3000);
		//selecting Garden & Outdoors using its value
		s.selectByValue("search-alias=lawngarden");
		
		Thread.sleep(3000);
		//selecting Toys & Games using text
		s.selectByVisibleText("Toys & Games");
		
		//get number of elements present in dropdown
		List<WebElement> elements = s.getOptions();
		System.out.println("The number of elements in dropdown list are: "+elements.size());
		//get first 10 elements in dropdown 
		System.out.println("------first 10 elements from dropdown list excluding frst in list------");
		for(int i=1;i<=10;i++) {
			WebElement e = elements.get(i);
			System.out.println(e.getText());
		}
		//get all list of elements in dropdowm 
		System.out.println("------All the elements in dropdown are------");
		for (WebElement i : elements) {
			System.out.println(i.getText());
		}
		//multiselect dropdown
		
		
		
		

	}

}
