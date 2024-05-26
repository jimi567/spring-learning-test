package cholog;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class SerializeTest {

    @Test
    void serialize() {
        var data = RestAssured
                .given().log().all()
                .when().get("/json")
                .then().log().all().extract().jsonPath().get();

        System.out.println(data);
    }

    @Test
    void serializeRecord() {
        var data = RestAssured
                .given().log().all()
                .when().get("/json/record")
                .then().log().all().extract().jsonPath().get();

        System.out.println(data);
    }
}
