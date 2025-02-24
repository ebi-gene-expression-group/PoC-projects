package uk.ac.ebi.atlas.tilesdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeLeafPageController {

    @GetMapping("/simple_thymeleaf")
    public String simple_thymeleaf(Model model) {
        model.addAttribute("message", "Hello, ThymeLeaf World!");
        return "simple_thymeleaf";
    }

    @GetMapping("/composite_thymeleaf")
    public String composite_thymeleaf(Model model) {
        model.addAttribute("message", "Hello, composite ThymeLeaf World!");
        return "composite_thymeleaf";
    }

    @GetMapping("/composite_thymeleaf_extends_base")
    public String composite_thymeleaf_with_header_fragment(Model model) {
        model.addAttribute("title",
            "Thymeleaf Example with header fragment and base");
        model.addAttribute("message",
            "Hello, composite ThymeLeaf World!<br/>This message is coming from the Java controller class.");
        return "example_page/example_page_base";
    }
}
