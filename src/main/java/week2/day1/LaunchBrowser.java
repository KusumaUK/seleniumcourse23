package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
        //EdgeDriver dd=new EdgeDriver();
       // dd.get("http://w3schools.com");
	}

}
