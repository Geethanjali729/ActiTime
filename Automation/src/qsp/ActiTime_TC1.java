package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTime_TC1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("http://localhost/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login ']")).click();
driver.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();
driver.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
driver.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder']")).sendKeys("Demo");
driver.findElement(By.xpath("//button[contains(text(),'Please')]")).click();
driver.findElement(By.xpath("//a[text()='HDFC_001']")).click();
driver.findElement(By.xpath("//textarea[@placeholder=\"Add Project Description\"]")).sendKeys("description");
driver.findElement(By.xpath("//span[contains(text(),'Create Project')]")).click();
String title=driver.getTitle();
String atitle="Task List";
if(atitle.equals(atitle)) 
	System.out.println(title + " is matching");
else
System.out.println("title is not matching");
//driver.findElement(By.xpath("//a[text()='All Customers'])")).click();
driver.findElement(By.id("logoutLink")).click();
driver.close();
	}

}
