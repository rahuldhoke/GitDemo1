import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class pdf {
 
	public static void main(String[] args) throws IOException {
 
		//print method is directly avalible inside chromedriver

		//driver.pint(new PrintOptions())  // printoption constructor will be called
		//driver.pint(new PrintOptions()) -- returns pdf hence stored in pdf
		//Pdf pdf = driver.pint(new PrintOptions())
		//Pdf pdf = (PrintsPage) driver.pint(new PrintOptions()) // we have to do typecasting
		//Files.write(path,savefilepath,outputtype.)
		//Add excetion throws declaration

		//note down the imports properly
		//print to pdf supporst only headless mode
/*
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Pdf pdf = ((PrintsPage) driver).print(new PrintOptions());
		Files.write(Paths.get("./selenium.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		
 */
	}
 
}