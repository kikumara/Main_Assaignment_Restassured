import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.notNullValue;

public class Course_Profile {
    @Test
    void getCarts()
        {

            String url = "https://edtech-backend-urtjok3rza-wl.a.run.app/api/course/";
            given().when().
                    get(url).then().
                    body(matchesJsonSchemaInClasspath("Getdata.json"));
        }

    @Test
    void checkProductIsNotNul() {
        String url = "https://edtech-frontend-urtjok3rza-wl.a.run.app/profile";
        given().when().
                get(url).then()
                .body("upload", notNullValue())
                .body("edit.email", notNullValue()).log().body();

    }
}
