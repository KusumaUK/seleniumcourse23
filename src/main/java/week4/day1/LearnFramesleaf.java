package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFramesleaf {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//i need open and close..i need to bring the focus into the frame
		driver.switchTo().frame(0);//index starts with 0
		driver.findElement(By.id("Click")).click();//inside frame
		
		//this will take you out of all the frames to the main content of the page
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.tagName("h5")).getText();
		System.out.println(text);
		
		//to handle nested frame
		//first get into first frame
		//get into second frame 
		//act on the element
		
		driver.switchTo().frame(2);//outer frame
		driver.switchTo().frame("frame2");//inner frame--->id attribute value as arg
		driver.findElement(By.id("click")).click();

		driver.switchTo().defaultContent();
	//	driver.switchTo().parentFrame();//switch b/w two frames present inside one parent
		
		
	}
	

}
