package Login;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class rest extends base_rest {
    @Test
    public void test1()
    {
        int code= given()
                .get()
                .getStatusCode();
        System.out.println("Response Code from server is "+code);
    }
    @Test
    public void getResponseBody()
    {
        int code=given()
                .get()
                .getStatusCode();
        System.out.println("Response Code from server is "+code);
    }
}
