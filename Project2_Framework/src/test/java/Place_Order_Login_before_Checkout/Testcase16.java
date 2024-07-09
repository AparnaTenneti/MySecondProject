package Place_Order_Login_before_Checkout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testcase16 {
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
			driver.findElement(By.xpath("//li/a[@href='/login']")).click();
			WebElement ActlPage=driver.findElement(By.xpath("//div[@class='login-form']/h2"));

			if(ActlPage.isDisplayed())
			{
		System.out.println("Page is correct and Test case passed");
			}
			else
			{
				System.out.println("Page is not correct and Test case failed");
			}
			driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("ramakuri@gmail.com");
			driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("surya123");
		    driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		    
		WebElement User=driver.findElement(By.xpath("//i[@class='fa fa-user']"));
		if (User.isDisplayed())
		{
			System.out.println("Logged user name visible and Testcase passed");
		}
		
		}
		@Test
		public void Test2()
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
		driver.findElement(By.xpath("//div[@class='col-sm-6']/a")).click();
		
WebElement Address=driver.findElement(By.xpath("//div[@class='step-one']/h2[@class='heading']/preceding::div[@class='checkout-information']/following::div[@class='step-one']/h2"));
    	
    	

    	if(	Address.isDisplayed()) {
    		System.out.println("AddressDetails Displayed");
    	}
    	else
    		System.out.println("Address details not displayed");
    	
    	WebElement review=driver.findElement(By.xpath("//div[@class='step-one']/h2[@class='heading']/preceding::div[@class='checkout-information']"));
    	
    	
    		if(review.isDisplayed()) {
    			System.out.println("Review order Displayed");
    		}
    		else
    			System.out.println("Review order not displayed");
    		
 
		
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Happy Birthday Dear");
		driver.findElement(By.xpath("//a[@href='/payment']")).click();
		driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("aruna");
		driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("6079091554006488");
		driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("822");
		driver.findElement(By.xpath("//input[@name='expiry_month']")).sendKeys("01");
		driver.findElement(By.xpath("//input[@name='expiry_year']")).sendKeys("2025");
		driver.findElement(By.xpath("//button[@data-qa='pay-button']")).click();
		
		WebElement Success=driver.findElement(By.xpath("//div[@id='success_message']"));
    	if(Success.isDisplayed())
    	{
    		System.out.println("Your order has been placed successfully! is displayed");
    	}
		}
		@AfterSuite()
		public void SuitAfter()
		{
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		System.out.println("Account Deleted");
		

		}
		
	}


