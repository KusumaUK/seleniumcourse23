package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()[normalize-space()='Login']]")).click();
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();	

	}

}
