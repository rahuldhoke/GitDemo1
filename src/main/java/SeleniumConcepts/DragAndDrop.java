package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		//Drag and Drop
			//find out path of first element and create webelemnt
			//find our path of second lemetm and create weblement
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dragMe = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dropMe = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragMe, dropMe).perform();
		
		

	}

}
