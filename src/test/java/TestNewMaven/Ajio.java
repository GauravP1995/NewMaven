package TestNewMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
	@Test
	public void TestAjio() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers For Selenium\\chromedriver.exe\\");
		ChromeOptions options = new ChromeOptions();
	 	 options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		Reporter.log("Opening Ajio", true);
		driver.get("https://www.ajio.com/");
		driver.manage().deleteAllCookies();
	//	Thread.sleep(3000);
		driver.close();
	}
}
