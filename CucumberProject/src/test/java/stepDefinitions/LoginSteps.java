package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class LoginSteps {
//	WebDriver driver =null;
//	@Given("User is on login page")
//	public void user_is_on_login_page()
//	{
//		String ProjectPath=System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		System.out.println("user opens browser");
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    System.out.println("Inside step - user is on login page");
//	}
//
//
//	@When("^user enters (.*) and (.*) credentials$")
//	public void user_enters_username_and_password_credentials(String username,String password) 
//	{
//		
//		
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		
//		System.out.println("Inside step - user entered credentials");
//	}
//	   	
//
//	@And("click on login button")
//	public void click_on_login_button() {
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		System.out.println("Inside step - user clicks on login button");
//	}
//
//	@Then("user navigated to  homepage")
//	public void user_navigated_to_homepage() {
//		driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
//		System.out.println("Inside step - user is on home page");
//		driver.close();
//		driver.quit();
//	}
//	
//	
//	
//
//}
