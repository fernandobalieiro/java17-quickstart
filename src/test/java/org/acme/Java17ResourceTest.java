package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class Java17ResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/country")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy Reactive"));
    }

}