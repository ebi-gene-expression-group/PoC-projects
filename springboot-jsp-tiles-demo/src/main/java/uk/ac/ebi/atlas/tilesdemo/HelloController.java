package uk.ac.ebi.atlas.tilesdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
