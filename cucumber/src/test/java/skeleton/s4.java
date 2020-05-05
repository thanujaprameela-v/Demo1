package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class s4
{
    WebDriver driver;
	@Given("Alex has registered in to TestMeApp")
	public void alex_has_registered_in_to_TestMeApp()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe ");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@When("Alex search a particular product like headphones")
	public void alex_search_a_particular_product_like_headphones() 
	{
		 driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");   
		 driver.findElement(By.id("userName")).sendKeys("Lalitha");  
		 driver.findElement(By.id("password")).sendKeys("Password123");
		 driver.findElement(By.cssSelector("input[value='Login']")).click(); 
		 driver.findElement(By.name("products")).sendKeys("Headphone");
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() 
	{
	    
	}
	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() 
	{
	  WebElement payment=driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']"));
	  WebElement cart=driver.findElement(By.linkText("Add to cart")); 
	  Assert.assertEquals(payment,cart);
	  driver.close();
	}
}
