import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;


public class PeopleTest {

    @Test
    public void test() {
        RestAssured.given()
                .baseUri("https://swapi.co")
                .basePath("/api/people/1/")
                .accept(ContentType.JSON)
                .when().get()
                .then().extract().response()
                .prettyPrint();
    }
}
