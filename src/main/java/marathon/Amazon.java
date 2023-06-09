package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;

public class Amazon {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
			driver.get(" https://www.amazon.co.uk/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
			driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
//			String ss=
			
			
//			driver.findElement(By.id("twotabsearchtextbox")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
//		01) Launch Chrome  
//	02) Load https://www.amazon.in/
//	     add  implicitlyWait
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	03) Type "Bags" in the Search box
//	04) Choose the 	 item in the result (bags for boys)
//	05) Print the total number of results (like 50000)
//	    1-48 of over 50,000 results for "bags for boys"
//	06) Select the first 2 brands in the left menu
//	    (like American Tourister, Generic)
//	07) Choose New Arrivals (Sort)
//	08) Print the first resulting bag info (name, discounted price)
//	09) Get the page title and close the browser(driver.close())	


	}

}
