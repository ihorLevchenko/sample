import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;


public class PeopleTest {

    @Test
    public void positiveTest() {
        RestAssured.given()
                .baseUri("https://swapi.co")
                .basePath("/api/people/1/")
                .accept(ContentType.JSON)
                .when().get()
                .then().extract().response()
                .prettyPrint();
    }

    @Test
    public void negativeTest() {
        RestAssured.given()
                .baseUri("https://swapi.co")
                .basePath("/api/people/1/")
                .accept(ContentType.JSON)
                .when().get()
                .then().body("name", Matchers.equalTo("Shlyapa"));
    }
}
