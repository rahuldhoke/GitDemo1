package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll {

	public static void main(String[] args) throws InterruptedException {

				//for sliding we have to use method drag and drop value
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));//xpath of button on slide bar is taken
		//new Actions(driver).dragAndDropBy(slider, 200,0).perform();
		
		//how to move slider to some points or levels
		//findout xpath of slider not button
		WebElement mainSlider = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		int width = mainSlider.getSize().width / 2;
		new Actions(driver).dragAndDropBy(slider, width,0).perform();


	}

}
