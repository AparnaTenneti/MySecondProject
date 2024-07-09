package Remove_Products_From_Cart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase17 {
	WebDriver driver;
	@BeforeSuite
	public void BSMethod()
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualTitle=driver.getTitle();
		String expTitle="Automation Exercise";
		if(actualTitle.equals(expTitle))
		{
	System.out.println("Title is correct and Test case passed");
		}
	}
		@Test
		public void Test1()
		{
			driver.findElement(By.xpath("//li/a[@href='/products']")).click();
			driver.findElement(By.xpath("//div[@class='productinfo text-center']/a[@data-product-id='1']/i[@class='fa fa-shopping-cart']")).click();
		driver.findElement(By.xpath("//div[@class='modal-footer']/button")).click();
			driver.findElement(By.xpath("//li/a[@href='/view_cart']")).click();
			WebElement Cart_page=	driver.findElement(By.xpath("/section[@id='cart_items']"));
			if(Cart_page.isDisplayed())
			{
			System.out.println("Cart page displayed");
			
		}
	

			driver.findElement(By.xpath("//a[@class='cart_quantity_delete']")).click();
			WebElement empty=driver.findElement(By.xpath("//p[@class='text-center']/b"));
			if(empty.isDisplayed())
			{
		System.out.println("Product removed");
			}
		
		}
	}


