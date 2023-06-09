package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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
	    Select drpstate = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
	    drpstate.selectByVisibleText("Cold Call");
	    drpstate.selectByIndex(3);
	    drpstate.selectByValue("LEAD_WEBSITE");
	    System.out.println(driver.getTitle());
	    Select mc=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
	    mc.selectByIndex(2);
	    mc.selectByValue("CATRQ_CARNDRIVER");
	    mc.selectByVisibleText("Demo Marketing Campaign");
	    Select pc=new Select(driver.findElement(By.id("createLeadForm_currencyUomId")));
	    pc.selectByIndex(1);
	    pc.selectByValue("ALL");
	    pc.selectByVisibleText("ADP - Andoran peseta");

	}

}
  