package stepDdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetUser {
    @Given("I want to see the detail of user with id {string}")
    public void i_want_to_see_the_detail_of_user_with_id(String string) {
        System.out.println("--Get Method--");

    }
    @Then("I should see the users detail with")
    public void i_should_see_the_users_detail_with(DataTable dataTable) {

        List<List<String>> data = dataTable.cells();

        Response resp = given().headers("content-type", ContentType.JSON)
                .get("https://reqres.in/api/users" + data.get(1).get(0));

        resp.then().body("data.id", equalTo(Integer.parseInt(data.get(1).get(0))))
                .body("data.email", equalTo(data.get(1).get(1)))
                .body("data.first_name", equalTo(data.get(1).get(2)))
                .body("data.last_name", equalTo(data.get(1).get(3)))
                .body("data.avatar", equalTo(data.get(1).get(4)))
        ;

    }
}
