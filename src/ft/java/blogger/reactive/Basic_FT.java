package blogger.reactive;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2018-03-21
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
    public class Basic_FT extends AbstractTest {

    @Test
    public void application_started() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity(BASIC_URL, String.class);

        assertThat(forEntity).isNotNull();
        assertThat(forEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
