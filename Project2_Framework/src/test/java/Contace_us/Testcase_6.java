package Contace_us;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Testcase_6 {

	public static void main(String[] args) {
		WebDriver driver;
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualTitle=driver.getTitle();
		String expTitle="Automation Exercise";
		if(actualTitle.equals(expTitle))
		{
	System.out.println("  home page is visible successfull");
		}
		driver.findElement(By.xpath("//i[@class='fa fa-envelope']")).click();
		WebElement CentrTitle=driver.findElement(By.xpath("//div/b/following::h2[@class='title text-center'][1]"));
		if(CentrTitle.isDisplayed())
		{
System.out.println("Get in touch displayed");
	}
		else
		{
			System.out.println("Get in touch not displayed");
		}
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Surya");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prakash123@gmail.com");
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Notes");
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Sdlc notes	");
		WebElement file=driver.findElement(By.xpath("//input[@type='file']"));	
		String path="C:\\Users\\lenovo\\OneDrive\\Desktop\\Selenium all notes\\PPT\\Software Development Life Cycle.pptx";
		file.sendKeys(path);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
			Alert alert1=driver.switchTo().alert();
			System.out.println("1st alert messege ");
			alert1.accept();
	
		WebElement msg =driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
		if(msg.isDisplayed())
		{
			System.out.println("Successfully submitted");
		}
		driver.findElement(By.xpath("//i[@class='fa fa-angle-double-left']")).click();
		String s1=driver.getCurrentUrl();
		String s2="https://automationexercise.com/";
		Assert.assertEquals(s2, s1);
		System.out.println("Successfully navigated to home page");
	}

}
