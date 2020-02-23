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
        model.addAttribute("websiteCreated", "26.09.2019"); // TODO
        model.addAttribute("contactsUpdated", "26.09.2019"); // TODO
        model.addAttribute("cvUpdated", "21.08.2015"); // TODO
        return "about";
    }

    @GetMapping("/developments")
    public String getDevelopments(Model model) {
        model.addAttribute("current", "developments");
        model.addAttribute("sporexUpdated", "21.03.2014");
        model.addAttribute("sporexCreated", "12.12.2008");
        model.addAttribute("mbfUpdated", "27.10.2019");
        model.addAttribute("mbfCreated", "25.05.2019");
        return "developments";
    }

    @GetMapping("/tar")
    public String getTar(Model model) {
        model.addAttribute("current", "tar");
        model.addAttribute("towatchedUpdated", "12.12.2008");
        model.addAttribute("toreadUpdated", "21.03.2014");
        model.addAttribute("toplayedUpdated", "12.12.2008");
        model.addAttribute("tolearnedUpdated", "21.03.2014");
        model.addAttribute("xxxtarUpdated", "21.03.2014");
        return "tar";
    }

    @GetMapping("/super_3")
    public String getSuper3(Model model) {
        model.addAttribute("current", "super_3");
        return "super_3";
    }
}
