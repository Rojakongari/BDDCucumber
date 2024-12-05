package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	@CacheLookup
	public WebElement txt_username;
	
	@FindBy(name="password")
	public WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	public WebElement btn_login;
	
	@FindBy(xpath="//h6[normalize-space()='Dashboard']")
	public WebElement homepage;
	
	/*@FindBy(partialLinkText = "raghav")
	List<WebElement> myLinks;
	
	@FindBy(how = How.ID, using = "name")
	WebElement abc;
	*/
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver,this);
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
				PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		
	}
public void enterUsername(String username) {
		
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		txt_password.sendKeys(password);
	}
	
	public void clickLogin() {
		
	  btn_login.click();
	}
   public void homepageIsDisplayed() {
		
		homepage.isDisplayed();
	}

}
