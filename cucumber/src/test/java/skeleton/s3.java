package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class s3 
{
	 WebDriver driver;
	@Given("user enters in to TestMeApp and logs in")
	public void user_enters_in_to_TestMeApp_and_logs_in() 
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe ");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();   
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");   
		 driver.findElement(By.id("userName")).sendKeys("Lalitha");  
		 driver.findElement(By.id("password")).sendKeys("Password123");
		 driver.findElement(By.cssSelector("input[value='Login']")).click(); 
	}

	@When("user search for a particular product in search engine")
	public void user_search_for_a_particular_product_in_search_engine() 
	{
		driver.findElement(By.name("products")).sendKeys("Headphone");
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		 
		 driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
		 driver.get("https://lkmdemoaut.accenture.com/TestMeApp/displayCart.htm");
		 // driver.findElement(By.linkText("Add to cart")).click(); 
	   // String text1=driver.findElement(By.xpath("//h4[@class='nomargin']")).getText();
 
	}

	@Then("user purchases the product")
	public void user_purchases_the_product() throws InterruptedException
	{
	     driver.findElement(By.xpath("//*[@class='btn btn-success btn-block']")).click();//clicking on checkout	    
	     driver.findElement(By.xpath("//*[@value='Proceed to Pay']")).click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();//selecting bank
	     driver.findElement(By.id("btn")).click();//clicking continue
	     driver.findElement(By.name("username")).sendKeys("123456");
	     driver.findElement(By.name("password")).sendKeys("Pass@456");
	     driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
	     driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	   
	     driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	     driver.findElement(By.linkText("SignOut"));
	} 
}
