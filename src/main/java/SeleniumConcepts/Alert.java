package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		
		//Method 1
		/*
		org.openqa.selenium.Alert alert =  driver.switchTo().alert();
		alert.accept();
		*/
		
		//Method 2
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		

	}

}
