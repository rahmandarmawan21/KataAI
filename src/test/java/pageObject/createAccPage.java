package pageObject;

import config.Base;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

public class createAccPage extends Base {
    By create_acc       = By.xpath("//h1[contains(text(),'Create an account')]");
    //personal infoemation form
    By mr_radio_btn     = By.id("id_gender1");
    By ms_radio_btn     = By.id("id_gender2");
    By fcusname_input   = By.id("customer_firstname");
    By lcusname_input   = By.id("customer_lastname");
    By password_input   = By.id("passwd");
    By days_dropdown    = By.id("days");
    By month_dropdown   = By.id("months");
    By years_dropdown   = By.id("years");

    //yours address
    By firstname_input  = By.id("firstname");
    By lastname_input   = By.id("lastname");
    By company_input    = By.id("company");
    By address_input    = By.id("address1");
    By city_input       = By.id("city");
    By state_dropdown   = By.id("id_state");
    By postcode_input   = By.id("postcode");
    By country_dropdown = By.id("id_country");
    By phone_input      = By.id("phone_mobile");
    By reff_address     = By.id("alias");
    By register_btn     = By.id("submitAccount");

    public void verifyCreateAccountForm() {
        waitUntilElementIsVisible(create_acc, 15);
        Boolean visible = driver.findElement(create_acc).isDisplayed();
        String text = driver.findElement(create_acc).getText();
        assertEquals(text, "Create an account");
        assertEquals(visible, true);
    }

    public void inputTittle(String gender) {
        if(gender == "Mr" || gender == "mr"){
            driver.findElement(mr_radio_btn).click();
        }else{
            driver.findElement(ms_radio_btn).click();
        }
    }

    public void inputFirstName(String fname) { driver.findElement(fcusname_input).sendKeys(fname); }

    public void inputLastName(String lname) { driver.findElement(lcusname_input).sendKeys(lname); }

    public void inputPassword(String pass) { driver.findElement(password_input).sendKeys(pass); }

    public void inputDaysDropdown(String day) {
        driver.findElement(days_dropdown).sendKeys(day);
        driver.findElement(days_dropdown).sendKeys(Keys.ENTER);
    }

    public void inputMonthsDropdown(String month) {
        driver.findElement(month_dropdown).sendKeys(month);
        driver.findElement(month_dropdown).sendKeys(Keys.ENTER);
    }

    public void inputYearsDropdown(String year) {
        driver.findElement(years_dropdown).sendKeys(year);
        driver.findElement(years_dropdown).sendKeys(Keys.ENTER);
    }

    public void inputAddress(String addres) { driver.findElement(address_input).sendKeys(addres); }

    public void inputCity(String city) { driver.findElement(city_input).sendKeys(city); }

    public void inputState(String state) {
        driver.findElement(state_dropdown).sendKeys(state);
        driver.findElement(state_dropdown).sendKeys(Keys.ENTER);
    }

    public  void inputPostcode(String postcode) { driver.findElement(postcode_input).sendKeys(postcode); }

//    public void inputCountry(String country) {
//        driver.findElement(country_dropdown).sendKeys(country);
//        driver.findElement(country_dropdown).sendKeys(Keys.ENTER);
//    }

    public void inputPhoneNum(String phone) { driver.findElement(phone_input).sendKeys(phone); }

    public void inputReffAddress(String reffaddress) { driver.findElement(reff_address).sendKeys(reffaddress); }

    public void clickRegisBtn() { driver.findElement(register_btn).click(); }

}
