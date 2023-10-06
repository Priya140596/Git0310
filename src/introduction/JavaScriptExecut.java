package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecut {

	public static void main(String[] args) {
      //launch browser and url
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("username"));
		WebElement pass=driver.findElement(By.id("password"));
		WebElement log=driver.findElement(By.id("login"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	  //using setAttribute method
		js.executeScript("arguments[0].setAttribute('value','priya')", user);
		js.executeScript("arguments[0].setAttribute('value','12345')", pass);
	  // using getAttribute method	
		Object val = js.executeScript("return arguments[0].getAttribute('value')", false);
		System.out.println(val);
		js.executeScript("arguments[0].click()", log);
	}
}
