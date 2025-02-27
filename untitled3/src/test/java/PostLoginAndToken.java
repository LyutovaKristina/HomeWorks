import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class PostLoginAndToken {

    public static void main(String[] args) {

        String requestBody = "{\"username\": \"Kris\", \"password\": \"172839qQ!\"}";


        Response response = given()
                .baseUri("https://try.vikunja.io")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/api/v1/login")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response();

        String token = response.jsonPath().getString("token");


    }
}