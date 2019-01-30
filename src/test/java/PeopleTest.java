import models.PeopleDescription;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class PeopleTest {

    @Test
    public void test() {
        RestTemplate restTemplate = new RestTemplate();
        PeopleDescription peopleDescription = restTemplate.getForObject("https://swapi.co/api/people/1/", PeopleDescription.class);
        System.out.println(peopleDescription);
    }
}
