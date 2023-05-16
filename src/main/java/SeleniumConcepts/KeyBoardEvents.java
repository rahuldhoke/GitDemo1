package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {
		//Keys.Enter is used to send keys enter control
		//we can pass keys directly or specfic to webelment

		//with action class also we can do that
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/673/identity/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("  ");
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.chord(Keys.CONTROL + "a")).build().perform();
		action.sendKeys(Keys.chord(Keys.CONTROL + "c")).perform();
		driver.findElement(By.xpath("/html/body/main")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL + "v"));
		
		
		

	}

}
