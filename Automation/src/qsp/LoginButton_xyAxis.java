package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton_xyAxis {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		int xAxis = driver.findElement(By.id("loginButton")).getLocation().getX();
		int yAxis = driver.findElement(By.id("loginButton")).getLocation().getY();
		System.out.println(xAxis);
		System.out.println(yAxis);
		driver.close();
		

		
	}

}
