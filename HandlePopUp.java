/* HANDLING POP UP IN SELENIUM
 * To handle the pop up alert class from selenium should be used
 * .SwitchTo() --> Switching to pop up
 * .accept()  --> ok or yes button on pop up will be achieved
 * .dismiss() --> Cancel button on pop up will be achieved
 * .getText() --> reads the text on pop up
 * 
 * */



package webdriverbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlePopUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		Alert pop = driver.switchTo().alert();
		pop.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		System.out.println(pop.getText());
		Thread.sleep(2000);
		pop.dismiss();
		String Display = driver.findElement(By.id("demo")).getText();
		System.out.println(Display);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		Thread.sleep(2000);
		System.out.println(pop.getText());
		pop.sendKeys("Wipro Limited");
		pop.accept();
		String displayText = driver.findElement(By.id("demo1")).getText();
		System.out.println(displayText);
		

	}

}
