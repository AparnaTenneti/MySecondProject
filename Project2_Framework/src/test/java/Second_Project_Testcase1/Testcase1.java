          /* Using Data Driven frame Work*/

package Second_Project_Testcase1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase1 {

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
		
		String filepath="C:\\Users\\lenovo\\OneDrive\\Documents\\Registration_Data.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook Workbook= new XSSFWorkbook(fis);
		XSSFSheet Sheet= Workbook.getSheet("Data");
		int rows=Sheet.getLastRowNum();
		System.out.println("Total no of the rows"+rows);
		for(int r=1;r<=rows;r++)
		{
		
		XSSFRow row=Sheet.getRow(r);
		XSSFCell Name=row.getCell(0);
		XSSFCell Email=row.getCell(1);
		try
		{
		driver.findElement(By.name("name")).sendKeys(Name.toString());
		driver.findElement(By.xpath("//form [@action='/signup']/child::input[@name='email']")).sendKeys(Email.toString());
		
		driver.findElement(By.xpath("//form[@action='/signup']/child::button")).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		WebElement Accountdt=driver.findElement(By.xpath("//div[@class='login-form']/h2/b"));
		if(Accountdt.isDisplayed())
		{
			System.out.println("ENTER ACCOUNT INFORMATION' is visible");
			
	   }
		
		
		driver.findElement(By.xpath("//input[@value='Mr']")).click();
		driver.findElement(By.xpath("//div[@class='required form-group']/child::input[@type='password']")).sendKeys("aparna123");
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
		driver.findElement(By.id("first_name")).sendKeys("Shiva");
		driver.findElement(By.id("last_name")).sendKeys("Sahith");
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
			System.out.println("Verify that 'ACCOUNT CREATED!' is visible");
		}
		
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		WebElement User=driver.findElement(By.xpath("//i[@class='fa fa-user']"));
		if (User.isDisplayed())
		{
			System.out.println("Logged user name visible and Testcase passed");
		}
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		WebElement DelAcc= driver.findElement(By.xpath("//h2[@data-qa='account-deleted']"));
		if(DelAcc.isDisplayed())
		{
			System.out.println("Account Deleted is displayed ");
		}
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		}
		
	}

}
