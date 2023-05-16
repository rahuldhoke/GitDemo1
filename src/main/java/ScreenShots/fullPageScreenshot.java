package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fullPageScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		//getFullPageScreenshotAs method is avalible only in firefoxClass/firefoxDriver - hence its acceissible only for firefox	
		//getFullPageScreenshotAs is only going to work for firefox
		//getScreenshotAs for chrome only
		//driver.getfullpagescreeshotas - method is used -- this is coming from TakeScreenshot cast from selenium
		//above method save screenshot in file hence return type is file
		//file class is used to save above screenshot in a location
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		if(driver instanceof FirefoxDriver) {
		File pageScreenshot = 	((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE); //import from sel -- getscreeshotAs method to take screenshot. return type is file
		FileUtils.copyFile(pageScreenshot, new File("./screenshot/page.jpg")); // page screenshot is taken and saved to file
		System.out.println("finished");
		}
		else if(driver instanceof ChromeDriver) {
			File fullPate = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // Takescreeshot import from selenium
			FileUtils.copyFile(fullPate, new File("./screenshot/fullpageChrome.jpg"));
			
		}

	}

}
