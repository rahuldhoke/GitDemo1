package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class SelectdateJs2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://preview.keenthemes.com/metronic/demo11/crud/forms/widgets/bootstrap-datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dstDate = driver.findElement(By.xpath("//input[@id='kt_datepicker_1']"));
		String dateValue= "30-12-12";
		//selectDateByJS(driver, dstDate, dateValue);
		System.out.println("Date added");
		
		}
	
	//selectDateByJS(driver, WebElement element,String DateValue){
		//js.executeScript("arguments[0].setAttribute('value','"+DateValue+"');", element);	
	}

