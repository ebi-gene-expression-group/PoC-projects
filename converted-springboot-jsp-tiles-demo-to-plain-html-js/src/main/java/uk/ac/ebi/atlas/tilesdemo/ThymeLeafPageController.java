package uk.ac.ebi.atlas.tilesdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeLeafPageController {

    @RequestMapping("/thymeleaf")
    public String index(Model model) {
        model.addAttribute("message", "Hello, ThymeLeaf World!");
        return "thymeleaf";
    }
}
