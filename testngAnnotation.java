package testngdemo;
//testng works based on priority
//on alphabetical order or numerical order
// can set priority order as well
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class testngAnnotation {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("first");
	}
	
	WebDriver driver;
	@Test
	public void btest1() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	}
	@Test
	public void ctest2() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	}
	@Test
	public void atest3() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	}
	@Test
	public void abtest4() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	}

}
