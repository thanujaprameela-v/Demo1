package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;

public class DemoPagerepostory
{
   WebDriver driver;
	@Given("The URL of Demo web application")
	public void the_URL_of_Demo_web_application() {
		 System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
	        driver=new ChromeDriver();
	        PageFactory.initElements(driver, LoginPage.class);//this code for creating page objects
	        driver.manage().window().maximize();
	        driver.get("http://demowebshop.tricentis.com/login");
	}

	@When("user enters {word} as username")
	public void user_enters_Kannan_gmail_com_as_username(String email) 
	{
        //driver.findElement(By.id("Email")).sendKeys(email);
        LoginPage.email.sendKeys(email);
	   
	}

	@When("user enters {word} as password")
	public void user_enters_test_as_password(String password) {
       //driver.findElement(By.id("Password")).sendKeys(password);
        LoginPage.password.sendKeys(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		//driver.findElement(By.cssSelector("input[value='Log in']")).click();
        LoginPage.loginButton.click();
	}

	@Then("the User login successful")
	public void the_User_login_successful()
	{
		 Assert.assertEquals("Demo Web Shop", driver.getTitle());
	}

}
