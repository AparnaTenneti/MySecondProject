package TestCases_7_to_13;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Add_Products_in_Cart.Products_in_cart;
import Product_Quantity_Cart.Product_Quantity;
import Products.Product_detail_page;
import Search_Product.Product_Searching;
import Testcases.Verify_Test_Cases_Page;
import Verify_Cartt_Subscription.Cart_Subscription;
import Verify_Subcription.Subcriprion;

public class Testcase7_to_13_Main_Class {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Verify_Test_Cases_Page tst=new  Verify_Test_Cases_Page(driver);

tst.url();
tst.Tstbutton();
tst.TestcasePage();
Product_detail_page pdp =new Product_detail_page (driver);
tst.url();
pdp.PrdctBttn();
pdp.AllProducts_Page();
pdp.ViewProduct();
pdp.ProductDetailPage();
Product_Searching PS = new Product_Searching(driver);
tst.url();
pdp.PrdctBttn();
pdp.AllProducts_Page();
PS.ProductName("jeans");
PS.SearchBtn();
PS.Searched_Product_Page();
Subcriprion sub=new Subcriprion(driver);
tst.url();
sub.Subscribe();
sub.Enter_EmaiId("ramakuri@gmail.com");
sub.Arrow();
sub.Alert_Msg();
tst.url();
Cart_Subscription CS = new Cart_Subscription(driver);
CS.cart();
CS.scroll();
sub.Subscribe();
CS.Enter_Email("ramakuri@gmail.com");
CS.Click_Arrow();
sub.Alert_Msg();
Products_in_cart PiC=new Products_in_cart (driver);
tst.url();
pdp.PrdctBttn();
pdp.AllProducts_Page();
PiC.Add_Cart1();
PiC.Continue_Shopping();
PiC.Add_Cart2();
PiC.View_Cart();
PiC.Cart_Items();
Product_Quantity PQ= new Product_Quantity(driver);
tst.url();
PQ.View_Product();
pdp.ProductDetailPage();
PQ.Enter_Quantity("4");
PQ.Add_Cart_items();
PQ.Cart_Quntity_Items();
PQ.Quantity_Display();


	}

}
