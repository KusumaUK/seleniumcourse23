package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends Baseclass{
	
	@When("Enter the CompanyName")
    public void enterCname()
    {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
    }
	@When("Enter the FirstName")
	public void enterFname()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	}
	
	@When("Enter the LastName")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	}
	
	@Then("Click the createlead button")
	public void clickcreateLeadButton()
	{
		
	}
	
}
