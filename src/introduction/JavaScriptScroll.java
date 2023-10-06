package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		
		WebElement chnl = driver.findElement(By.xpath("//a[text()='Youtube Channel']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", chnl);
		Thread.sleep(2000);
		WebElement readMoreLink = driver.findElement(By.xpath("//a[text()='Read More']"));
	    js.executeScript("arguments[0].scrollIntoView(false)", readMoreLink);
	    
	    
	    
		js.executeScript("document.getElementById('username').innerHTML='priya natarajan'");
		  //js.executeScript("document.getElementById('login').click()");		
			
			//js.executeScript("alert('Welcome');");  
	      //Fetching the Domain Name of the site. Tostring() change object to name.		
	        String DomainName = js.executeScript("return document.domain;").toString();			
	        System.out.println("Domain name of the site = "+DomainName);					
	        //Fetching the URL of the site. Tostring() change object to name		
	        String url = js.executeScript("return document.URL;").toString();			
	        System.out.println("URL of the site = "+url);					    		
	       //Method document.title fetch the Title name of the site. Tostring() change object to name		
	       String TitleName = js.executeScript("return document.title;").toString();			
	       System.out.println("Title of the page = "+TitleName);					
	      //Navigate to new Page i.e to generate access page. (launch new url)		
	      js.executeScript("window.location = 'https://demo.guru99.com/'");		
	}
}