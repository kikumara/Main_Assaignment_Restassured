package Get;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Post_Products {
    @Test(dataProvider = "productdataprovider")
    void PostProducts(String Title,String Price ,String Description,String Category){
        RestAssured.baseURI="https://fakestoreapi.com";
        RequestSpecification httpRequest=RestAssured.given();

        JSONObject requestParams=new JSONObject();
        requestParams.put("title",Title);
        requestParams.put("price",Price);
        requestParams.put("description",Description);
        requestParams.put("category",Category);
        httpRequest.header("Content-Type","application/json; charset=utf-8");
        httpRequest.body(requestParams.toJSONString());
        Response response=httpRequest.request(Method.POST,"/products");

        String responseBody=response.getBody().asString();
        System.out.println("Response Body is :"+responseBody);
        Assert.assertEquals(responseBody.contains(Title),true);

                Assert.assertEquals(responseBody.contains(Price),true);
                        Assert.assertEquals(responseBody.contains(Description),true);
                           Assert.assertEquals(responseBody.contains(Category),true);

    }
    @DataProvider(name="productdataprovider")
    Object[][] getprductdata(){
        String productdata[][]={{"test product1","13.5","","Electronic"},{"test product_2","13.5","","kitchen-utensils"},{"test product_3","13.5","","Furiture"},{"test product_4","13.5","","Eltrical"}};
        return (productdata);
    }
}
