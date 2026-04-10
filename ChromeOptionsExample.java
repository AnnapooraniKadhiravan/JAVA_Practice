package webdriverbasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a chromeOption object
		ChromeOptions options = new ChromeOptions();
		
		// Add arguments for headless mode and maximized window
		options.addArguments("--headless");
		options.addArguments("--Start-maximized");
		
		//Accept insecure certificates
		options.setAcceptInsecureCerts(true);
		
		//Initialize ChromeDriver with the configured options
		ChromeDriver driver = new ChromeDriver(options);
		
		//perform automation tasks
		driver.get("https://www.selenium.dev/");
		System.out.println("Page title: "+ driver.getTitle());
		
		//close the browser
		driver.quit();
	}

}
