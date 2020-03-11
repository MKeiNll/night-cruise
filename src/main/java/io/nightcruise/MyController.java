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
        model.addAttribute("currentPage", "home");
        model.addAttribute("currentTheme", "vivid");
        return "home";
    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("currentPage", "about");
        model.addAttribute("currentTheme", "vivid");
        model.addAttribute("websiteCreated", "23.02.2020");
        model.addAttribute("websiteUpdated", "28.02.2020");
        return "about";
    }

    @GetMapping("/developments")
    public String getDevelopments(Model model) {
        model.addAttribute("currentPage", "developments");
        model.addAttribute("currentTheme", "vivid");
        model.addAttribute("sporexUpdated", "28.11.2018");
        model.addAttribute("sporexCreated", "21.06.2018");
        model.addAttribute("mbfCreated", "21.11.2016");
        model.addAttribute("mbfUpdated", "05.01.2017");
        return "developments";
    }
}
