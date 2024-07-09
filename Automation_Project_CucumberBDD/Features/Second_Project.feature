Feature: TestCase_19_to_26


Background: All Common Steps

Given Launch the Chrome Browser
When Open the url as "http://automationexercise.com"
Then Page Title Should be "Automation Exercise"


Scenario: view & Cart Brand Products(test case19)
Then Click on product button
And   Brands are visible on left side bar
Then click on any brand name
And Selected brand names are display
And click on any other brand link
And another selected brand display
And close browser


Scenario: Search Products and verify after login(test case20)
And click on Product button
Then All Products text is display
Then Enter product name as "Tops" in search input 
And click search button 
Then Searched products display
And click Add cart button 
Then click view cart and verify that products are visible in cart
And click Signup/Login button
Then enter email as "prakash123@gmail.com"
 And password as "surya123"
Then click on Cart button and  Verify that those products are visible in cart after login as well



Scenario: User able to Add Riew on product (test case21)
And click on product button
Then All Products List are display
Then Click on view_Product button
Then Enter name as "surya"
And Email as "prakash123@gmail.com"
Then Verify the text WRITE YOUR REVIEW
And Enter review as "Nice Product Thank u So much"
And Click on submit button
And close browser



Scenario: User able to Add  cart from Recommended items(Test case22)
Then Scroll to bottom of page
 And Verify RECOMMENDED ITEMS are visible
Then  Click on Add Cart in Recommended Products
Then Click on View cart
And Verify that product is displayed in cart page


Scenario:  Verify address details in checkout page(Test case23)

Then Click Singup/Login button 
Then Enter Name as "Devi2ka3" 
And Enter Email as "Devka223@gmail.com"
And Click on Signup button
Then Click on Mr. Checkbox
And Enter Password as "prasanna123"
And click Day
And  click month
And  click year
And  Click Sign up for our newsletter! check box
And   Click Receive special offers from our partners! check box
And Enter First Name as "siri"
And Enter Last Name as "kumar"
And Enter Company name as "Sripada"
And Enter Address1 as "Palakollu"
And Enter Address2 as "West Godavari"
And Enter State as "Andhra Pradesh"
And Enter City as "palakollu"
And Enter ZipCode as "534250"
And Enter Mobile Number as "63456787890"
And Click on Create Account button
Then Page should be navigated to "Automation Exercise - Account Created"
And Click on Continue button
Then Verify Logged in as username at top
Then Click on Add cart button to add first product
Then Click on Continue Shopping button
Then Click on Add cart button to add secont Product
Then Click on Continue Shopping button
Then Click on Cart button
And Verify that cart_page is displayed 
Then Click Proceed to check out button
Then Verify that the delivery address is same address filled at the time registration of account
And  Verify that the billing address is same address filled at the time registration of account
Then Click Delete Account 
Then Account deleted text display
And Close the Browser

Scenario:  Download Invoice after purchase (TestCase24)
Then Click on Add cart button to add one product
Then Click on Continue_Shopping 
And Click on Add cart button to add next Product
Then Click on Continue_Shopping2 
Then  Click on CartButton 
And Verify that the CartPage dispayed or not
Then Click Proceed_to_check_out button
Then Click on Register_or_Login
Then Enter_Name _as "reshU" 
And Enter_Email as "reshu123@gmail.com"
And Click on Signup_button
Then Click on Mr_Checkbox
And Enter PasswordCode as "ramya123"
And click on_Day
And  click on_month
And  click on_year
And  Click Sign_up for our newsletter_check_box
And   Click Receive special offers_from our_partner_check box
And Enter First_Name as "rani"
And Enter Last_Name as "kumar"
And Enter Company_name as "Sripada"
And Enter First_Address as "Palakollu"
And Enter Second_Address as "West Godavari"
And Enter State_name as "Andhra Pradesh"
And Enter City_name as "palakollu"
And Enter ZipCode_number as "534250"
And Enter Mobile_Number as "63456787890"
And Click on Create_Account button
Then it should be navigated_to as "Automation Exercise - Account Created"
And Click on Continue2_button
Then  Verify That the  Logged in as username at the top of the page
Then Click on Cart_button2 
Then Click Proceed to button
Then  Verify Address Details
And Verify Review Your Order Text
Then Enter description in comment text area as "Please give quality product"
And  click Place Order
Then  Enter payment details: Name as "Aparna" on Card 
And Card Number as "6079091554006488"
And CVC number as "822"
And  Expiration date month as "01" 
And Year as "2025"
And Click Pay and Confirm Order button
And Your order has been placed successfully! Text is displayed
Then  Click Download Invoice button and verify invoice is downloaded successfully
Then  Click Continue After download button
Then Click Delete_account button
And Account wiil be deleted Account deleted text disply
And close24 Browser

Scenario:  Verify Scroll Up using Arrow button and Scroll Down functionality(TestCase25)
Then Scroll down the Page to verify subscription
    Then The page as visible as Subscription
   And Click on arrow at bottom right side to it  moves to  upward
   And the page is scrolled up and as Full-Fledged practice website for Automation Engineers is visiable
    
  
  Scenario: Verify Scroll Up without Arrow button and Scroll Down functionality
  Then Scroll down the Page
And  Scroll down page to bottom Verify SUBSCRIPTION is visible
And Scroll up page to top 
And Verify the text Full-Fledged practice website for Automation Engineers text is visible on screen
 


 
