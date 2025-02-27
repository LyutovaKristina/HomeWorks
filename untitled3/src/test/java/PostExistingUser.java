import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class PostExistingUser {
    public static void main (String [] args){
        existingUser();
    }

    public static ValidatableResponse existingUser() {
        String requestBody = "{ \"email\": \"Kristina@mail.ru\", \"password\": \"172839qQ!\", \"username\": \"Nadezhda\" }";

        return given()
                .baseUri("https://try.vikunja.io")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(requestBody)
                .when()
                .post("/api/v1/register")
                .then()
                .statusCode(400)
                .body("email", equalTo("Kristina@mail.ru"))
                .body("username", equalTo("Nadezhda"))
                .log()
                .body();

    }

}
