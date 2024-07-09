package Add_Products_in_Cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_in_cart {
	WebDriver driver;
	public Products_in_cart(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='productinfo text-center']/a[@data-product-id='1']/i[@class='fa fa-shopping-cart']") WebElement add;
    @FindBy(xpath="//div[@class='modal-footer']/button") WebElement ContinueBttn;
    @FindBy(xpath="//div[@class='productinfo text-center']/a[@data-product-id='2']/i[@class='fa fa-shopping-cart']") WebElement add2;
    @FindBy(xpath="//u") WebElement view;
    
    public void Add_Cart1()
    {
    	add.click();
    }
    public void Continue_Shopping()
    {
    	ContinueBttn.click();
    }
    public void Add_Cart2()
    {
    	add2.click();
    }
    public void View_Cart()
    {
    	view.click();
    }
    public void Cart_Items()
    {
   
    	System.out.println("Both products are added to Cart");
    	System.out.println("Their prices, quantity and total price are verified");
    }
}
