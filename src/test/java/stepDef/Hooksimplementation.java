package stepDef;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksimplementation extends Baseclass {

	
  
  //cucumber annotation
  @Before
  public void preCondition()
  {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
  }
	
  
  @After
	public void postCondition()
	{
		driver.close();
	}
	
}
