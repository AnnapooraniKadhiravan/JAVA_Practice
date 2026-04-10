package webdriverbasic;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;

public class ScreenshotandcountlinksEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		
		int Totallinksonpage = driver.findElements(By.tagName("a")).size();
		System.out.println("Total Links =" + Totallinksonpage);
		
		int Totalleftpanellinks = driver.findElements(By.xpath("//*[@id ='left_col_top']/ul/li/a")).size();
		System.out.println("Total Links from Left panel =" + Totalleftpanellinks);
		
		int totalSublinksLeftPanel = driver.findElements(By.xpath("//*[@id='left_col_top']/ul")).size();
		System.out.println("Total Sub Links from Panel =" + totalSublinksLeftPanel);
		
		for (int i = 1; i<totalSublinksLeftPanel; i++) {
			int InternalLinks = driver.findElements(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li")).size();
			for (int j=1; j<= InternalLinks;j++) {
				driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li["+j+"]/a")).click();
				String heading = driver.findElement(By.xpath("//*[@id='left_col_top']/ul[" + i + "]/li[" + j + "]/a")).getText();
				System.out.println(heading);
				File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(f1,new File("C:\\Screenshots\\"+ heading+".jpg"));
			}
		}

	}

}
