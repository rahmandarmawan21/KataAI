package stepDdefinition;

import config.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.CoreMatchers.equalTo;
import static io.restassured.RestAssured.given;

public class CreateUser {

    @Given("I want to add new user using method Post")
    public void i_want_to_add_new_user_using_method_post() {
        System.out.println("--Post Method--");
    }

    @Then("I will successfully create user name {string}, job {string}")
    public void i_will_successfully_create_user_name_job(String name, String job) {
        String payLoad = Helper.createUser(name, job);

        Response resp = given().headers("content-type", ContentType.JSON,
                "Authorization")
                .body(payLoad).post("https://reqres.in/api/users");

        //	Assert response body and status
        resp.then().statusCode(200)
                .body("data.name", equalTo(name))
                .body("data.job", equalTo(job))
                .log().body();
    }
}
