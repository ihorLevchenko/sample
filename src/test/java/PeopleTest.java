import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;


public class PeopleTest extends Base {




    @Test
    public void positiveTest() {
        RestAssured.given()
                .baseUri(logic.getSwapiUrl())
                .basePath(logic.getSwapiPath())
                .accept(ContentType.JSON)
                .when().get()
                .then().extract().response()
                .prettyPrint();
    }

    @Test
    public void negativeTest() {
        RestAssured.given()
                .baseUri(logic.getSwapiUrl())
                .basePath(logic.getSwapiUrl())
                .accept(ContentType.JSON)
                .when().get()
                .then().body("name", Matchers.equalTo("Shlyapa"));
    }
}
