package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

	
	@Given("User is on the Registration Page")
	public void user_is_on_the_registration_page() {

		System.out.println("User is on registration page");
	}

	@When("User enters the following user details")
	public void user_enters_the_following_user_details(DataTable dataTable) {

		List<List<String>> userList = dataTable.asLists(String.class);
		
			for(List<String> e : userList) {
				System.out.println(e); //print each iteration of the list data
			}
	    
	}

	
	@When("User enters the following user details with columns")
	public void user_enters_the_following_user_details_with_columns(DataTable dataTable) {
		
		//returns List of Maps
		List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
	
			System.out.println(userList);
			System.out.println(userList.get(0).get("firstname"));
			
			for(Map<String, String> e : userList) {
				System.out.println(e.get("firstname"));
				System.out.println(e.get("lastname"));
				System.out.println(e.get("email"));
				System.out.println(e.get("phone"));
				System.out.println(e.get("city"));
				
			}
	}
	

	
	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
		System.out.println("User registration should be successful");
		
	}
	
}
