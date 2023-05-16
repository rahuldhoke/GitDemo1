package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownsAutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		
		//once u expand all the child element in dropdown options, each item has a child menu tag
		//we can identify child items bu using this tag
		//li[class='ui-menu-item'] div
		//above li is parent tag and div is child tag, this div helps us in identifying child tag
		//findelements -- when playing with multiple tags - driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		//note above div tag is added which is representing child elements
		//return type of findelements is list-webelment
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys("india");
		List<WebElement> options = 	driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		
		for(WebElement elOptions  :   options ) { // all the child elements will be saved in weeOPtions
			if(elOptions.getText().equalsIgnoreCase("India"));
			elOptions.click();
			System.out.println("Clicked");
			//break;
			
		}
		
	}

}
