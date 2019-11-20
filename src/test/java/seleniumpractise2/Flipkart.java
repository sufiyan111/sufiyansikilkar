package seleniumpractise2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flipkart {
	
	@Test
	public void flipkart() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sufiyan\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/account/login");
		
		driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("sufiyan_sikilkar@yahoo.com");
		driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div/form/div[2]/input")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div/form/div[3]/button")).click();

		Thread.sleep(9000);
		WebDriverWait w1 =new WebDriverWait(driver,50);
		w1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div/ul/li[1]"))));
		
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div/ul/li[1]"))).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div/ul/li[1]/ul/li/ul/li[3]/ul/li[7]/a")).click();
		
		//List<WebElement> choices= driver.findElements(By.xpath("//div[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div/div/div"));
		//List<WebElement> cost =driver.findElements(By.xpath("//div[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/a[3]/div/div[1]"));
		
		List<WebElement> item =driver.findElements(By.xpath("//div[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/a[2]"));

		System.out.println(item.size());
		for (int i=0; i<item.size(); i++){
			
			String pricelist =item.get(i).getText();
			System.out.println(pricelist);
			System.out.println(pricelist);
			
			System.out.println(pricelist);
			System.out.println(pricelist);
		}
		
		System.out.println("Flipkart");
		System.out.println("Flipkart");
		System.out.println("Flipkart");
		System.out.println("Flipkart");
		System.out.println("Flipkart");
		
		
		
		
		}
		
				
		
	}


