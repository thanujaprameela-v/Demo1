package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class LoginStepsDemo {
	WebDriver driver;
	@Given("The URL of demo web shop application")
	public void the_URL_of_demo_web_shop_application() 
	{
	    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe ");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com/login");
	
	}

	@When("User enters {word} as username")
	public void user_enters_kannan_gmail_com_as_username(String email)
	{
	 driver.findElement(By.id("Email")).sendKeys(email);   
	}

	@When("User enters {word} as password")
	public void user_enters_password_as_password(String password)
	{
	  driver.findElement(By.id("Password")).sendKeys(password);   
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() 
	{
	    driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

	@Then("the user login successful")
	public void the_user_login_successful()
	{
		 boolean flag=driver.findElement(By.linkText("Log out")).isDisplayed();
         Assert.assertTrue(flag);
		 driver.findElement(By.linkText("Log out")).click();   
	}
}
