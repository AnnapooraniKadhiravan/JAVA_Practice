/* Explicity Wait
 * An explicity wait allows you to wait for a specific condition to be met before proceeding with the next step in the test
 * You can use this wait for individual elements with specific condition, such as the element being visible or clickable
 * Explicit waits are more precise and efficient, as they only apply to the specific conditions you define
 * */

package webdriverbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
			//Navigate to saucedemo
			driver.get("https://www.saucedemo.com/");
			// wait up to 10 seconds for username field to be clickable
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("user-name")));
			// Enter username
			usernameField.sendKeys("standard_user");
			System.out.println("Username entered Successfully");
		}
		finally {
			//close browser
			driver.quit();
		}

	}

}
