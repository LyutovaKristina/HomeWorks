import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PutCreateLabel {

    public static void main(String[] args) {
        Properties properties = loadProperties();
        String baseUrl = properties.getProperty("base_url");
        String apiKey = properties.getProperty("api_key");

        String token = getToken(baseUrl);
        infoOfLabel(token, baseUrl, apiKey);
    }

    public static Properties loadProperties() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/test/resources/application.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getToken(String baseUrl) {
        String requestBody = "{\"username\": \"Kris\", \"password\": \"172839qQ!\"}";
        return given()
                .baseUri(baseUrl)
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

    public static ValidatableResponse infoOfLabel(String token, String baseUrl, String apiKey) {
        String information =
                "{ \"email\": \"Kristina1@mail.ru\", " +
                        "\"name\": \"Kristina\"," +
                        " \"username\": \"misha\"," +
                        " \"description\": \"put your description\", " +
                        "\"hex_color\": \"#FFA500\"}";

        return given()
                .baseUri(baseUrl)
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token) // Используем полученный токен
                .body(information)
                .when()
                .put("/api/v1/labels")
                .then()
                .log().all()
                .statusCode(201)
                .body("email", equalTo("Kristina1@mail.ru"))
                .body("name", equalTo("Kristina"))
                .body("username", equalTo("misha"))
                .body("description", equalTo("put your description"))
                .body("hex_color", equalTo("#FFA500"))
                .log()
                .body();
    }
}