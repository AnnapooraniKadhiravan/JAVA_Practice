package webdriverbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentPetStoreSignIn {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        String username = "j2ee" + System.currentTimeMillis();
        String password = "j2ee";

        try {
            driver.manage().window().maximize();
            driver.get("https://petstore.octoperf.com/actions/Catalog.action");

            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign In"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register Now!"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.name("repeatedPassword")).sendKeys(password);

            driver.findElement(By.name("account.firstName")).sendKeys("Jacob");
            driver.findElement(By.name("account.lastName")).sendKeys("Mathew");
            driver.findElement(By.name("account.email")).sendKeys("abc@gmail.com");
            driver.findElement(By.name("account.phone")).sendKeys("9080634529");
            driver.findElement(By.name("account.address1")).sendKeys("Kodathi Gate");
            driver.findElement(By.name("account.address2")).sendKeys("Sarjapur");
            driver.findElement(By.name("account.city")).sendKeys("Bengaluru");
            driver.findElement(By.name("account.state")).sendKeys("Karnataka");
            driver.findElement(By.name("account.zip")).sendKeys("535005");
            driver.findElement(By.name("account.country")).sendKeys("India");

            WebElement languageDropdown = driver.findElement(By.name("account.languagePreference"));
            Select language = new Select(languageDropdown);
            language.selectByVisibleText("english");

            WebElement categoryDropdown = driver.findElement(By.name("account.favouriteCategoryId"));
            Select category = new Select(categoryDropdown);
            category.selectByVisibleText("FISH");

            WebElement myListCheckbox = driver.findElement(By.name("account.listOption"));
            if (!myListCheckbox.isSelected()) {
                myListCheckbox.click();
            }

            WebElement myBannerCheckbox = driver.findElement(By.name("account.bannerOption"));
            if (!myBannerCheckbox.isSelected()) {
                myBannerCheckbox.click();
            }

            driver.findElement(By.name("newAccount")).click();

            wait.until(ExpectedConditions.or(
                    ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign In")),
                    ExpectedConditions.visibilityOfElementLocated(By.name("username"))
            ));

            if (driver.findElements(By.linkText("Sign In")).size() > 0) {
                driver.findElement(By.linkText("Sign In")).click();
            }

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).clear();
            driver.findElement(By.name("username")).sendKeys(username);

            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys(password);

            driver.findElement(By.name("signon")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign Out")));
            System.out.println("Login successful");

            driver.findElement(By.linkText("Sign Out")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign In")));
            System.out.println("Sign out successful");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}