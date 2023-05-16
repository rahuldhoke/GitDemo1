package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHOver {

	public static void main(String[] args) throws InterruptedException {

		//Mouse Handling also called as Gestured
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement menu = driver.findElement(By.xpath("//li[@id='menu-item-27617']"));
		Actions action = new Actions(driver); //import the actios from selemium and cas the driver by adding arguments
		action.moveToElement(menu).perform();
		driver.findElement(By.linkText("Practice Site 1")).click();

	}

}
