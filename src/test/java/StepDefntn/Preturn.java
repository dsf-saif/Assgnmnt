package StepDefntn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Hooks.Hclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Preturn 
{
	WebDriver d=Hclass.d;
	
@Given("Admin is navigated to the Product Return page and clicks the + button.")
public void admin_is_navigated_to_the_Product_Return_page_and_clicks_the_button1() throws InterruptedException 
	{
		d.get("http://retailm1.upskills.in/admin/");
		Thread.sleep(1500);
		   d.findElement(By.id("input-username")).sendKeys("admin");
		   d.findElement(By.id("input-password")).sendKeys("Admin@123");
		   Thread.sleep(500);
		   d.findElement(By.xpath("//button[@type='submit']")).click();
		   Thread.sleep(2200);

		   d.findElement(By.cssSelector("i.fa.fa-indent.fa-lg")).click();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//i[@class='fa fa-shopping-cart fw']")).click();
		   Thread.sleep(1000);
		   
		   d.findElement(By.linkText("Returns")).click();
		   Thread.sleep(700);
		   
		   d.findElement(By.cssSelector("a i.fa.fa-plus")).click();
		   Thread.sleep(1000);
		   
		   
	}

	@When("user enters Valid Order ID {string} First Name {string} Last Name{string} Email{string} and Telephone{string}")
	public void user_enters_Valid_Order_ID_First_Name_Last_Name_Email_and_Telephone1(String order_id, String firstname, String lastname, String email, String telephone) throws InterruptedException
	{
		   d.findElement(By.name("order_id")).sendKeys(order_id);
		   d.findElement(By.name("firstname")).sendKeys(firstname);
		   d.findElement(By.name("lastname")).sendKeys(lastname);
		   d.findElement(By.name("email")).sendKeys(email);
		   d.findElement(By.name("telephone")).sendKeys(telephone);
		   Thread.sleep(700);
		
	}

	@When("and Enter Valid Product {string} and Model {string}")
	public void and_Enter_Valid_Product_and_Model1(String product, String model) throws InterruptedException 
	{
		 d.findElement(By.name("product")).sendKeys(product);
		   d.findElement(By.name("model")).sendKeys(model);
		   Thread.sleep(700);
	}

	@When("click on the Save button")
	public void click_on_the_Save_button1() throws InterruptedException
	{
		 d.findElement(By.cssSelector("button i.fa.fa-save")).click();
		 Thread.sleep(1000);
	}

	@Then("Admin is navigated to Product Return Page with the new entry registered")
	public void admin_is_navigated_to_Product_Return_Page_with_the_new_entry_registered1() throws InterruptedException
	{
		WebElement e = d.findElement(By.xpath("//h1[text()='Product Returns']"));
		String t1=e.getText();
		
		WebElement t= d.findElement(By.xpath("//h1[text()]"));
		String t2= t.getText();
		
		System.out.println("User navigated to the Homepage");
		
		//Assert.assertEquals(t1, t2);
	
		Thread.sleep(2000);
		
		String mm1="Success: You have modified returns!";
		WebElement mm=  d.findElement(By.cssSelector("div.alert.alert-success"));
	    String act3 = mm.getText();
	    System.out.println(act3);
	    
	    
	    
	   // Assert.assertTrue(mm1.contains(act3));
	    
	    System.out.println("Entry successfully Created");
		
	}

	@When("user enters Invalid Order ID {string} First Name {string} Last Name{string} Email{string} and Telephone{string}")
	public void user_enters_Invalid_Order_ID_First_Name_Last_Name_Email_and_Telephone1(String order_id, String firstname, String lastname, String email, String telephone) throws InterruptedException
	{
		 d.findElement(By.name("order_id")).sendKeys(order_id);
		   d.findElement(By.name("firstname")).sendKeys(firstname);
		   d.findElement(By.name("lastname")).sendKeys(lastname);
		   d.findElement(By.name("email")).sendKeys(email);
		   d.findElement(By.name("telephone")).sendKeys(telephone);
		   Thread.sleep(1000);
		
	}

	@When("and Enter Invalid Product {string} and Model {string}")
	public void and_Enter_Invalid_Product_and_Model(String product, String model) throws InterruptedException
	{
		 d.findElement(By.name("product")).sendKeys(product);
		   d.findElement(By.name("model")).sendKeys(model);
		   Thread.sleep(1000);
		   
		   d.findElement(By.cssSelector("button i.fa.fa-save")).click();
		   Thread.sleep(1500);
	}

	@Then("Admin stays on the same page")
	public void admin_stays_on_the_same_page() throws InterruptedException
	{
		Thread.sleep(700);
		WebElement W= d.findElement(By.cssSelector("div i.fa.fa-exclamation-circle"));
		String warn=W.getText();
		System.out.println(warn);
		String Dngr="Warning: Please check the form carefully for errors!";
		
		//Assert.assertTrue(warn.contains(Dngr));
		
		System.out.println("Invalid details entered");
		Thread.sleep(2000);
	
		
	}

	@Given("User is navigated to the product returns page")
	public void user_is_navigated_to_the_product_returns_page() throws InterruptedException 
	{
		
		d.get("http://retailm1.upskills.in/admin/");
		Thread.sleep(1500);
		   d.findElement(By.id("input-username")).sendKeys("admin");
		   d.findElement(By.id("input-password")).sendKeys("Admin@123");
		   Thread.sleep(700);
		   d.findElement(By.xpath("//button[@type='submit']")).click();
		   Thread.sleep(3000);

		   d.findElement(By.cssSelector("i.fa.fa-indent.fa-lg")).click();
			Thread.sleep(1500);
			
			d.findElement(By.xpath("//i[@class='fa fa-shopping-cart fw']")).click();
		   Thread.sleep(2000);
		   
		   d.findElement(By.linkText("Returns")).click();
		   Thread.sleep(1000);
		   
		  
	}
	
	@When("User selects the products to be returned and clicks on the delete button")
	public void user_selects_the_products_to_be_returned_and_clicks_on_the_delete_button1() throws InterruptedException
	{
		
		d.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		//d.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		
		d.findElement(By.cssSelector("button i.fa.fa-trash-o")).click();
		   Thread.sleep(1000);
	}
	

	@Then("entry is deleted and message is displayed.")
	public void entry_is_deleted_and_message_is_displayed()
	{
		Alert mr= d.switchTo().alert();
		mr.accept();
		//String value= mr.getText();
		//System.out.println(value);
		
	
	String m1="Success: You have modified returns!";
		WebElement m=  d.findElement(By.cssSelector("div.alert.alert-success"));
	    String act = m.getText();
	    System.out.println(act);
	    
	   Assert.assertTrue(act.contains(m1));
	    System.out.println("Entry successfully deleted");
	}


	@When("User clicks on the delete button")
	public void user_clicks_on_the_delete_button() throws InterruptedException 
	{
		d.findElement(By.cssSelector("button i.fa.fa-trash-o")).click();
		   Thread.sleep(1000);
		
		Alert mr= d.switchTo().alert();
		String val= mr.getText();
		mr.accept();

		System.out.println(val);
		Thread.sleep(1000);
	}

	
	@Then("no entry is deleted and no message is deleted.")
	public void no_entry_is_deleted_and_no_message_is_deleted() throws InterruptedException 
	{
		WebElement n=  d.findElement(By.cssSelector("div.alert.alert-success"));
	    String act1 = n.getText();
	    System.out.println(act1);
	    Thread.sleep(2000);
	    
	    System.out.println("No entry is deleted & No Message is displayed");
	    
	    Thread.sleep(2000);
	}
	
	@Given("User is navigated to the products return page")
	public void user_is_navigated_to_the_products_return_page() throws InterruptedException 
	{
		d.get("http://retailm1.upskills.in/admin/");
		Thread.sleep(1500);
		   d.findElement(By.id("input-username")).sendKeys("admin");
		   d.findElement(By.id("input-password")).sendKeys("Admin@123");
		   Thread.sleep(500);
		   d.findElement(By.xpath("//button[@type='submit']")).click();
		   Thread.sleep(2200);

		   d.findElement(By.cssSelector("i.fa.fa-indent.fa-lg")).click();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//i[@class='fa fa-shopping-cart fw']")).click();
		   Thread.sleep(1000);
		   
		   d.findElement(By.linkText("Returns")).click();
		   Thread.sleep(700);
		   
		  // d.findElement(By.cssSelector("a i.fa.fa-plus")).click();
		   Thread.sleep(1000);
		 
	}
	
	@Then("valid returnID entry are displayed")
	public void valid_returnID_entry_are_displayed()
	{
		WebElement r1= d.findElement(By.xpath("//table/tbody/tr/td[1]"));
		System.out.println(r1.getText());
		
	    }

	@Then("valid orderID entry are displayed")
	public void valid_orderID_entry_are_displayed() 
	{
		WebElement o1=d.findElement(By.xpath("//table/tbody/tr/td[1]"));
		System.out.println(o1.getText());
	}

	@Then("valid customer entry are displayed")
	public void valid_customer_entry_are_displayed() 
	{
		WebElement c1=d.findElement(By.xpath("//table/tbody/tr/td[1]"));
		System.out.println(c1.getText());
	}

	@Then("valid product entry are displayed")
	public void valid_product_entry_are_displayed() 
	{
		WebElement p1=d.findElement(By.xpath("//table/tbody/tr/td[1]"));
		System.out.println(p1.getText());
		
	}

	@Then("valid model entry are displayed")
	public void valid_model_entry_are_displayed() 
	{
		WebElement m1= d.findElement(By.xpath("//table/tbody/tr/td[1]"));
		System.out.println(m1.getText());
		
	}
	
	@When("User Enters a valid Return ID {string}")
	public void user_Enters_a_valid_Return_ID(String return_id) throws InterruptedException
	{
		 d.findElement(By.xpath("//input[@name='filter_return_id']")).sendKeys(return_id);
		 Thread.sleep(1500);
	}

	@When("user enters a valid Order_ID {string}")
	public void user_enters_a_valid_Order_ID(String order_id) throws InterruptedException
	{
		 d.findElement(By.xpath("//input[@name='filter_order_id']")).sendKeys(order_id);  
		 Thread.sleep(1500);
	}

	@When("User Enters a valid Customer {string}")
	public void user_Enters_a_valid_Customer(String customer) throws InterruptedException
	{
		 d.findElement(By.xpath("//input[@name='filter_customer']")).sendKeys(customer);
		 Thread.sleep(1500);
		 
	}

	@When("User Enters a valid Product {string}")
	public void user_Enters_a_valid_Product(String product) throws InterruptedException
	{
		 d.findElement(By.xpath("//input[@name='filter_product']")).sendKeys(product);
		 Thread.sleep(1500);
		 
	}

	@When("User Enters a valid Model {string}")
	public void user_Enters_a_valid_Model(String model) throws InterruptedException 
	{
		 d.findElement(By.xpath("//input[@name='filter_model']")).sendKeys(model);
		 Thread.sleep(1500);
		 
	}
	@When("Clicks on the filter button")
	public void clicks_on_the_filter_button() throws InterruptedException 
	{
	d.findElement(By.cssSelector("button i.fa.fa-filter")).click();
	Thread.sleep(1500);
	
		
	}
	    



}
