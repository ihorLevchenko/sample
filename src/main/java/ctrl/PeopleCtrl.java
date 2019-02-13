package ctrl;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import people.PeopleModel;


public class PeopleCtrl {


    public PeopleCtrl() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                //спецификация
                .setBaseUri("https://swapi.co")
                .setBasePath("/api/people/1/")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
    }

    public PeopleModel getNewPeople() {
        return given()
                .when()
                .get()
                .as(PeopleModel.class);
    }
}
