package amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@type='text']"));
		searchbar.click();
		searchbar.sendKeys("iphone 12");
		
		WebElement seabutton= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		seabutton.click();
		
		List<WebElement> name= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement ele:name) {
			
			System.out.println(ele.getText());
		}
		
		 List<WebElement> price=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 
		 
		 for(WebElement ele1:price) {
			 System.out.println(ele1.getText());
			 
		 }
		
		
		
		
		
		

	}
}
