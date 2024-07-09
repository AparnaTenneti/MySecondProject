package LoginUser_incorrect_email_password;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

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
			driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("sai123@gmail.com");
			driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("sai123");
		    driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		    WebElement error=driver.findElement(By.xpath("//form/p[@style='color: red;']"));
		     if (error.isDisplayed())

		     {
		    	 System.out.println("Verify error 'Your email or password is incorrect!' is visible");
		     }
	}

}
