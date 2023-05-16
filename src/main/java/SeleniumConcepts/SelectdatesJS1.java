package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectdatesJS1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://preview.keenthemes.com/metronic/demo11/crud/forms/widgets/bootstrap-datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dstDate = driver.findElement(By.xpath("//input[@id='kt_datepicker_1']"));
		String dateValue= "30-12-12";
		selectDateByJS(driver, dstDate, dateValue);
		System.out.println("Date added");
		
		
		WebElement dstDate1 = driver.findElement(By.xpath("//input[@id='kt_datepicker_2']"));
		String dateValue1= "30-12-12";
		selectDateByJS(driver, dstDate1, dateValue1);
		System.out.println("Date added 2nd times");
		
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver); //casting webdrive to java script
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	}

}

