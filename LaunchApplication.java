package webdriverbasic;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/");
		
		//Display title of the page
		System.out.println("Title of the page is "+driver.getTitle());
		
		//Display Current URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//Display page source
		System.out.println(driver.getPageSource());

	}

}
