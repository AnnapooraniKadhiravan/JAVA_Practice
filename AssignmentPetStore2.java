package webdriverbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentPetStore2 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Use the same username and password that were successfully registered earlier
        String username = "j2ee";
        String password = "j2ee";
        String updatedLastName = "Johnson";

        try {
            // Maximize browser window
            driver.manage().window().maximize();

            // Open application
            driver.get("https://petstore.octoperf.com/actions/Catalog.action");

            // Click Sign In
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign In"))).click();

            // Enter username
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).clear();
            driver.findElement(By.name("username")).sendKeys(username);

            // Enter password
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys(password);

            // Click Sign In / Login button
            driver.findElement(By.name("signon")).click();

            // Wait until Sign Out is visible -> confirms successful login
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign Out")));

            // Now click My Account
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Account"))).click();

            // Clear old last name
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("account.lastName"))).clear();

            // Enter new last name
            driver.findElement(By.name("account.lastName")).sendKeys(updatedLastName);

            // Click Save Account Information button
            driver.findElement(By.name("editAccount")).click();

            // Wait until My Account is visible again after save
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Account")));

            // Logout
            driver.findElement(By.linkText("Sign Out")).click();

            // Confirm logout by checking Sign In link
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign In")));

            System.out.println("Last name updated and logout successful");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}