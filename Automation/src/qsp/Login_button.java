package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_button {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
boolean Enabled = driver.findElement(By.name("login")).isEnabled();
if (Enabled==true){
	System.out.println("Login button is enabled");
}
else {
	System.out.println("Login button is disabled");
}
driver.close();

	}

}
