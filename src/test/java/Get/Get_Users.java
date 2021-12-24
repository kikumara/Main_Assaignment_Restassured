package Get;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Get_Users {
    @Test
    void getusers() {
        given()
                .when()
                .get("https://fakestoreapi.com/users")
                .then()
                .body("name.firstname", hasItems("david", "don", "kevin", "miriam")).log().all();
    }

    @Test
    void getlong() {
        given()
                .get("https://fakestoreapi.com/users")
                .then()
                .body("address.geolocation", not(hasValue(nullValue()))).statusCode(200).contentType("application/json; charset=utf-8").statusLine("HTTP/1.1 200 OK").log().all();
    }
}
