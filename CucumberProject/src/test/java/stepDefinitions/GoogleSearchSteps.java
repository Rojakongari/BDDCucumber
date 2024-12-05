package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	WebDriver driver =null;
	
	
	@Given("open google browser")
	public void open_google_browser() {
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("user opens browser");

		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("user is on search page");
		
	}

	@When("user enters text in google search")
	public void user_enters_text_in_google_search() {
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Mobiles");
		System.out.println("user enter text in google search box");
		
			}

	@When("user hits enter")
	public void user_hits_enter() {
		WebElement svgObj = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='path' and @d='M16 16L21 21']"));
		Actions act = new Actions(driver);
		act.click(svgObj).build().perform();
		
		System.out.println("user hits");
			}

	@Then("user navigated to search results")
	public void user_navigated_to_search_results() {
		System.out.println("user is navigated");
			}


}
