package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeElement {

	public static void main(String[] args) throws InterruptedException {


		//for sliding we have to use method drag and drop value
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement resizeElement = driver.findElement(By.xpath("//*[@id=\"resizable\"]"));//xpath of button on slide bar is taken
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizeElement, 400,600).perform();

	}

}
