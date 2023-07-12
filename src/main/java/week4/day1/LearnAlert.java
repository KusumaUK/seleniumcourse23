package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAlert {
	
     @Test
	public  void run() {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//first alert box
		driver.findElement(By.xpath("//span[text()='Show']")).click();
	// second alert box	
		
		
  // bring focus to alert and handle it
		 Alert  a = driver.switchTo().alert();
		  
	  System.out.println(a.getText());
	  a.accept();
// second alert box	(second show button (confirm alert))
	  driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	 System.out.println(a.getText()); 
// already we are switched focus above so we are just using it
	  a.dismiss();

// sweet alert(non modal alert)
//	  driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
//  a.accept();
	  
	  
//click on prompt button, switch to alert,a.sendKeys("jyo"),accept();
	  driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	 a.sendKeys("jyo");
	 System.out.println(a.getText()); 
	 a.dismiss();

	}

}
