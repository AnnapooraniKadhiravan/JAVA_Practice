/*
 * Implicity Wait
 * An Implicity wait is a global timeout that selenium will apply to all element searches
 * This means that selenium will wait for the specified amout of time before throwing a 
  ---- NoSuchElementException is an element is not found in the DOM
 * Once you set an implicit wait, it remains active for the entire session of the WebDriver instance 
 * */

package webdriverbasic;

import java.time.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicityWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
			// Set Implicit wait for 10 seconds
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// Navigate to saucedemo
			driver.get("https://www.saucedemo.com/");
			// find the username field (Implicit wait will apply here)
			WebElement usernameField = driver.findElement(By.id("user-name"));
			//Enter username
			usernameField.sendKeys("standard_user");
			System.out.println("Username entered Successfully");
		}
		finally {
			//close browser
			driver.quit();
		}

	}

}
