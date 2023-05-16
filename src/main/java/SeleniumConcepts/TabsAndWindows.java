package SeleniumConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/#/practice-project");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.switchTo().newWindow(WindowType.TAB); // creating code for tab
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); //regula get to open url
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Chin");//
		System.out.println(driver.getTitle());
		
		
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.google.com/"); //regula get to open url
		System.out.println(driver.getTitle());
		
		int totWin = driver.getWindowHandles().size(); // find total number of open browsers
		System.out.println(totWin);
		
		
		
		        Set<String> handdles =  driver.getWindowHandles(); // all windows saved in handle, return type is set String
		        Iterator<String> it =  handdles.iterator();
		        
		        List<String> winIndex = new ArrayList<String>();
		      
		       while (it.hasNext()) {
		    	  winIndex.add(it.next());
		       }
		       
		       driver.switchTo().window(winIndex.get(0));
		       System.out.println(driver.getTitle());
		       driver.close();
		       
		       driver.switchTo().window(winIndex.get(1));
		       System.out.println(driver.getTitle());
		       driver.close();
		       
		       driver.switchTo().window(winIndex.get(2));
		       System.out.println(driver.getTitle());
		       
		       driver.quit();
		       
	}

}
