

package Login_User_correct_email_password;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualTitle=driver.getTitle();
		String expTitle="Automation Exercise";
		if(actualTitle.equals(expTitle))
		{
	System.out.println("Title is correct and Test case passed");
		}
		else
		{
			System.out.println("Fails to title and Test case failed");
		}
		driver.findElement(By.xpath("//a[@href='/login']")).click();
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
	else
	{
		System.out.println("Logged user name visible and Testcase not passed");
	}
	driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
	WebElement DelAcc= driver.findElement(By.xpath("//h2[@data-qa='account-deleted']"));
	if(DelAcc.isDisplayed())
	{
		System.out.println("Account Deleted is displayed ");
	}
	
	}
	
	
	}


