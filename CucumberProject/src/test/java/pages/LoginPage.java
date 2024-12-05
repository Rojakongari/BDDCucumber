package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//public class LoginPage {
//	
//	WebDriver driver;
//
//	private By txt_username = By.xpath("//input[@placeholder='Username']");
//	
//	private By txt_password = By.name("password");
//	
//	private By btn_login = By.xpath("//button[normalize-space()='Login']");
//	private By homepage= By.xpath("//h6[normalize-space()='Dashboard']");
//	
//	//private By btn_logout = By.id("logout");
//	
//	public LoginPage(WebDriver driver)
//	{
//		this.driver=driver;
//		
//	}
//	
//		
//	
//	public void enterUsername(String username) {
//		
//		driver.findElement(txt_username).sendKeys(username);
//	}
//	
//	public void enterPassword(String password) {
//		
//		driver.findElement(txt_password).sendKeys(password);
//	}
//	
//	public void clickLogin() {
//		
//		driver.findElement(btn_login).click();
//	}
//   public void homepageIsDisplayed() {
//		
//		driver.findElement(homepage).isDisplayed();
//	}
//	
//	/*public void loginValidUser(String username, String password) {
//		
//		driver.findElement(txt_username).sendKeys(username);
//		driver.findElement(txt_password).sendKeys(password);
//		driver.findElement(btn_login).click();
//	}*/
//	
//	
//	
//}
//
//
