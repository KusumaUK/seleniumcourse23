package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//retrieving the current active(opened) window address
		
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
	//	System.out.println(driver.getTitle());
		
		//to get all the windows that is opened by the application
		Set<String> windowHandles = driver.getWindowHandles();//set will hold only unique values
		System.out.println(windowHandles.size());
	//	System.out.println(driver.getTitle());
	
		//to go to the second window
	//	driver.switchTo().window(windowHandle);
		//i'm using for each to print the windows address
		for(String wh : windowHandles)
			System.out.println(wh);
   //convert set into list
		List<String> winhand=new ArrayList<String>(windowHandles);
		driver.switchTo().window(winhand.get(1));
		System.out.println(driver.getTitle());
		//get back to parent window
		driver.switchTo().window(winhand.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> mulwind = driver.getWindowHandles();
		List<String> listwin=new ArrayList<String>(mulwind);
		driver.switchTo().window(listwin.get(2));
	
	//for ex we have 3 opened windows, i need to close all windows other than my main window then how to handle it?
		for(int i=1;i<listwin.size();i++ )
		{
			driver.switchTo().window(listwin.get(i));
			driver.close();
		}
		
		
	}

}


