package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomcationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();  //find is checkbox selected or not selected
	
		//click on all check boxes
		//find out common attribute for all the checkboxes
		int totalchkboxes = driver.findElements(By.xpath("//input[@type='checkbox']")).size(); // size gives count of the total checkboxes
		System.out.println(totalchkboxes);
	}

}
