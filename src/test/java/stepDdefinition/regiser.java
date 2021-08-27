package stepDdefinition;

import config.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.loginPage;
import pageObject.createAccPage;

public class regiser extends Base{

    loginPage log = new loginPage();
    createAccPage crt = new createAccPage();

    @And("I will be directed to register page")
    public void i_will_be_directed_to_register_page() {

    }
    @And("I input email {string}")
    public void i_input_email(String emails) {
        log.validateEmailReg();
        log.inputEmailRegField(emails);
    }
    @And("Click create an account button")
    public void click_create_an_account_button() {
        crt.clickRegisBtn();
    }
    @And("I will direct to register form")
    public void i_will_direct_to_register_form() {
        crt.verifyCreateAccountForm();
    }
    @And("I choose tittle {string}")
    public void i_choose_tittle(String tittle) {
        crt.inputTittle();
    }
    @And("I input first name {string} last name {string}")
    public void i_input_first_name_last_name(String fname, String lname) {
        crt.inputFirstName(fname);
        crt.inputLastName(lname);
    }
    @And("I input password {string} date of birth {string} {string} {string}")
    public void i_input_password_date_of_birth(String pass, String day, String month, String year) {
        crt.inputPassword(pass);
        crt.inputDaysDropdown(day);
        crt.inputMonthsDropdown(month);
        crt.inputYearsDropdown(year);
    }
    @And("I input address {string}")
    public void i_input_address(String addres) {
        crt.inputAddress(addres);
    }
    @And("I input city {string}")
    public void i_input_city(String city) {
        crt.inputCity(city);
    }
    @And("I input state {string}")
    public void i_input_state(String state) {
        crt.inputState(state);
    }
    @And("I input post code {string}")
    public void i_input_post_code(String postcode) {
        crt.inputPostcode(postcode);
    }
    @And("I input phone number {string}")
    public void i_input_phone_number(String phone) {
        crt.inputPhoneNum(phone);
    }
    @And("I input referance {string}")
    public void i_input_referance(String reffaddress) {
        crt.inputReffAddress(reffaddress);
    }
    @Then("I click register button")
    public void i_click_register_button() {
        crt.clickRegisBtn();
        log.verifyAccountHasLogin();
    }
}
