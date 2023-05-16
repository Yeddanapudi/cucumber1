package step_definition;

import cucumber.deps.com.thoughtworks.xstream.io.xml.WstxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Search {
WstxDriver d=null;
	@Given("^user is in Amazon page$")
	public void user_is_in_Amazon_page() throws Throwable {
		System.setProperty("webdriver","D://chromedriver.exe");
		d=new Chromedriver();
		d.get("http://www.google.com");

		System.out.println("user is in Amazon page");
	}

	@When("^user selects Books from dropdown$")
	public void user_selects_Books_from_dropdown() throws Throwable {
System.out.println("user selects books from dropdown ");

	}

	@Then("^user user searches harrry porter on the text box$")
	public void user_user_searches_harrry_porter_on_the_text_box() throws Throwable {

		System.out.println("user types harry porter on the text box ");
	}

	@Then("^user clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
System.out.println("user clicks on search button");
	}

}
