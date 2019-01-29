import models.PeopleDescription;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class PeopleTest {

    @Test
    public void test() {
        RestTemplate restTemplate = new RestTemplate();
        Object peopleDescription = restTemplate.getForObject("https://api.hearthstonejson.com/v1/19776/enUS/cards.json", Object.class);
        System.out.println(peopleDescription);
    }
}
