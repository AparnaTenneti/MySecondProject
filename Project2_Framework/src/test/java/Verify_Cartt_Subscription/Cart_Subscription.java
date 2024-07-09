package Verify_Cartt_Subscription;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Subscription {
	WebDriver driver;
	public Cart_Subscription(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//li/a[@href='/view_cart']") WebElement cartBttn;

	@FindBy(id="susbscribe_email") WebElement bar;
	@FindBy(id="subscribe") WebElement arrow_sym;
	
	public void cart()
	{
		cartBttn.click();
	}
	public void scroll()
	{
	JavascriptExecutor jsd = (JavascriptExecutor) driver;
    jsd.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void Enter_Email(String em)
	{
		bar.sendKeys(em);
	}
	public void Click_Arrow()
	{
		arrow_sym.click();
	}
	
}
