package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RegisterTestMe
{
	WebDriver driver;
	@Given("The URL of Demo Testme application")
	public void the_URL_of_Demo_Testme_application() 
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe ");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/RegisterUser.htm");   
	}

	@When("user enters username {string}")
	public void user_enters_username(String username)
	{
		driver.findElement(By.id("userName")).sendKeys(username);
	}

	@When("user enters firstname {string}")
	public void user_enters_firstname(String firstname) 
	{
		driver.findElement(By.id("firstName")).sendKeys(firstname);  
	}

	@When("user enters lastname {string}")
	public void user_enters_lastname(String lastname) 
	{
		driver.findElement(By.id("lastName")).sendKeys(lastname);  
	}

	@When("user enters password {string}")
	public void user_enters_password(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);  
	}

	@When("user enters confirm password {string}")
	public void user_enters_confirm_password(String passconfirmation) 
	{
		driver.findElement(By.id("pass_confirmation")).sendKeys(passconfirmation);  
	}

	@When("user enters gender {string}")
	public void user_enters_gender(String string) 
	{
		driver.findElement(By.xpath("//input[@value= 'Female' and @type= 'radio']")).click();
	}

	@When("user enters emailid {string}")
	public void user_enters_emailid(String email) 
	{
		driver.findElement(By.id("emailAddress")).sendKeys(email);  
	}

	@When("user enters moblienumber {string}")
	public void user_enters_moblienumber(String phoneno)
	{
		driver.findElement(By.id("mobileNumber")).sendKeys(phoneno);  
	}

	@When("user enters dob {string}")
	public void user_enters_dob(String d)
	{
		driver.findElement(By.name("dob")).sendKeys(d); 
	}

	@When("user enters address {string}")
	public void user_enters_address(String address) 
	{
		driver.findElement(By.id("address")).sendKeys(address);  
	}

	@When("user enters securityanswer {string}")
	public void user_enters_securityanswer(String securityQuestion) 
	{
		Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		sel.selectByIndex(2);
	}

	@When("user enters answer {string}")
	public void user_enters_answer(String answer)
	{
		driver.findElement(By.id("answer")).sendKeys(answer);  
	}

	@When("user clicks register")
	public void user_clicks_register()
	{
		driver.findElement(By.name("Submit")).click();
	}

	@Then("user should be on login page")
	public void user_should_be_on_login_page() 
	{
		Assert.assertEquals("Login",driver.getTitle());
		 System.out.println("logged in!");
	}
}
