package uk.ac.ebi.atlas.tilesdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/jsp_with_tiles")
    public String jsp_with_tiles() {
        return "jsp_with_tiles";
    }

    @GetMapping("/simple_html")
    public String welcomeHTML() {
        return "simple_html";
    }
}
