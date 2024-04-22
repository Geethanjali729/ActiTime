package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Un_Pw {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		int h1 = driver.findElement(By.id("username")).getSize().getHeight();
		int w1= driver.findElement(By.id("username")).getSize().getWidth();
		int h2=driver.findElement(By.name("pwd")).getSize().getHeight();
		int w2=driver.findElement(By.name("pwd")).getSize().getWidth();
		if ((h1==h2 && w1==w2))
		{
			System.out.println("UN and PW is similar in height and width");
		}
		else{
			System.out.println("UN and PW is not similar in height and width");
		}
		driver.quit();

		}
}
