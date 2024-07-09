package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TestCase_19_to_26 {
WebDriver driver;
public TestCase_19_to_26(WebDriver idr)
{
	driver=idr;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//li/a[@href='/products']") WebElement produtBtt;
@FindBy(xpath="//input[@id='search_product']") WebElement pro_Nm;
@FindBy(xpath="//button[@id='submit_search']") WebElement search_Bttn;
@FindBy(xpath="//div[@class='col-sm-4']/following::div[@class='productinfo text-center']/a[@data-product-id='1']") WebElement Add;
@FindBy(xpath="//button[@data-dismiss='modal']") WebElement continue_Bttn;
@FindBy(xpath="//a[@href='/view_cart']") WebElement cart;
@FindBy(xpath="//li/a[@href='/login']") WebElement Sigup_Bttn;
@FindBy(xpath="//input[@data-qa='login-email']") WebElement enter_eml;
@FindBy(xpath="//input[@data-qa='login-password']") WebElement enterPass;
@FindBy(xpath="//button[@data-qa='login-button']") WebElement Lng_Bttn;
@FindBy(xpath="//li/a[@href='/brand_products/Babyhug']") WebElement Brandnm1;
@FindBy(xpath="//li/a[@href='/brand_products/Biba']") WebElement Brandnm2;
@FindBy(xpath="//li/a[@href='/product_details/1']") WebElement view_Pro;
@FindBy(xpath="//input[@id='name']") WebElement Your_name;
@FindBy(xpath="//input[@id='email']") WebElement Your_mail;
@FindBy(xpath="//textarea[@name='review']") WebElement review;
@FindBy(xpath="//button[@id='button-review']") WebElement sub;
@FindBy(xpath="//div/child::img[@src='get_product_picture/4']/following::a[@data-product-id='4']") WebElement RecomndProduct;

@FindBy(xpath="//input[@data-qa='signup-name']") WebElement Signup_Name;
@FindBy(xpath="//input[@data-qa='signup-email']") WebElement Signup_Email;
@FindBy(xpath="//button[@data-qa='signup-button']") WebElement S_button;
@FindBy(xpath="//input[@id='id_gender1']") WebElement Gender;
@FindBy(xpath="//input[@data-qa='password']") WebElement passwrd;
@FindBy(name="days") WebElement dy;
@FindBy(name="months") WebElement mnth;
@FindBy(name="years") WebElement yr;
@FindBy(name="newsletter") WebElement newsLtt;
@FindBy(xpath="//h2[@class='title text-center']/preceding-sibling::input/following::input[@type='checkbox'][2]") WebElement SpecialChkbx;
@FindBy(id="first_name") WebElement F_nm;
@FindBy(id="last_name") WebElement L_nm;
@FindBy(id="company") WebElement Cmpny;
@FindBy(name="address1") WebElement add1;
@FindBy(id="address2") WebElement add2;
@FindBy(name="state") WebElement st;
@FindBy(id="city") WebElement cty;
@FindBy(name="zipcode") WebElement Zcode;
@FindBy(id="mobile_number") WebElement Mbnm;
@FindBy(xpath="//button[@data-qa='create-account']") WebElement creatAccount;
@FindBy(xpath="//div/child::a[@data-qa='continue-button']") WebElement cntnue;
@FindBy(xpath="//div[@class='productinfo text-center']/a[@data-product-id='3']/i[@class='fa fa-shopping-cart']") WebElement addcrt1;
@FindBy(xpath="//div[@class='modal-footer']/button") WebElement continuebt;
@FindBy(xpath="//div[@class='productinfo text-center']/a[@data-product-id='5']/i[@class='fa fa-shopping-cart']") WebElement addcrt2;
@FindBy(xpath="//div/child::a[@class='btn btn-default check_out']") WebElement Pro_check;
@FindBy(xpath="//a[@href='/delete_account']") WebElement delt;
@FindBy(xpath="//div[@class='productinfo text-center']/a[@data-product-id='7']") WebElement AddCart7;
@FindBy(xpath="//div[@class='productinfo text-center']/a[@data-product-id='8']") WebElement AddCart8;
@FindBy(xpath="//textarea[@name='message']") WebElement CommentBox;
@FindBy(xpath="//a[@href='/payment']") WebElement placeBttn;
@FindBy(xpath="//input[@name='name_on_card']") WebElement Card_nm;
@FindBy(xpath="//input[@name='card_number']") WebElement  Card_num;
@FindBy(xpath="//input[@name='cvc']") WebElement cvc;
@FindBy(xpath="//input[@name='expiry_month']") WebElement expy_month;
@FindBy(xpath="//input[@name='expiry_year']") WebElement expy_year;
@FindBy(xpath="//button[@data-qa='pay-button']") WebElement pay_bttn;
@FindBy(xpath="//a[@class='btn btn-default check_out']") WebElement download;
@FindBy(xpath="//a[@href='/login']/u") WebElement Register;
@FindBy(xpath="//a[@class='btn btn-primary']") WebElement down_con; 
@FindBy(xpath="//a[@id='scrollUp']/i") WebElement Right_Arrow;
@FindBy(xpath="//div[@class='single-widget']/h2") WebElement Subscrip;
@FindBy(xpath="//div[@class='col-sm-6']/h2") WebElement Display; 
@FindBy(xpath="//div[@class='brands_products']") WebElement Brands;
@FindBy(xpath="//h2[@class='title text-center']") WebElement Selected;
@FindBy(xpath="//a[@href='#reviews']") WebElement Write_re;
@FindBy(xpath="//div[@class='recommended_items']/h2[@class='title text-center'][1]") WebElement Recommended_text;
@FindBy(xpath="//div[@class='cart-item']") WebElement VerifycartpageItem;
@FindBy(xpath="//h2[@class='title text-center']/b") WebElement AcctPage;
@FindBy(xpath="//i[@class='fa fa-user']") WebElement Logged;
@FindBy(xpath="/section[@id='cart_items']") WebElement Cart_page;
@FindBy(xpath="//ul[@id='address_delivery']") WebElement Delvryadd;
@FindBy(xpath="//ul[@id='address_invoice']") WebElement Billing;
@FindBy(xpath="//h2[@data-qa='account-deleted']") WebElement acc_del;
@FindBy(xpath="//div[@class='step-one']/h2[@class='heading']/preceding::div[@class='checkout-information']") WebElement  AddressDEtails;
@FindBy(xpath="//div[@class='step-one']/h2[@class='heading']/preceding::div[@class='checkout-information']/following::div[@class='step-one']/h2") WebElement ReviewOrder;
@FindBy(xpath="//div[@id='success_message']") WebElement Success;
public void Success_msg()
{
	if(Success.isDisplayed())
	{
		System.out.println("Your order has been placed successfully! is displayed");
	}
}  
public void Review_Order_Text()
{
	if(ReviewOrder.isDisplayed()) {
		System.out.println("Review order Displayed");
	}
	else
		System.out.println("Review order not displayed");
	
}
public void Address_Details_Page()
{
if(	AddressDEtails.isDisplayed()) {
	System.out.println("AddressDetails Displayed");
}
else
	System.out.println("Address details not displayed");
}
public void Account_Delete_Text()
{
	if(acc_del.isDisplayed())
	{
	System.out.println("Account Delete text display");
}}
public void Deliver_Address()
{
	String expectedAddress =Billing.getText();
    String actualAddress = Delvryadd.getText().trim();
    assert actualAddress.equals(expectedAddress) ;
}
public void Billing_Address()
{
	 String expctedAddress = Delvryadd.getText(); // Replace with actual expected address
     String actlAddress = Billing.getText().trim();
     assert actlAddress.equals(expctedAddress); 
}


public void Loggeduser()
{
	if(Logged.isDisplayed())
	{
	System.out.println("Logged user name displayed");
	}
}
public void Account_created_Page()
{
	if(AcctPage.isDisplayed())
	{
	System.out.println("Account page is displayed");
	}
}
public void Verify_cart_item()
{
	if(VerifycartpageItem.isDisplayed())
	{
		System.out.println("Cart page items are verified");
	}
}
public void Recommended_products()
{
	if(Recommended_text.isDisplayed())
	{
	System.out.println("Recommended items textt is visiable");
	}
}
public void Write_review_text()
{
	if(Write_re.isDisplayed())
	{
	System.out.println(" Write review text is display");
}}
public void Searched_Products()
{
	if(Selected.isDisplayed())
	{
	System.out.println("Searched products are display");
	}
}
public void AllProducts_display()
{
	if(Selected.isDisplayed())
	{
	System.out.println("All Products are visiable ");
}}
public void Selected_Brands()
{
	if(Selected.isDisplayed())
	{
	System.out.println("Selected brands are display");
}}
public void Product()

{
	produtBtt.click();
}
public void Product_Display()
{
	if(Brands.isDisplayed())
	{
	System.out.println("Brands are visiable");
}}
public void Product_Name(String pnm)
{
	pro_Nm.sendKeys(pnm);
}
public void search()
{
	search_Bttn.click();
}
public void Add_cart()
{
	Add.click();
}
public void Continue()
{
	continue_Bttn.click();
}
public void Cart()
{
	cart.click();
}
public void Sigup()
{
	Sigup_Bttn.click();
}
public void Enter_Email(String eml)
{
	enter_eml.sendKeys(eml);
}
public void Enter_Password(String pwd)
{
	enterPass.sendKeys(pwd);
}
public void Login()
{
	Lng_Bttn.click();
}

public void Brand1()
{
	Brandnm1.click();
	
}
public void Brand2()
{
	Brandnm2.click();
}
public void View_Product()
{
	view_Pro.click();
}
public void Enter_Ypur_Name(String name)
{
	Your_name.sendKeys(name);
}
public void Enter_Your_Mail(String mailid)
{
	Your_mail.sendKeys(mailid);
}
public void Enter_Review(String rev)
{
	review.sendKeys(rev);
}
public void Submit_Button()
{
	sub.click();
}
public void Recomended_Product()
{
	 RecomndProduct.click();
}

public void SignupName(String Snm)
{
	Signup_Name.sendKeys(Snm);
}
public void SignupEmail(String Sem)
{
	Signup_Email.sendKeys(Sem);
}
public void Signup_Create()
{
	S_button.click();
}
public void GenderSelection()
{
	Gender.click();
}
public void S_Password(String pd)
{
	passwrd.sendKeys(pd);

}
public void Day()
{
	Select scDay1=new Select(dy);
	scDay1.selectByIndex(19);
}
public void Month()
{
	Select MN=new Select(mnth);
	MN.selectByVisibleText("April");
	
}
public void Year()
{
	Select Yer=new Select(yr);
	Yer.selectByVisibleText("1995");
}
public void NewsBox()
{
	 newsLtt.click();
}
public void SpecialOffer()
{
	SpecialChkbx.click();
}
public void First_name(String Fnm)
{
	F_nm.sendKeys(Fnm);
}
public void Last_name(String Lnm)
{
	L_nm.sendKeys(Lnm);
}
public void CompanyNm(String cmp)
{
	Cmpny.sendKeys(cmp);
}
public void Address1(String ad1)
{
	add1.sendKeys(ad1);
}
public void Address2(String ad2)
{
	add2.sendKeys(ad2);
}
public void State(String state)
{
	st.sendKeys(state);
}
public void City(String ct)
{
	cty.sendKeys(ct);
}
public void ZipCode(String ZC)
{
	Zcode.sendKeys(ZC);
}
public void Mobile(String mb)
{
	Mbnm.sendKeys(mb);
}
public void CreateButton()
{
	creatAccount.click();
}
public void Continue_atrCrt()
{
cntnue.click();
}
public void AddPro1()
{
	addcrt1.click();
}
public void ContinueAftrAddcrt()
{
	continuebt.click();

}
public void Addpro2()
{
	addcrt2.click();
}
public void Proceed_to_check()
{
	Pro_check.click();
}
public void Del()
{
	delt.click();
}
public void Add_cart7()
{
	AddCart7.click();
}
public void Add_cart8()
{
	AddCart8.click();
}
public void Comment_Box(String commnt)
{
	CommentBox.sendKeys(commnt);
}
public void PlaceOrder()
{
	placeBttn.click();
}
public void Name_On_Card(String cnm)
{
	Card_nm.sendKeys(cnm);
}
public void Number_On_Card(String cnum)
{
	Card_num.sendKeys(cnum);
}
public void CVC_num(String  cvcnum)
{
	cvc.sendKeys(cvcnum);
}
public void Expiry_Month(String Emn)
{
	expy_month.sendKeys(Emn);
}
public void Expiry_Year(String Eyr)
{
	expy_year.sendKeys(Eyr);
}
public void Payment_Button() {
	pay_bttn.click();
}
public void Download_invoice()
{
	download.click();
}
public void Register_Login()
{
	Register.click();
}
public void Download_Continue()
{
	down_con.click();
}
public void Right_side_arrow()
{
	
	Right_Arrow.click();
}
public void SubcriPtion()
{
	if(Subscrip.isDisplayed())
	{
	System.out.println("Subscription is visiable");
}}
public void display()
{
	if(Display.isDisplayed())
	{
	System.out.println("The Page is scrolled up and text visiable");
}}
public void scrollToBottom() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}
public void Cart_Page() {
	Cart_page.isDisplayed();
	System.out.println("Cart page displayed");
	
}
public void scroll_down_the_page_to_the_bottom() {
	JavascriptExecutor jsd = (JavascriptExecutor) driver;
    jsd.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}
}
