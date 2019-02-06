import ctrl.PeopleCtrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import people.PeopleModel;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;


public class PeopleTest extends Base {

    String getSwapiUrl = "https://swapi.co";
    String getSwapiPath = "/api/people/1/";
    PeopleModel test = new PeopleModel();


    @Test
    public void positiveTest() {
        Response response = given()
                .baseUri(getSwapiUrl)
                .basePath(getSwapiPath)
                .accept(ContentType.JSON)
                .when().get()
                .then().extract().response();

    }

    @Test
    public void getPeopleLuk() {
        PeopleModel people = new PeopleCtrl().getNewPeople();
        Assert.assertEquals("Luke Skywalker", people.getName());
        Assert.assertEquals("[https://swapi.co/api/films/2/, https://swapi.co/api/films/6/, https://swapi.co/api/films/3/, https://swapi.co/api/films/1/, https://swapi.co/api/films/7/]", people.getFilms().toString());//обязательно в конце прописать етод toString() так как он ждет срингу на выходе
        Assert.assertEquals("[https://swapi.co/api/species/1/\"\n" +
                "    ]", people.getSpecies().toString());
    }


/*    @Test
    public void ss() throws JSONException{
    Response resp = get("https://swapi.co/api/people/1/");
    //если метод возвращает массив строк обьекта
        // JSONArray jsonResponse = new JSONArray(response.asString());
        //        String capital = jsonResponse.getJSONObject(0).getString("capital");
    JSONObject jsonResponse = new JSONObject(resp.asString()); //если метод возвращает массив обьектов
    String capital = jsonResponse.getString("name");
        System.out.println(resp.asString());

        Assert.assertEquals(capital, "asdas");
    }*/
}
