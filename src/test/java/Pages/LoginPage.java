package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	static WebDriver driver;
	By login= By.xpath("//a[text()=\"Login\"]");
	@BeforeTest
	public void Setup() {
	 driver= new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/");
	
	}
	
	@Test
	public void LoginCheck() {
		driver.findElement(login).click();
	}	
	@AfterTest
	public void quit() {
		driver.quit();
	}
}
