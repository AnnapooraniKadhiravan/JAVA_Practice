/* FLUENT WAIT
 * A Fluent wait is a more flexible version of the explicit wait
 * It allows you to configure how frequently selenium checks the condition(polling interval), how long it waits before
 * -----timing out (maximum wait time) and which exceptions it should ignore (like NoSuchElementException)
 * This is ideal for situation where elements load unpredictably or asynchronously
 * */

package webdriverbasic;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("invalid_user");
			driver.findElement(By.id("password")).sendKeys("wrong_password");
			driver.findElement(By.id("login-button")).click();
			Wait<WebDriver>wait = new FluentWait<>
			(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
			WebElement errorMessage = wait.until(wd->wd.findElement(By.cssSelector("h3[data-test='error']")));
			System.out.println("Error Message: "+ errorMessage.getText());
		}
		finally {
			driver.quit();
		}

	}

}
