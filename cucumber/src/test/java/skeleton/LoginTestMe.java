package skeleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginTestMe 
{
	WebDriver driver;
	@Given("The URL of demo Testme application")
	public void the_URL_of_demo_Testme_application()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe ");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");   
	}
	@When("User enter {word} as username")
	public void user_enter_Lalitha_as_username(String username) 
	{
		driver.findElement(By.id("userName")).sendKeys(username);   
	}

	@When("User enter {word} as password")
	public void user_enter_Password_as_password(String password) 
	{
		driver.findElement(By.id("password")).sendKeys(password);  
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() 
	{
		driver.findElement(By.cssSelector("input[value='Login']")).click();       
	}
	@Then("the user logins successful")
	public void the_user_logins_successful() 
	{
		boolean flag=driver.findElement(By.linkText("SignOut")).isDisplayed();
        Assert.assertTrue(flag);
		 driver.findElement(By.linkText("SignOut")).click();	   
	}
}
