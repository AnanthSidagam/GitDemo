package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifLogin {
	WebDriver driver;
	public ReddifLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	By username= By.id("login1");
	By password= By.id("password");
	By signin= By.name("proceed");
	By Home= By.linkText("rediff.com");
	
	public WebElement Username()
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement Signin()
	{
		return driver.findElement(signin);
	}
	public WebElement Home()
	{
		return driver.findElement(Home);
	}
	
	
}
