package webdriverbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginintoPetStore {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("j2ee");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("j2ee");
		Thread.sleep(2000);
		driver.findElement(By.name("signon")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
