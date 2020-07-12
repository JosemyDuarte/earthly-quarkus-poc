package josemyduarte.io;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;

import java.util.HashMap;
import java.util.Map;

@QuarkusTest
public class GreetingTest {

    public static final String JOSEMY = "Josemy";

    @Test
    public void testJaxrs() {
        RestAssured.when().get("/greet/hi").then().contentType("text/plain").body(equalTo("hello jaxrs"));
    }

    @Test
    public void testJaxrsBye() {

        RestAssured.given()
                .urlEncodingEnabled(true)
                .contentType(ContentType.JSON)
                .param(JOSEMY)
                .post("/greet/bye")
                .then()
                .contentType("application/json")
                .body(equalTo("{\"message\":\"bye " + JOSEMY + "\"}"));
    }

    @Test
    public void testFunqy() {
        RestAssured.when().get("/funqyHello").then().contentType("application/json").body(equalTo("\"hello funqy\""));
    }

}
