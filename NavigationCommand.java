package webdriverbasic;

import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommand {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/");
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
