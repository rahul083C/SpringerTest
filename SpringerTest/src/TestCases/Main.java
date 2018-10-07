package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
/*
 * This is the main class which has reusable components and will be called in other test scripts
 * 
 */

public class Main {
	
	public static WebDriver driver;
	
	@BeforeTest

	public void OpenBrowser()  {
		//Used to remove the warning when there is an error shown while running Chrome browser
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get("http://link.springer.com");
		driver.manage().window().maximize();
		System.out.println("Springer App ");
		
	}

	@AfterTest

	public void CloseBrowser() {

		driver.close();
		driver.quit();
	}
}
