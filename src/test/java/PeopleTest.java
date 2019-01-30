import models.PeopleDescription;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;

public class PeopleTest {

    @Test
    public void test() {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (HTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            Object response = restTemplate.exchange("https://swapi.co/api/people/1/", HttpMethod.GET, entity, Object.class);
            System.out.println(response);
    }
}
