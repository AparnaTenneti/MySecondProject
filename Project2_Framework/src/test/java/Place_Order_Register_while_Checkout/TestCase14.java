package Place_Order_Register_while_Checkout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestCase14 {
	public static void main(String args[])
	{
		
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
	driver.findElement(By.xpath("//li/a[@href='/products']")).click();
	driver.findElement(By.xpath("//div[@class='productinfo text-center']/a[@data-product-id='1']/i[@class='fa fa-shopping-cart']")).click();
driver.findElement(By.xpath("//div[@class='modal-footer']/button")).click();
	driver.findElement(By.xpath("//li/a[@href='/view_cart']")).click();
driver.findElement(By.xpath("//div[@class='col-sm-6']/a")).click();
driver.findElement(By.xpath("//a[@href='/login']/u")).click();
driver.findElement(By.name("name")).sendKeys("Aruna");
driver.findElement(By.xpath("//form [@action='/signup']/child::input[@name='email']")).sendKeys("aruna123@gmail.com");
driver.findElement(By.xpath("//form[@action='/signup']/child::button")).click();
driver.findElement(By.xpath("//input[@value='Mr']")).click();
driver.findElement(By.xpath("//div[@class='required form-group']/child::input[@type='password']")).sendKeys("Aruna123");
WebElement day= driver.findElement(By.name("days"));
Select scDay=new Select(day);
scDay.selectByIndex(19);
WebElement month=driver.findElement(By.name("months"));
Select MN=new Select(month);
MN.selectByVisibleText("April");
WebElement year=driver.findElement(By.name("years"));
Select Yr=new Select(year);
Yr.selectByVisibleText("1995");
driver.findElement(By.name("newsletter")).click();
driver.findElement(By.xpath("//h2[@class='title text-center']/preceding-sibling::input/following::input[@type='checkbox'][2]")).click();
driver.findElement(By.id("first_name")).sendKeys("Aruna");
driver.findElement(By.id("last_name")).sendKeys("Kumari");
driver.findElement(By.id("company")).sendKeys("Sripada's company");
driver.findElement(By.name("address1")).sendKeys("Pallapu Street,Palakollu");
driver.findElement(By.id("address2")).sendKeys("West Godavar");
driver.findElement(By.name("state")).sendKeys("Andhra Pradesh");
driver.findElement(By.id("city")).sendKeys("palakollu");
driver.findElement(By.name("zipcode")).sendKeys("534250");
driver.findElement(By.id("mobile_number")).sendKeys("9490946108");
driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
WebElement acccrt=driver.findElement(By.xpath("//h2[@data-qa='account-created']"));
if (acccrt.isDisplayed())
{
	System.out.println(" 'ACCOUNT CREATED!' is visible");
}
driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
WebElement User=driver.findElement(By.xpath("//i[@class='fa fa-user']"));
if (User.isDisplayed())
{
	System.out.println("Logged user name visible and Testcase passed");
}
driver.findElement(By.xpath("//li/a[@href='/view_cart']")).click();
driver.findElement(By.xpath("//div[@class='col-sm-6']/a")).click();
driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Happy Birthday Dear");
driver.findElement(By.xpath("//a[@href='/payment']")).click();
driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("aruna");
driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("6079091554006488");
driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("822");
driver.findElement(By.xpath("//input[@name='expiry_month']")).sendKeys("01");
driver.findElement(By.xpath("//input[@name='expiry_year']")).sendKeys("2025");
driver.findElement(By.xpath("//button[@data-qa='pay-button']")).click();
driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
WebElement deleteAcc= driver.findElement(By.xpath("//h2[@class='title text-center']/b"));
if(deleteAcc.isDisplayed())
{
System.out.println("Account Deleted");
}













	}

}
