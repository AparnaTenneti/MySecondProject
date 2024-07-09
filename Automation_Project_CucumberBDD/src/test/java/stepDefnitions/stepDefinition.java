package stepDefnitions;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.TestCase_19_to_26;

public class stepDefinition {
	WebDriver driver;
	TestCase_19_to_26 tst;
	@Given("Launch the Chrome Browser")
	public void launch_the_chrome_browser() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    tst=new TestCase_19_to_26(driver);
	    
	}

	@When("Open the url as {string}")
	public void open_the_url_as(String url) {
	    driver.get(url);
	}
	@Then("Page Title Should be {string}")
	public void page_title_should_be(String expTitle) {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expTitle, actualTitle);
		
	}
	
	                   //Test Case 19
	@Then("Click on product button")
	public void click_on_product_button() {
	    tst.Product();
	}
	@Then("Brands are visible on left side bar")
	public void brands_are_visible_on_left_side_bar() {
	    tst.Product_Display();
	}

	@Then("click on any brand name")
	public void click_on_any_brand_name() {
	    tst.Brand1();
	}
	@Then("Selected brand names are display")
	public void selected_brand_names_are_display() {
	    tst.Selected_Brands();
	}
	

	@Then("click on any other brand link")
	public void click_on_any_other_brand_link() {
	    tst.Brand2();
	}
	@Then("another selected brand display")
	public void another_selected_brand_display() {
		tst.Selected_Brands();
	}
	              //Test Case 20

	@When("click on Product button")
	public void click_on_product_button1() {
		tst.Product();
	}
	@Then("All Products text is display")
	public void all_products_text_is_display() {
	    tst.AllProducts_display();
	}

	@Then("Enter product name as {string} in search input")
	public void enter_product_name_as_in_search_input(String nm) {
	    tst.Product_Name(nm);
	}

	@Then("click search button")
	public void click_search_button() {
	    tst.search();
	}
	@Then("Searched products display")
	public void searched_products_display() {
	    tst.Searched_Products();
	}

	@Then("click Add cart button")
	public void click_add_cart_button() {
	    tst.Add_cart();
	}

	@Then("click view cart and verify that products are visible in cart")
	public void click_view_cart_and_verify_that_products_are_visible_in_cart() {
tst.Cart();

	}

	@Then("click Signup\\/Login button")
	public void click_signup_login_button() {
	  tst.Sigup();  
	}

	@Then("enter email as {string}")
	public void enter_email_as(String emlid) {
	   tst.Enter_Email(emlid);
	}

	@Then("password as {string}")
	public void password_as(String pssd) {
	   tst.Enter_Password(pssd);
	}


	@Then("click on Cart button and  Verify that those products are visible in cart after login as well")
	public void click_on_cart_button_and_verify_that_those_products_are_visible_in_cart_after_login_as_well() {
	    tst.Cart();
	}
	                                             // Test Case 21
	
	@When("click on product button")
	public void click_on_product_button11() {
		tst.Product();
	   
	}
	@Then("All Products List are display")
	public void all_products_list_are_display() {
	   tst.AllProducts_display();
	}



	@Then("Click on view_Product button")
	public void click_on_view_product_button() {
		tst.View_Product();
	}

	@Then("Enter name as {string}")
	public void enter_name_as(String Ynm) {
	    tst.Enter_Ypur_Name(Ynm);
	}

	@Then("Email as {string}")
	public void email_as(String Ymil) {
		tst.Enter_Your_Mail(Ymil);
	}
	@Then("Verify the text WRITE YOUR REVIEW")
	public void verify_the_text_write_your_review() {
	   tst.Write_review_text();
	}




	@Then("Enter review as {string}")
	public void enter_review_as(String review) {
	    tst.Enter_Review(review);
	}

	@Then("Click on submit button")
	public void click_on_submit_button() {
	    tst.Submit_Button();
	    
	}
	            
	                                                    // Test Case 22
	
	@Then("Scroll to bottom of page")
	public void scroll_to_bottom_of_page() {
	    tst.scrollToBottom();
	}

	@Then("Verify RECOMMENDED ITEMS are visible")
	public void verify_recommended_items_are_visible() {
	   tst.Recommended_products();
	}



	
	@Then("Click on Add Cart in Recommended Products")
	public void click_on_add_cart_in_recommended_products() {
	   tst.Recomended_Product();
	}

	@Then("Click on View cart")
	public void click_on_view_cart() {
	    tst.Cart();
	    
	}
	@Then("Verify that product is displayed in cart page")
	public void verify_that_product_is_displayed_in_cart_page() {
	   tst.Verify_cart_item();
	}
	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}
	                                                        //Test Case 23

	
	@Then("Click Singup\\/Login button")
	public void click_singup_login_button() {
	    tst.Sigup();
	}

	@Then("Enter Name as {string}")
	public void enter_name_as1(String supnm) {
	   tst.SignupName(supnm);
	}

	@Then("Enter Email as {string}")
	public void enter_email_as1(String seml) {
	   tst.SignupEmail(seml);
	}

	@Then("Click on Signup button")
	public void click_on_signup_button() {
	    tst.Signup_Create();
	}

	@Then("Click on Mr. Checkbox")
	public void click_on_mr_checkbox() {
	   tst.GenderSelection();
	}

	@Then("Enter Password as {string}")
	public void enter_password_as(String stringpp) {
	    tst.S_Password(stringpp);
	}

	@Then("click Day")
	public void click_day() {
		tst.Day();
	}

	@Then("click month")
	public void click_month() {
	    tst.Month();
	}

	@Then("click year")
	public void click_year() {
	    tst.Year();

	}
	@Then("Click Sign up for our newsletter! check box")
	public void click_sign_up_for_our_newsletter_check_box1() {
	    tst.NewsBox();
	}

	@Then("Click Receive special offers from our partners! check box")
	public void click_receive_special_offers_from_our_partners_check_box() {
	    tst.NewsBox();
	}

	@Then("Enter First Name as {string}")
	public void enter_first_name_as1(String stringnm) {
	   tst.First_name(stringnm);
	}

	@Then("Enter Last Name as {string}")
	public void enter_last_name_as1(String stringLnm) {
	    tst.Last_name(stringLnm);
	}

	@Then("Enter Company name as {string}")
	public void enter_company_name_as1(String stringcmp) {
	    tst.CompanyNm(stringcmp);
	}

	@Then("Enter Address1 as {string}")
	public void enter_address1_as(String stringadd) {
	    tst.Address1(stringadd);
	}

	@Then("Enter Address2 as {string}")
	public void enter_address2_as(String string) {
	    tst.Address2(string);
	}
	@Then("Enter State as {string}")
	public void enter_state_as(String sta) {
	    tst.State(sta);
	}

	@Then("Enter City as {string}")
	public void enter_city_as(String citY) {
	    tst.City(citY);
	}

	@Then("Enter ZipCode as {string}")
	public void enter_zip_code_as(String zip) {
	   tst.ZipCode(zip);
	}

	@Then("Enter Mobile Number as {string}")
	public void enter_mobile_number_as1(String mbo) {
	    tst.Mobile(mbo);
	}

	@Then("Click on Create Account button")
	public void click_on_create_account_button1() {
	   tst.CreateButton();
	}

	@Then("Page should be navigated to {string}")
	public void page_should_be_navigated_to(String exp) {
		String act=driver.getTitle();
		Assert.assertEquals(exp, act);
	}

	@Then("Click on Continue button")
	public void click_on_continue_button() {
	    tst.Continue_atrCrt();
	}
	@Then("Verify Logged in as username at top")
	public void verify_logged_in_as_username_at_top() {
	   tst.Loggeduser();
	}
	@Then("Click on Add cart button to add first product")
	public void click_on_add_cart_button_to_add_first_product() {
	   tst.AddPro1();
	}

	@Then("Click on Continue Shopping button")
	public void click_on_continue_shopping_button() {
	    tst.ContinueAftrAddcrt();
	}

	@Then("Click on Add cart button to add secont Product")
	public void click_on_add_cart_button_to_add_secont_product() {
	    tst.Addpro2();
	}

	@Then("Click on Cart button")
	public void click_on_cart_button() {
		tst.Cart();
	}
	@Then("Verify that cart_page is displayed")
	public void verify_that_cart_page_is_displayed() {
	    tst.Cart_Page();
	}


	@Then("Click Proceed to check out button")
	public void click_proceed_to_check_out_button() {
	   tst.Proceed_to_check();
	}
	@Then("Verify that the delivery address is same address filled at the time registration of account")
	public void verify_that_the_delivery_address_is_same_address_filled_at_the_time_registration_of_account() {
	    tst.Deliver_Address();
	}

	@Then("Verify that the billing address is same address filled at the time registration of account")
	public void verify_that_the_billing_address_is_same_address_filled_at_the_time_registration_of_account() {
	    tst.Billing_Address();
	}
	
	
	@Then("Click Delete Account")
	public void click_delete_account() {
	   tst.Del();
	}
	@Then("Account deleted text display")
	public void account_deleted_text_display() {
	    tst.Account_Delete_Text();
	}

	@Then("Close the Browser")
	public void close_the_browser() {
	   driver.close();
	}
	
	
	                                                   // Test Case 24
	
	
	@Then("Click on Add cart button to add one product")
	public void click_on_add_cart_button_to_add_one_product() {
	  tst.Add_cart7();
	}
	@Then("Click on Continue_Shopping")
	public void click_on_continue_shopping() {
	   tst.Continue();
	}


	@Then("Click on Add cart button to add next Product")
	public void click_on_add_cart_button_to_add_next_product() {
	   tst.Add_cart8();
	}
	@Then("Click on Continue_Shopping2")
	public void click_on_continue_shopping2() {
	    tst.Continue();
	}
	@Then("Click on CartButton")
	public void click_on_cart_button1() {
	    tst.Cart();
	}
	@Then("Verify that the CartPage dispayed or not")
	public void verify_that_the_cart_page_dispayed_or_not() {
		 tst.Cart_Page();
	}


	@Then("Click Proceed_to_check_out button")
	public void click_proceed_to_check_out_button1() {
	    tst.Proceed_to_check();
	}

	@Then("Click on Register_or_Login")
	public void click_on_register_or_login() {
	   tst.Register_Login();
	}

	@Then("Enter_Name _as {string}")
	public void enter_name__as(String Reg_nm) {
	    tst.SignupName(Reg_nm);
	}

	@Then("Enter_Email as {string}")
	public void enter_email_as11(String Reg_eml) {
	   tst.SignupEmail(Reg_eml);
	}

	@Then("Click on Signup_button")
	public void click_on_signup_button1() {
	    tst.Signup_Create();
	}

	@Then("Click on Mr_Checkbox")
	public void click_on_mr_checkbox1() {
	    tst.GenderSelection();
	}

	@Then("Enter PasswordCode as {string}")
	public void enter_password_code_as(String Reg_pass) {
	    tst.S_Password(Reg_pass);
	}

	@Then("click on_Day")
	public void click_on_day() {
	    tst.Day();
	}

	@Then("click on_month")
	public void click_on_month() {
	    tst.Month();
	}

	@Then("click on_year")
	public void click_on_year() {
	  tst.Year();
	}

	@Then("Click Sign_up for our newsletter_check_box")
	public void click_sign_up_for_our_newsletter_check_box() {
	    tst.NewsBox();
	}

	@Then("Click Receive special offers_from our_partner_check box")
	public void click_receive_special_offers_from_our_partner_check_box() {
	    tst.SpecialOffer();
	}

	@Then("Enter First_Name as {string}")
	public void enter_first_name_as(String Reg_fnm) {
	    tst.First_name(Reg_fnm);
	}

	@Then("Enter Last_Name as {string}")
	public void enter_last_name_as(String Reg_Lnm) {
	   tst.Last_name(Reg_Lnm);
	}

	@Then("Enter Company_name as {string}")
	public void enter_company_name_as(String Reg_CNM) {
	    tst.CompanyNm(Reg_CNM);
	}

	@Then("Enter First_Address as {string}")
	public void enter_first_address_as(String Reg_Add) {
	   tst.Address1(Reg_Add);
	}

	@Then("Enter Second_Address as {string}")
	public void enter_second_address_as(String Reg_Ad) {
	    tst.Address2(Reg_Ad);
	}

	@Then("Enter State_name as {string}")
	public void enter_state_name_as(String Reg_state) {
	    tst.State(Reg_state);
	}

	@Then("Enter City_name as {string}")
	public void enter_city_name_as(String Reg_city) {
	    tst.City(Reg_city);
	}

	@Then("Enter ZipCode_number as {string}")
	public void enter_zip_code_number_as(String Reg_zip) {
	   tst.ZipCode(Reg_zip);
	}

	@Then("Enter Mobile_Number as {string}")
	public void enter_mobile_number_as(String Reg_mb) {
	    tst.Mobile(Reg_mb);
	}

	@Then("Click on Create_Account button")
	public void click_on_create_account_button() {
	    tst.CreateButton();
	}

	@Then("it should be navigated_to as {string}")
	public void it_should_be_navigated_to_as(String Reg_exp) {
		String act=driver.getTitle();
		Assert.assertEquals(Reg_exp, act);
	}

	@Then("Click on Continue2_button")
	public void click_on_continue2_button() {
	   tst.Continue_atrCrt();
	}
	@Then("Verify That the  Logged in as username at the top of the page")
	public void verify_that_the_logged_in_as_username_at_the_top_of_the_page() {
	    tst.Loggeduser();
	}

	@Then("Click on Cart_button2")
	public void click_on_cart_button2() {
	    tst.Cart();
	}

	@Then("Click Proceed to button")
	public void click_proceed_to_button() {
	    tst.Proceed_to_check();
	}
	@Then("Verify Address Details")
	public void verify_address_details() {
	    tst.Address_Details_Page();
	}

	@Then("Verify Review Your Order Text")
	public void verify_review_your_order_text() {
	    tst.Review_Order_Text();
	}




	@Then("Enter description in comment text area as {string}")
	public void enter_description_in_comment_text_area_as(String Reg_msg) {
	   tst.Comment_Box(Reg_msg);
	}

	@Then("click Place Order")
	public void click_place_order() {
	    tst.PlaceOrder();
	}

	@Then("Enter payment details: Name as {string} on Card")
	public void enter_payment_details_name_as_on_card(String crdNM) {
	    tst.Name_On_Card(crdNM);
	}

	@Then("Card Number as {string}")
	public void card_number_as(String Reg_Num) {
	   tst.Number_On_Card(Reg_Num);
	}

	@Then("CVC number as {string}")
	public void cvc_number_as(String Reg_cvc) {
	   tst.CVC_num(Reg_cvc);
	}

	@Then("Expiration date month as {string}")
	public void expiration_date_month_as(String Crd_mnth) {
	    tst.Expiry_Month(Crd_mnth);
	}

	@Then("Year as {string}")
	public void year_as(String crdyr) {
	   tst.Expiry_Year(crdyr);
	}

	@Then("Click Pay and Confirm Order button")
	public void click_pay_and_confirm_order_button() {
	   tst.Payment_Button();
	}
	@Then("Your order has been placed successfully! Text is displayed")
	public void your_order_has_been_placed_successfully_text_is_displayed() {
	    tst.Success_msg();
	}



	@Then("Click Download Invoice button and verify invoice is downloaded successfully")
	public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully() {
	    tst.Download_invoice();
	}

	@Then("Click Continue After download button")
	public void click_continue_after_download_button() {
	   tst.Download_Continue();
	}

	@Then("Click Delete_account button")
	public void click_delete_account_button() {
	   tst.Del();
	}
	@Then("Account wiil be deleted Account deleted text disply")
	public void account_wiil_be_deleted_account_deleted_text_disply() {
	    tst.Account_Delete_Text();
	}


	@Then("close24 Browser")
	public void close24_browser() {
	   driver.close();
	}
	                                     
	                                                        // Test Case 25
	 
	@Then("Scroll down the Page to verify subscription")
	public void scroll_down_the_page_to_verify_subscription() {
		
		    tst.scrollToBottom();
	}
	@Then("The page as visible as Subscription")
	public void the_page_as_visible_as_subscription() {
	    
		tst.SubcriPtion();
	}
	@Then("Click on arrow at bottom right side to it  moves to  upward")
	public void click_on_arrow_at_bottom_right_side_to_it_moves_to_upward() {
	    tst.Right_side_arrow();
	}
	@Then("the page is scrolled up and as Full-Fledged practice website for Automation Engineers is visiable")
	public void the_page_is_scrolled_up_and_as_full_fledged_practice_website_for_automation_engineers_is_visiable() {
	    
	    tst.display();
	}
	
	                                                                //Test Case  26
	
	
	
	@Then("Scroll down the Page")
	public void scroll_down_the_page() {
	    tst.scroll_down_the_page_to_the_bottom();
	}

	@Then("Scroll down page to bottom Verify SUBSCRIPTION is visible")
	public void scroll_down_page_to_bottom_verify_subscription_is_visible() {
	   tst.SubcriPtion();
	}

	@Then("Scroll up page to top")
	public void scroll_up_page_to_top() {
		tst.scrollToBottom();
	
	}

	@Then("Verify the text Full-Fledged practice website for Automation Engineers text is visible on screen")
	public void verify_the_text_full_fledged_practice_website_for_automation_engineers_text_is_visible_on_screen() {
	tst.display();
	}  
	

}

	






	