package introduction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.greenstechnologys.com/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		TakesScreenshot ts=(TakesScreenshot)driver;
		File homepage = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:/greenstech/screenshot/greenshomepage.jpg");
		FileUtils.copyFile(homepage, dest);
		
		WebElement header = driver.findElement(By.xpath("//div[@class='vcVZ7d']"));
		File fbheader = header.getScreenshotAs(OutputType.FILE);
		File desti=new File("D:/greenstech/screenshot/fb.png");
		FileUtils.copyFile(fbheader, desti);
	}
}
