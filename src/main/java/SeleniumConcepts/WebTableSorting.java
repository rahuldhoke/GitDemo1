package SeleniumConcepts;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableSorting {

	public static void main(String[] args) throws InterruptedException {
		////tr/th[1]  --- 
		//tr - this will highlight entire table
		//th-this will highlight table headers
		//th[1] - this will highlight first cell from first column in the header
		// Rows - for every row we have a tr and td tag
		////tr/td -- will highlight all the celss in the table
		//Highlighting all the cells from the first column - //tr/td[1]
		
		//Capture all the elements into 1list
		
		//List<String> originaList = lstWebElements.stream().map(s-> s.getText()).collect(Collectors.toList());
		//map is used to for retreiving something - map.s-> s.gettext()
		//above retrervied data should be save in some list hence collect(Collectors.tolist)
		//this new data is saved in new List<>
		
		//validate sorting sorting
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_js_sort_table.asp#:~:text=Sort%20Table%20by%20Clicking%20the,ascending%20(A%20to%20Z).");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.chord(Keys.PAGE_UP)).build().perform();
		action.sendKeys(Keys.chord(Keys.PAGE_UP)).build().perform();
		action.sendKeys(Keys.chord(Keys.PAGE_UP)).build().perform();
		driver.findElement(By.xpath("//*[@id=\"main\"]/button")).click();
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		Thread.sleep(2000);
		List<WebElement> lstWebElements = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]")); // all elements from first column saved in list
		List<String> originaList = lstWebElements.stream().map(s-> s.getText()).collect(Collectors.toList());
		List<String> sortedList = originaList.stream().sorted().collect(Collectors.toList()); //sorted the original list
		Assert.assertTrue(originaList.equals(sortedList));
		System.out.println("exeucted ");
		

	}

}
