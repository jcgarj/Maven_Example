import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class apiTest {

    @Test
    public void coranavirus(){
        RestAssured.baseURI = String.format("https://api.quarantine.country/api/v1/summary/latest");

        Response response= given()
                .header("Accept", "Aplication/json")
                .log().all()
                .get();

        assertEquals(200,response.getStatusCode());

        String body = response.getBody().asString();
        System.out.println("Body Response" + body);

    }
}
