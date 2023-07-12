package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnHoveraction {

	public static void main(String[] args) {
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://www.myntra.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         //locate the element and hover on it
		  WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		  
		  //Actions is a class driver to hover actions
		  Actions act=new Actions(driver);
		 //to do hover action  and action class will not throw any exception
		  act.moveToElement(men).perform();
		  
		  //scroll page,x--->left to right,y--->up and down
		  act.scrollByAmount(0,500).perform();
		  
		  //positive number it will move up
		  //negative number it will move down
		  
		  
		  
		  
	}

}
