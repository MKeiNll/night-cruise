package io.nightcruise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyController {
    @RequestMapping(value = {"/"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String getHome(Model model) {
        model.addAttribute("current", "home");
        return "home";
    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("current", "about");
        model.addAttribute("websiteCreated", "23.02.2020");
        return "about";
    }

    @GetMapping("/developments")
    public String getDevelopments(Model model) {
        model.addAttribute("current", "developments");
        model.addAttribute("sporexUpdated", "28.11.2018");
        model.addAttribute("sporexCreated", "21.06.2018");
        return "developments";
    }

    @GetMapping("/tar")
    public String getTar(Model model) {
        model.addAttribute("current", "tar");
        return "tar";
    }

    @GetMapping("/super_3")
    public String getSuper3(Model model) {
        model.addAttribute("current", "super_3");
        return "super_3";
    }
}
