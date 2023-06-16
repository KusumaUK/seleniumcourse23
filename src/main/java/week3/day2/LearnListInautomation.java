package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnListInautomation {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);
//			Thread.sleep(2000);
//	      to find all the elements with common attribute -->
//			driver.findElement(By.xpath("(//div[text()='mobiles'])[2]")).click();
         List<WebElement> mprice = driver.findElements(By.xpath("//span[@class='s-heavy']")); 
         int size = mprice.size();
         List<String> price=new ArrayList<String>();
//        System.out.println(mprice.size());
         
                for(int i=0;i<size;i++) {
	            String text = mprice.get(i).getText();
                price.add(text);
        }
                
   //convert the list<WebElement>----->List<String>
                Collections.sort(price);
               String min= Collections.min(price);
               System.out.println(min);
                
//	        
//	        //to particular links in the webpage
//	        links.get(4).click();
//		

	}

}
