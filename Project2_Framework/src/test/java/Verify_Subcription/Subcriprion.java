package Verify_Subcription;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subcriprion {
	WebDriver driver;
	public Subcriprion(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//div[@class='single-widget']/h2") WebElement Subscribe_Site;
@FindBy(id="susbscribe_email") WebElement Enteremail;
@FindBy(xpath="//i[@class='fa fa-arrow-circle-o-right']") WebElement Arrow_Symbol;
@FindBy(xpath="//div[@class='form-row hide']/following::div[@class='alert-success alert']") WebElement AlertSuccess;

public void Subscribe()

{
	if(Subscribe_Site.isDisplayed())
	{
	System.out.println("Should Verify text 'SUBSCRIPTION'");
}}
public void Enter_EmaiId(String email)
{

	Enteremail.sendKeys(email);
}
public void Arrow()
{
	Arrow_Symbol.click();
}
public void Alert_Msg()
{
	if(AlertSuccess.isDisplayed()) 
	{
	System.out.println(" You have been successfully subscribed!' is visible");
}}
}
