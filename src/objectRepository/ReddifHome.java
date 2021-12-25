package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifHome {
	WebDriver driver;
	public ReddifHome(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="srchword")
		WebElement Searchbar;
		
		@FindBy(className="newsrchbtn")
		WebElement Searchbutton;
		
		public WebElement Search()
		{
			return Searchbar;
		}
		public WebElement Searchbttn()
		{
			return Searchbutton;
		}
}
