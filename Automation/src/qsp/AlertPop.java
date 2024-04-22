package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

driver.get("https://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
driver.switchTo().alert().dismiss();
boolean result = driver.findElement(By.id("demo")).isDisplayed();
String result1 = driver.findElement(By.id("demo")).getText();
	
	if(result1.equals("You Pressed Cancel") && result==true)
	{
		System.out.println("text is displayed");
	}
	else
	{
		System.out.println("text is displayed");
	}

}}
