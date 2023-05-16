package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps1 {
	@Given("user is in Orange Hrm page")
	public void Homepage()
	
	{
		System.out.println("OrangeHrm page");
	}
	
	@When("user specifies username and pwd") 
	 public void login()
	 { 
		System.out.println("user credentials ");
	 }

	@And("user click on submit button") 
	public void clickbutton()
	{
		System.out.println("submit button");
	}

	@Then("user navigated to home page") 
	public void Hpage()
	{
		System.out.println("Home page");
		}

}
