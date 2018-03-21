package blogger.reactive.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2018-03-21
 */

@RestController
public class BlogPostController {
    @RequestMapping(method = GET)
    public Flux<String> getLatestPost() {
        return Flux.empty();
    }
}
