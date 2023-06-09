package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {

		// Pseudo Code
		// "http://leaftaps.com/opentaps/control/login"

		// 2. Enter UserName and Password Using Id Locator

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		;

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("kusuma");
		driver.findElement(By.id("lastNameField")).sendKeys("malapati");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("lakshmi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("thellapati");

		
//		By locator = By.id("createContactForm_departmentName");
//		WebElement element = driver.findElement(locator);
//		element.sendKeys("cse");
		
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("cse");
		
		
		
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test description");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kusuma@gmail.com");

		Select drpstate = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		drpstate.selectByVisibleText("New York");

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		driver.findElement(By.className("subMenuButton")).click();
		

		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("srinikacharan");

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.close();

	}

}