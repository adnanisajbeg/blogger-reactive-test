package blogger.reactive;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2018-03-21
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

public abstract class AbstractTest {
    protected static String BASIC_URL = "/";

    @Autowired
    TestRestTemplate restTemplate;

}
