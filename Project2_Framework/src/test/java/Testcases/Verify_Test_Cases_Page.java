package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_Test_Cases_Page {
WebDriver driver;
public Verify_Test_Cases_Page(WebDriver idriver)
{
	driver=idriver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@href='/test_cases']") WebElement testcasebttn;
@FindBy(xpath="//head[@title='Automation Practice Website for UI Testing - Test Cases']") WebElement testcasePage;
@FindBy(xpath="//h2[@class='title text-center']/b") WebElement center;
public void url()
{
driver.get("http://automationexercise.com");
String actualTitle=driver.getTitle();
String expTitle="Automation Exercise";
if(actualTitle.equals(expTitle))
{
System.out.println("Title is correct and Test case passed");
}

}
public void Tstbutton()
{
	testcasebttn.click();
}
public void TestcasePage()
{
if(center.isDisplayed())
{
	System.out.println("navigated to testcase page");
}	
}
public void Close()
{
	driver.close();
}
}

