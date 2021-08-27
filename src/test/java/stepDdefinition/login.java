package stepDdefinition;

import config.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;
import pageObject.createAccPage;

public class login extends Base {

    loginPage log = new loginPage();
    createAccPage crt = new createAccPage();

    @Given("Already open the {string} website")
    public void already_open_the_website(String url) {
        log.openUrl(url);
    }
    @And("I click signin menu")
    public void i_click_signin_menu() {
        log.clickSignBtn();
    }
    @When("I will be directed to login page")
    public void i_will_be_directed_to_login_page() {


    }
    @And("I input valid email {string} and password {string}")
    public void i_input_valid_email_and_password(String emails, String pass) {
        log.validateEmail();
        log.validatePassword();
        log.inputEmailField(emails);
        log.inputPasswordField(pass);
    }
    @And("Click login button")
    public void click_login_button() {
        log.clickSignInBtn();
    }
    @Then("I will succsessfully login")
    public void i_will_succsessfully_login() {
        log.verifyAccountHasLogin();
    }

}
