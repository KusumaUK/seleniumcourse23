package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kusuma");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("malapati");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("lakshmi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("cse");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test the description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kusuma11@gmail.com");
		Select drpstate = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		drpstate.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		

		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("something important");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
	}

}
