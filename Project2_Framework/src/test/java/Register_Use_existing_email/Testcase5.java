package Register_Use_existing_email;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5 {

	public static void main(String[] args) throws IOException {
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
		WebElement ActlPage=driver.findElement(By.xpath("//div[@class='signup-form']/h2"));

		if(ActlPage.isDisplayed())
		{
	System.out.println("'New User Signup!' is visible");
		}
		driver.findElement(By.name("name")).sendKeys("surya");
		driver.findElement(By.xpath("//form [@action='/signup']/child::input[@name='email']")).sendKeys("ramakuri@gmail.com");
		
		driver.findElement(By.xpath("//form[@action='/signup']/child::button")).click();
    WebElement error=driver.findElement(By.xpath("//form/p[@style='color: red;']"));
          if(error.isDisplayed())
          {
        	  System.out.println("Verify error 'Email Address already exist!' is visible");
          }

		}
	}


