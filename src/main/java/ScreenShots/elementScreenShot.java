package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class elementScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		WebElement chkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		File elementScreenshot = chkBox.getScreenshotAs(OutputType.FILE); // output type will be file //returns file hence storing it in file
		FileUtils.copyFile(elementScreenshot, new File("./screenshot/element.jpg"));//above elment screenshot will be copined to specf location
		System.out.println("Exeuction finished");

	}

}
