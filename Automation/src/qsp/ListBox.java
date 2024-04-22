package qsp;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(3));
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
WebElement day = driver.findElement(By.id("day"));
Select s = new Select(day);
s.selectByIndex(28);
WebElement month = driver.findElement(By.name("birthday_month"));
Select s1 = new Select(month);
s1.selectByValue("12");
WebElement year = driver.findElement(By.name("birthday_year"));
Select s2 = new Select(year);
s2.selectByVisibleText("2000");
driver.quit();


	}

}
