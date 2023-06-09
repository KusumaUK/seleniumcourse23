package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("test company name");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kusuma");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("malapati");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("lakshmi");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("cse");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("test description");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kusuma11@gmail.com");
        Select drpstate = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		drpstate.selectByVisibleText("New York");
		System.out.println(driver.getTitle());


        
//        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kusuma11")
	    }

	
	}

//1. Launch URL "http://leaftaps.com/opentaps/control/login"
//2. Enter UserName and Password Using Id Locator
 //3. Click on Login Button using Class Locat4. Click on CRM/SFA Link
//5. Click on Leads Button
//6. Click on Create Lead 
//7. Enter CompanyName Field Using id Locator
//8. Enter FirstName Field Using id Locator
//9. Enter LastName Field Using id Locator
//10. Enter FirstName(Local) Field Using id Locator
//11. Enter Department Field Using any Locator of Your Choice
//12. Enter Description Field Using any Locator of your choice 
//13. Enter your email in the E-mail address Field using the locator of your choice
//14. Select State/Province as NewYork Using Visible Text
//15. Click on Create Button
//        16. Get the Title of Resulting Page. refer the video  using driver.getTitle()

