package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.co.uk/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
	   WebElement s= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span"));
		
	System.out.println(s.getText());
	Thread.sleep(2000);
	WebElement firstcheckbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
	driver.executeScript("arguments[0].click()", firstcheckbox);
	Thread.sleep(2000);
	WebElement secondcheckbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
	driver.executeScript("arguments[0].click()", secondcheckbox);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	01) Launch Chrome  
//02) Load https://www.amazon.in/
//     add  implicitlyWait
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//03) Type "Bags" in the Search box
//04) Choose the 	 item in the result (bags for boys)
//05) Print the total number of results (like 50000)
//    1-48 of over 50,000 results for "bags for boys"
//06) Select the first 2 brands in the left menu
//    (like American Tourister, Generic)
//07) Choose New Arrivals (Sort)
//08) Print the first resulting bag info (name, discounted price)
//09) Get the page title and close the browser(driver.close())	


}

}
	


		
		

	
