package Products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Product_detail_page {
	WebDriver driver;
	public Product_detail_page(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//ul[@class='nav navbar-nav']/li[2]/a") WebElement productBttn;
@FindBy(xpath="//div[@class='features_items']/h2") WebElement AllProducts;
@FindBy(xpath="//a[@href='/product_details/1']") WebElement View_product1;
@FindBy(xpath="//div[@class='product-information']") WebElement ProductDetails;
public void PrdctBttn()
{
	productBttn.click();
}
public void AllProducts_Page()
{
	if(AllProducts.isDisplayed())
	{
	System.out.println("Verify user is navigated to ALL PRODUCTS page successfully");
	}
}
public void ViewProduct()
{
	View_product1.click();
}
public void ProductDetailPage()
{
	String e="Automation Exercise - Product Details";
	String a=driver.getTitle();
	Assert.assertEquals(e, a);
	System.out.println("User is landed to product detail page");
	if(ProductDetails.isDisplayed())
	{
	System.out.println("Verify that detail detail is visible: product name, category, price, availability, condition, brand");
	}
}
}

