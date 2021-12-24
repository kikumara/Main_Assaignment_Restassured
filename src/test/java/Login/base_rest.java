package Login;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class base_rest {
    @BeforeClass
    public void setup()
    {
        RestAssured.authentication=RestAssured.preemptive().basic("Amrutha CM","Nectar*111529");
        RestAssured.baseURI="https://edtech-frontend-urtjok3rza-wl.a.run.app/";
    }
    @BeforeClass
    public void setup1()
    {
        RestAssured.authentication=RestAssured.preemptive().basic("Amrutha CM","Nectar*111529");
        RestAssured.baseURI="https://edtech-frontend-urtjok3rza-wl.a.run.app/";
    }

}


