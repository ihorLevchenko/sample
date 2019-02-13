import ctrl.PeopleCtrl;
import org.junit.Assert;
import org.junit.Test;
import people.PeopleModel;


public class PeopleTest extends Base {

    /*String getSwapiUrl = "https://swapi.co";
    String getSwapiPath = "/api/people/1/";*/
    //PeopleModel test = new PeopleModel(); // for post


/*    @Test
    public void positiveTest() {
        //old logic method Get
        Response response = given()
                .baseUri(getSwapiUrl)
                .basePath(getSwapiPath)
                .accept(ContentType.JSON)
                .when().get()
                .then().extract().response(); // old logic

    }*/

    @Test
    public void getPeopleLuk() {
        //new logic method Get
        PeopleModel people = new PeopleCtrl().getNewPeople();

        Assert.assertEquals("Luke Skywalker", people.getName());
        Assert.assertEquals("[https://swapi.co/api/films/2/, https://swapi.co/api/films/6/, https://swapi.co/api/films/3/, https://swapi.co/api/films/1/, https://swapi.co/api/films/7/]", people.getFilms().toString());//обязательно в конце прописать метод toString() так как он ждет срингу на выходе, а не массив сторк
        Assert.assertEquals("[https://swapi.co/api/species/1/]", people.getSpecies().toString());

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
