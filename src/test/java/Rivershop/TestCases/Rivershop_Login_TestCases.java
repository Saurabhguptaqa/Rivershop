package Rivershop.TestCases;
import Rivershop.Utility.SeleniumOperations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Rivershop_Login_TestCases
{

	@Given("^Admin Open \"([^\"]*)\" browser$")
	public void admin_Open_browser(String Broswer_name) 

	{
		String Browsername= Broswer_name;
		SeleniumOperations.browserLaunch(Browsername);

	}

	@Given("^Admin Open Rivershop URL \"([^\"]*)\"$")
	public void admin_Open_Rivershop_URL(String Rivershop_URl) 
	{
		String RivershopYeloURL=Rivershop_URl;
		SeleniumOperations.openURL(RivershopYeloURL);	    
	}

	@When("^Admin Enter Emial id as \"([^\"]*)\"$")
	public void admin_Enter_Emial_id_as(String Emailid)
	{
		String Emailid_Textbox_xpath="//*[@id='exampleInputEmail1']";
		String Rivesrhop_Login_Emial_id=Emailid;
		SeleniumOperations.sendkeys(Emailid_Textbox_xpath, Rivesrhop_Login_Emial_id); 
	}

	@When("^Admin Enter Password as \"([^\"]*)\"$")
	public void admin_Enter_Password_as(String Password) 
	{

		String Password_Textbox_xpath="//*[@id='exampleInputPassword1']";
		String Rivershop_Login_Password=Password;
		SeleniumOperations.sendkeys(Password_Textbox_xpath, Rivershop_Login_Password); 
	}

	@When("^Click at login button$")
	public void click_at_login_button()
	{
		String Submit_Button_xpath="//*[@id=\"loginForm\"]/div[4]/button";
		SeleniumOperations.click(Submit_Button_xpath);

	}

	@Then("^Admin navigate to Home page$")
	public void admin_navigate_to_Home_page()
	{
		String Validate_text="View Website";
		String Variable_xapth="//*[contains(text(),'View Website')]";
		String Test_Case_Name="LoginPage";
		SeleniumOperations.Validate_pages(Validate_text, Variable_xapth, Test_Case_Name);


	} 

	@Then("^broswer closed$")
	public void broswer_closed() 
	{
		SeleniumOperations.browserClose();

	}

}
