package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//find table
		WebElement table = driver.findElement(By.xpath("//table[@role='grid']"));
		
		//inside table we are doing---->find the rows count
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		

	}

}
