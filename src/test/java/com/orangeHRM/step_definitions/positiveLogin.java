package com.orangeHRM.step_definitions;

import com.orangeHRM.pages.DashBoardPage;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.utilities.Base;
import com.orangeHRM.utilities.TestInputs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class positiveLogin extends Base {
	
	HomePage hp = new HomePage();
	DashBoardPage dbp = new DashBoardPage();
	
	@Given("^I am on orange home page$")
	public void i_am_on_orange_home_page() throws Throwable {
	    driver.get(TestInputs.BASE_URL);
	}

	@When("^I enter valid credintials in the log in panel$")
	public void i_enter_valid_credintials_in_the_log_in_panel() throws Throwable {
	    hp.userName.sendKeys(TestInputs.USER_NAME);
	    hp.userPWD.sendKeys(TestInputs.USER_PASSWOR);
	    hp.loginButton.click();
	}

	@Then("^i should see the dashboard$")
	public void i_should_see_the_dashboard() throws Throwable {
	  System.out.println(dbp.dashBoardText.getText());
	}

}
