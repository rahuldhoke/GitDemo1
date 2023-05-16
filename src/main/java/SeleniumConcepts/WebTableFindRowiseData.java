package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableFindRowiseData {

	public static void main(String[] args) throws InterruptedException {
		//Find price of specfiec vegetables
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_js_sort_table.asp#:~:text=Sort%20Table%20by%20Clicking%20the,ascending%20(A%20to%20Z).");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.chord(Keys.PAGE_UP)).build().perform();
		action.sendKeys(Keys.chord(Keys.PAGE_UP)).build().perform();
		action.sendKeys(Keys.chord(Keys.PAGE_UP)).build().perform();
		driver.findElement(By.xpath("//*[@id=\"main\"]/button")).click();
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		Thread.sleep(2000);
		List<WebElement> lstWebElements = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]")); // all elements from first column saved in list
		//lstWebElements.stream()
	}

}
