package io.nightcruise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {

    public static final String HOME_PAGE_TITLE = "Night Cruise";
    public static final String ABOUT_PAGE_TITLE = "About";
    public static final String DEV_PAGE_TITLE = "Developments";
    public static final String TAR_PAGE_TITLE = "Tar";

    public static final String ABOUT_MENU_LABEL = "About";
    public static final String DEV_MENU_LABEL = "Developments";
    public static final String TAR_MENU_LABEL = "Tar";
    public static final String HOME_MENU_LABEL = "Home";
    public static final String THEME_MENU_LABEL = "Theme";

    public static final String[] MENU_LABELS = {ABOUT_MENU_LABEL, DEV_MENU_LABEL, TAR_MENU_LABEL, THEME_MENU_LABEL};

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("menu", new String[][]{{HOME_PAGE_TITLE}, MENU_LABELS, {HOME_MENU_LABEL}});
        return "home.html";
    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("menu", new String[][]{{ABOUT_PAGE_TITLE}, MENU_LABELS, {HOME_MENU_LABEL}});
        return "about.html";
    }

    @GetMapping("/developments")
    public String getDevelopments(Model model) {
        model.addAttribute("menu", new String[][]{{DEV_PAGE_TITLE}, MENU_LABELS, {HOME_MENU_LABEL}});
        return "developments.html";
    }

    @GetMapping("/tar")
    public String getTar(Model model) {
        model.addAttribute("menu", new String[][]{{TAR_PAGE_TITLE}, MENU_LABELS, {HOME_MENU_LABEL}});
        return "tar.html";
    }
}
