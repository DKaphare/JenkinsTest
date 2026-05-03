package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


	    WebDriver driver;

	    By login = By.xpath("//a[text()='Login']");

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickLogin() {
	        driver.findElement(login).click();
	   }
	}
