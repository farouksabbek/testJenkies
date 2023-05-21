package stepDefinition;

import com.coinHouse.base.Base;
import com.coinHouse.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class LoginSteps extends Base {

    LoginPage loginPage = new LoginPage();

    @Given("I go to the site")
    public void openSite() {
        loginPage.openSite();}

    @When("I add text  {string} and {string}")
    public void iAddTextAnd(String arg0, String arg1)  {
       loginPage.iAddTextAnd(arg0,arg1);}

    @When("I click on search")
    public void clickSearch() {
        loginPage.clickSearch(); }




}
