package SeleniumConcepts;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOptions {

	public static void main(String[] args) {

			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			opt.setAcceptInsecureCerts(false);//how to bypass ur//connection not safe and more
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(opt);
			driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
			opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation")); // disable the info bar
			opt.addArguments("window-size=1200,800");//changing the browser size
			opt.addArguments("incognito");		//run chrome in private browseing mode
			
			
			

	}

}
