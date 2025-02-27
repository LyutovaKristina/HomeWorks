import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostRegister {

    public static void main(String[] args) {
         createUser();
    }

    public static ValidatableResponse createUser() {
        String requestBody = "{ \"email\": \"Kristina1@mail.ru\", \"password\": \"172839qQ!\", \"username\": \"Kris\" }";

        return given()
                .baseUri("https://try.vikunja.io")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/api/v1/register")
                .then()
                .statusCode(200)
                .body("email", equalTo("Kristina1@mail.ru"))
                .body("username", equalTo("Kris"))
                .log()
                .body();
    }
}