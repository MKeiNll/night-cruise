package io.nightcruise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@Controller
public class MyController {

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("menu", Arrays.asList("About", "Developments", "Tar"));
        return "home.html";
    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("menu", Arrays.asList("Developments", "Tar"));
        return "about.html";
    }

    @GetMapping("/developments")
    public String getDevelopments(Model model) {
        model.addAttribute("menu", Arrays.asList("About", "Tar"));
        return "developments.html";
    }

    @GetMapping("/tar")
    public String getTar(Model model) {
        model.addAttribute("menu", Arrays.asList("About", "Developments"));
        return "tar.html";
    }
}
