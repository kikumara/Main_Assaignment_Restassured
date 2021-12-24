package Get;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.notNullValue;

public class Get_Carts {
    @Test
    void getCarts()
        {

            String url = "https://fakestoreapi.com/carts";
            given().when().
                    get(url).then().
                    body(matchesJsonSchemaInClasspath("Getdata.json")).log().all();
        }

    @Test
    void checkProductIsNotNul() {
        String url = "https://fakestoreapi.com/carts";
        given().when().
                get(url).then()
                .body("products", notNullValue())
                .body("products.productId", notNullValue()).log().body()
                .body("products.quantity", notNullValue()).log().headers();
    }
}
