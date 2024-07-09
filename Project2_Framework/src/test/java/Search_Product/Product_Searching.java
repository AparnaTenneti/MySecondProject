package Search_Product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Searching {
	WebDriver driver;
	public Product_Searching(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
@FindBy(id="search_product") WebElement enterProduct;
@FindBy(xpath="//i[@class='fa fa-search']") WebElement searchBttn;
@FindBy(xpath="//div[@class='features_items']/h2") WebElement searched_products;
public void ProductName(String nm)
{
	
	enterProduct.sendKeys(nm);
}
public void SearchBtn()
{
	searchBttn.click();
}
public void Searched_Product_Page()
{
if(searched_products.isDisplayed())
{
	System.out.println(" 'SEARCHED PRODUCTS' is visible");

	System.out.println(" all the products related to search are visible");
}
}
}
