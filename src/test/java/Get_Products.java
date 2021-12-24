import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
 import static   io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

public class Get_Products {
 @Test
 void getproduct(){
  baseURI="https://edtech-frontend-urtjok3rza-wl.a.run.app/profile";

  RequestSpecification httpRequest=RestAssured.given();

   Response response = httpRequest.request(Method.GET, "https://edtech-frontend-urtjok3rza-wl.a.run.app/profile");
   String responseBody = response.getBody().asString();
   System.out.println("Response Body is: " + responseBody);

   int statusCode = response.getStatusCode();
   System.out.println("status Code :" + statusCode);
   Assert.assertEquals(statusCode, 200);
   String ststusLine = response.getStatusLine();
   System.out.println(ststusLine);
   Assert.assertEquals(ststusLine, "HTTP/1.1 200 OK");
   String contentType=response.header("Content-Type");
   System.out.println("Content-Type "+contentType);
   Assert.assertEquals(contentType,"application/json; charset=utf-8");
 }
}
