package webdriverbasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launchbrowser {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		EdgeDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		
	}

}
