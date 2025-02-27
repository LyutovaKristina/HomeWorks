import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutCreateLabel {

    public static void main(String[] args) {
        String token = getToken();
        infoOfLabel(token);
    }


    public static String getToken() {
        String requestBody = "{\"username\": \"Kris\", \"password\": \"172839qQ!\"}";

        return given()
                .baseUri("https://try.vikunja.io")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/api/v1/login")
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .jsonPath()
                .getString("token");
    }


    public static ValidatableResponse infoOfLabel(String token) {
        String information =
                "{ \"email\": \"Kristina1@mail.ru\", " +
                        "\"name\": \"Kristina\"," +
                        " \"username\": \"misha\"," +
                        " \"description\": \"put your description\", " +
                        "\"hex_color\": \"#FFA500\"}";

        return given()
                .baseUri("https://try.vikunja.io")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(information)
                .when()
                .put("/api/v1/labels")
                .then()
                .log().all()
                .statusCode(200)
                .body("email", equalTo("Kristina1@mail.ru"))
                .body("name", equalTo("Kristina"))
                .body("username", equalTo("misha"))
                .body("description", equalTo("put your description"))
                .body("hex_color", equalTo("#FFA500"))
                .log()
                .body();
    }
}