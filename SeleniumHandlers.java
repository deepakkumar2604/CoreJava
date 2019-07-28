
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumHandlers {

public static void main(String[] args) {
	

	
	System.setProperty("Webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\Desktop\\\\\\\\Driver\\\\\\\\chromedriver.exe");
	
	WebDriver driver = new WebDriver();
	
	driver.get("https://www.hdfcbank.com/");
		driver.close();
	
	
	
}

}