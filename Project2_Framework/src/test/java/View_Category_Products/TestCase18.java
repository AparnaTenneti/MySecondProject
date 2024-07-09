package View_Category_Products;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase18 {
	WebDriver driver;
	@BeforeSuite
	public void BeforeMethod()
	{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	@Test
	public void test1()
	{
		driver.get("http://automationexercise.com");
		WebElement categoryList=driver.findElement(By.xpath("//div[@id='accordian']"));
		if(categoryList.isDisplayed())
		{
		System.out.println("Categories are visible");
		}
		driver.findElement(By.xpath("//a[@href='#Women']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/2']")).click();
		WebElement WomenList=driver.findElement(By.xpath("//h2[@class='title text-center']"));
		if(WomenList.isDisplayed())
		{
		System.out.println("selected category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS");
		}
		driver.findElement(By.xpath("//a[@href='#Men']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/6']")).click();
		WebElement MenList =driver.findElement(By.xpath("//h2[@class='title text-center']"));
		if(MenList.isDisplayed())
		{
		System.out.println("It's navigated to men categories");
		}
	}
	


}
