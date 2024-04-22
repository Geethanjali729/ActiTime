package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	Driver_Launch.testA(driver);
	WebDriver driver1=new FirefoxDriver();
	Driver_Launch.testA(driver);
	
}
	
	

	
	}


