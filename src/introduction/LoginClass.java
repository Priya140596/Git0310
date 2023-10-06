package introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginClass {

	public static void main(String[] args) {
		//Launch URL in FirefoxBrowser
		WebDriver driver2=new FirefoxDriver();
		driver2.get("http://greenstech.in/selenium-course-content.html");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		
		//Launch URL in IEBrowser
		WebDriver driver3=new InternetExplorerDriver();
		driver3.get("https://www.facebook.com/");
		System.out.println(driver3.getTitle());
		System.out.println(driver3.getCurrentUrl());
		
	}

}
