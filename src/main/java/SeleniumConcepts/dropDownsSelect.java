package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownsSelect {

	public static void main(String[] args) throws InterruptedException {

		//All dropp down with select tag arestattic drop down
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement staticDropDown = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		Select drpdown = new Select(staticDropDown);
		drpdown.selectByIndex(1); //selecting by Index
		System.out.println(drpdown.getFirstSelectedOption().getText()); // Retreiving text from drop down
		drpdown.selectByVisibleText("Option2");
		drpdown.selectByValue("Option3"); //this value is preent in theDOM.		
		
	}

}
