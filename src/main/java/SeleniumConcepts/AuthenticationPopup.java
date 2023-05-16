package SeleniumConcepts;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws InterruptedException {

		
		//old method -- in url itself provide the id and passowrd	
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin")); // u have to cast and for register add UsernameAndPassword

	}

}
