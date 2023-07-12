package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String iframeResult;
		//switch to the frame
//		WebDriver frame = driver.switchTo().frame(iframeResult);
//		driver.findElement(By.xpath("//button[text()="Try it"]).click();
		
		
		
		
		
		
//		https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm 
//			Click Try It Button
//			Click OK/Cancel in the alert
//			Confirm the action is performed correctly by verifying the text !!
//			 
//			 *Hint*
//			Switch to the frame
//			Then click Try It with xpath
//			Switch to the alert and Enter your name in alert box
//			Then perform accept / dismiss
//			Get the text using id 
//			Verify the text based on the action
//	}
	

}
}
