package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kusuma");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("malapati");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kusuma@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("kusuma@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("jykusri12!@");
		
		
		//day
		Select db=new Select(driver.findElement(By.id("day")));
		db.selectByIndex(2);;
		
		//month
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(4);
		
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1980");
		
		
		//sex
		driver.findElement(By.xpath("//label[text()='Female']/following::input")).click();

		
		
//		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("");
		
		
		//
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
//		            ( A normal click will 
		
		
		Thread.sleep(5000);
//		driver.close();

	}

}