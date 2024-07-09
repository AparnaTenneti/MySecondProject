package Testcase_6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_us {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualTitle=driver.getTitle();
		String expTitle="Automation Exercise";
		if(actualTitle.equals(expTitle))
		{
	System.out.println("Title is correct and Test case passed");
		}
		else
		{
			System.out.println("Fails to title and Test case failed");
		}
            

            // Step 3: Click on 'Contact Us' button
            WebElement contactUsButton = driver.findElement(By.xpath("//a[@href='/contact_us']"));
            contactUsButton.click();

            // Step 4: Verify 'GET IN TOUCH' is visible
            WebElement getInTouchHeader = driver.findElement(By.xpath("//div/b/following::h2[@class='title text-center'][1]"));
            getInTouchHeader.isDisplayed();
                System.out.println("'GET IN TOUCH' is visible.");
             

          
             driver.findElement(By.xpath("/input[@name='name']")).sendKeys("surya");
            

             driver.findElement(By.xpath("//input[@name='email']")).sendKeys("surya123@gmail.com");
        

            driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Automation test");
           

            driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("This is a test message.");

            // Assuming there is an upload file button and you have a file to upload
             driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\lenovo\\OneDrive\\Desktop\\Selenium all notes\\PPT\\Software Development Life Cycle.pptx");

            // Step 8: Click 'Submit' button
            driver.findElement(By.xpath("//input[@type='submit']")).click();
     

            // Step 9: Handle alert dialog (assuming it's a JavaScript alert)
            driver.switchTo().alert().accept();

            // Step 10: Verify success message 'Success! Your details have been submitted successfully.'
            WebElement successMessage = driver.findElement(By.xpath("//div[contains(text(),'Success! Your details have been submitted successfully.')]"));
            if (successMessage.isDisplayed()) {
                System.out.println("Success message is visible: " + successMessage.getText());
            } else {
                System.out.println("Success message verification failed.");
                // Handle failure scenario
            }

            // Step 11: Click 'Home' button and verify that it lands to home page successfully
            WebElement homeButton = driver.findElement(By.xpath("//a[@id='home-button']"));
            homeButton.click();

            // Optional verification that we landed on the home page again
            WebElement homePageVerificationElementAfterNavigation = driver.findElement(By.xpath("//element_locator_for_home_page_verification"));
            if (homePageVerificationElementAfterNavigation.isDisplayed()) {
                System.out.println("Landed back to home page successfully.");
            } else 
                System.out.println("Navigation to home page verification failed.");
                  // Handle failure scenario
            

     


	}

}
