package seleniumTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeastPriceClick {
	public static void main(String args[]) throws InterruptedException {
        //  WebDriverManager.chromiumdriver().setup();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\BDDFramework\\CucumberProject\\src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //open app
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(6000);
    
        WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("mobile phones");
        
        WebElement searchbutton= driver.findElement(By.id("nav-search-submit-button"));
        searchbutton.click();
        
        //capture prices
        List<WebElement> priceElements = driver.findElements(By.cssSelector("[class='a-price-whole']"));
        //storing in map for sorting
        Map<WebElement, Integer> map= new HashMap<WebElement, Integer>();
        for(int i=0;i<priceElements.size();i++)
        {
        	
        	//removing , in price value and convert to integer
        	//System.out.println(Integer.parseInt(priceElements.get(i).getText().replaceAll(",", "")));
        	//removing null values
        	if(priceElements.get(i).getText()!="")
        	{
        		//putting values into map
        		map.put(priceElements.get(i),Integer.parseInt(priceElements.get(i).getText().replaceAll(",", "")));
        	}
        }
        //sorting prices
        List<Entry<WebElement,Integer>> le = new ArrayList<Map.Entry<WebElement,Integer>>(map.entrySet());

        le.sort(Entry.comparingByValue());
        
        for(Entry e :le) {
			System.out.println(e.getValue());
		}
        //to click least
       // le.get(0).getKey().click();
        
      //to click highest
        le.get(le.size()-1).getKey().click();

}
}

