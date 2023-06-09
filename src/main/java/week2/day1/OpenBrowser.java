package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement wb=driver.findElement(By.id("username"));
		wb.sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		
		
		driver.findElement(By.id("Login")).click();

	}


}
