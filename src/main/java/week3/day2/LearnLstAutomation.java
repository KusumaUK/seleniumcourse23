package week3.day2;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLstAutomation {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
		//to find all the elements with common attribute--->link-->a
		
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			String text = links.get(i).getText();
			System.out.println(text);
		}
		//to click particular links in the webpage   
		
        links.get(4).click();
		
		

	}

}
