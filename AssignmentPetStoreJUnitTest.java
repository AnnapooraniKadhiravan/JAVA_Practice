package webdriverbasic;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentPetStoreJUnitTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        // Launch Chrome browser
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Create explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
  

    @Test
    public void testPetStoreDogOrderFlow() {

        String username = "yourRegisteredUsername";
        String password = "j2ee";

        // Step 1: Launch the application
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");

        // Step 2: Click on "Sign In"
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign In"))).click();

        // Step 3: Enter username and password and click "Sign In" button
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("signon")).click();

        // Verify login successful by checking Sign Out link
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign Out")));

        // Step 4: Click on Dogs hyperlink
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Dogs"))).click();

        // Step 5: Click on Dalmatian product id
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("K9-DL-01"))).click();

        // Step 6: Click on Add to Cart next to Female Dalmatian
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//tr[td[contains(text(),'Female Dalmatian')]]//a[text()='Add to Cart']"))).click();

        // Step 7: Verify dog's name and total in the cart
        WebElement dogName = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//td[contains(text(),'EST-10')]")));

        WebElement totalAmount = driver.findElement(
                By.xpath("//td[contains(text(),'$18.50')]"));

        Assertions.assertTrue(dogName.isDisplayed(), "Female Dalmatian item is not displayed in cart");
        Assertions.assertTrue(totalAmount.isDisplayed(), "Total amount is not displayed correctly in cart");

        // Step 8: Click on "Sign Out"
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign Out"))).click();

        // Verify logout successful by checking Sign In link
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign In")));
    }

    @AfterEach
    public void tearDown() {
        // Close browser after test execution
        if (driver != null) {
            driver.quit();
        }
    }
}