import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class GetRequestDemo {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users";
    }

    @Test
    public void statusCodeVerification() {
        given()

        .when()
                .param("page", 2)
        .then()
                .statusCode(200);
    }

    @Test
    public void getResponseBody() {

        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get();
        System.out.println(response.prettyPrint());

    }

}
