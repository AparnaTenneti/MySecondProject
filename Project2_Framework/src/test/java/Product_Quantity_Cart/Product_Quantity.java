
	package Product_Quantity_Cart;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Product_Quantity {
		WebDriver driver;
		public Product_Quantity(WebDriver idriver)
		{
			driver=idriver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[@href='/product_details/1']") WebElement view;
		@FindBy(xpath="//div[@class='product-information']") WebElement verify;
		@FindBy(xpath="//input[@type='number']") WebElement quntity;
	    @FindBy(xpath="//button[@type='button']") WebElement add_cart_bttn;
	    @FindBy(xpath="//u") WebElement Cart_items;
	    @FindBy(xpath="//button[@class='disabled']") WebElement Qunty;
	    public void View_Product()
	    	{
	    	view.click();
	    	}
	    public void Product_Details_verify()
	    {
	    if(verify.isDisplayed())
	    {
	    	System.out.println(" product detail is opened");
	    }
	    }
	    public void Enter_Quantity(String num)
	    {
	    	quntity.clear();
	    	quntity.sendKeys(num);
	    }
	    public void Add_Cart_items()
	    {
	    	add_cart_bttn.click();
	    }
	    public void Cart_Quntity_Items()
	    {
	    	Cart_items.click();
	    	
	    	
	    }
	    public void Quantity_Display()
	    {
	    if(Qunty.isDisplayed())
	    {
	    	System.out.println("Quanity display");
	    }}
	    }




