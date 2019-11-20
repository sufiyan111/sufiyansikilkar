package seleniumpractise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Snapdeal {
	
	int finalprice;
	ArrayList<Integer> originallist =new ArrayList<Integer>();


	@Test
	public void snapdeal() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sufiyan\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
		
		driver.get("https://www.snapdeal.com/");
		
		Thread.sleep(1000);
		WebDriverWait w1 =new WebDriverWait(driver,50);
		w1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class ='leftNavWrapperRevamp']/div/ul/li[4]"))));
		
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class ='leftNavWrapperRevamp']/div/ul/li[4]"))).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class ='leftNavWrapperRevamp']/div/ul/li[4]/div/div[1]/div/div/p[15]/a/span")).click();
		
		//List<WebElement> choices= driver.findElements(By.xpath("//div[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div/div/div"));
		
		List<WebElement> cost =driver.findElements(By.xpath("//div[@id='products']/section/div/div[3]/div/a/div/div/span[2]"));
		
		//List<WebElement> item =driver.findElements(By.xpath("//div[@id='products']/section/div/div[3]/div/a/p"));

		for (int i=0; i<cost.size(); i++){
			
			String pricelist =cost.get(i).getText().replaceAll("Rs. ", "");
			String formatpricelist =pricelist.replaceAll(",", "");
			
			
			finalprice =Integer.parseInt(formatpricelist);
			
			System.out.println(finalprice);
			
			if(finalprice ==499){
				
			driver.findElement(By.xpath("//div[@id='products']/section/div/div[3]/div/a/div/div/span[2]")).click();
				break;
				
			}
			//System.out.println(finalprice);
			//originallist.add(finalprice);
		}
		
		/*System.out.println(originallist.size());

		Collections.sort(originallist);
		System.out.println(originallist);
		Collections.reverse(originallist);
		
		int min=Collections.min(originallist);
		System.out.println(min);
		
		int max=Collections.max(originallist);
		System.out.println(max);
		*/
		
		
		
		}
}
