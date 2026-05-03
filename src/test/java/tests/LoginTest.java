package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest {
	
	    WebDriver driver;
	    LoginPage loginPage;

	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://www.tutorialspoint.com/");
	        loginPage = new LoginPage(driver);
	    }

	    @Test
	    public void testLogin() {
	        loginPage.clickLogin();
	        System.out.println("Test Executed");
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
	}
	

