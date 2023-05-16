package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {
	public static void main(String[] args) {
		
		//for dropdown tag should be select
		//drop down elments should be avaliable with xpaths
		
		//WebElement DropDown =  driver.findElement(By.id("dropdowm-menu-1")); // making object for the list box
		//Select select = new Select(DropDown); //creating Select class to to select values from drop down
		// verify if drop down is single select or multiselect  --- boolean ab = select.isMultiple();
		//find total count of elements : 

	

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		driver.findElement(By.name("country")).sendKeys("Germany"); // select value based on name




	

}

}




