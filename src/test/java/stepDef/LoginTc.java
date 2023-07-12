package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTc extends Baseclass{
	
	//for every step create individual methods
	// public ChromeDriver driver;
//	@Given("Launch the Browser")
	
	
	
//@Given("Load the Url")
	
	
	
//use regular expression --->(.*)$
//to parameterize two datas 
	@Given("Enter the username as {string}")
	public void enterUsername(String uname)
	{
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@Then("Click the login")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("HomePage is displayed")
	public void verifyHomePage()
	{
		System.out.println(driver.getTitle());
	}
	
	
	@But("error message is displayed")
	public void verifyErrorMessage()
	{
		System.out.println("check the credential");
	}
	
	

	
}
