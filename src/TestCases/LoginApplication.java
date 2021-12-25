package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.ReddifHome;
import objectRepository.ReddifLogin;

public class LoginApplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Ananth/Desktop/New folder (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		ReddifLogin rd= new ReddifLogin(driver);
		rd.Username().sendKeys("Hello");
		rd.Password().sendKeys("Hello");
		//rd.Signin().click();
		rd.Home().click();
		
		ReddifHome rh= new ReddifHome(driver);
		rh.Search().sendKeys("Rediff");
		rh.Searchbttn().click();
		

	}

}
