package io.nightcruise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

class SetThemeRequestBody {
    public String theme;
}

@Controller
public class TemplateController {

    public static final int THEME_COOKIE_MAX_AGE = 10 * 365 * 24 * 60 * 60; // 10 years

    public static final String DEFAULT_THEME = "light";

    @RequestMapping(value = {"/"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String getHome(@CookieValue(required = false, value = "theme") String themeCookie, Model model) {
        setTheme(themeCookie, model);
        model.addAttribute("currentPage", "home");
        return "home";
    }

    @RequestMapping(value = {"/setTheme"}, method = {RequestMethod.POST})
    @ResponseBody
    public ResponseEntity setTheme(@RequestBody(required = false) SetThemeRequestBody setThemeRequest,
                                   HttpServletResponse response) throws IOException {
        Cookie themeCookie = new Cookie("theme", setThemeRequest.theme);
        themeCookie.setMaxAge(THEME_COOKIE_MAX_AGE);
        response.addCookie(themeCookie);
        return new ResponseEntity(HttpStatus.OK);
    }

    public void setTheme(String themeCookie, Model model) {
        String theme = themeCookie != null ? themeCookie : DEFAULT_THEME;
        model.addAttribute("currentTheme", theme);
    }

    @GetMapping("/about")
    public String getAbout(@CookieValue(value = "theme", required = false) String themeCookie, Model model) {
        setTheme(themeCookie, model);
        model.addAttribute("currentPage", "about");

        model.addAttribute("websiteCreated", "23.02.2020");
        model.addAttribute("websiteUpdated", "28.02.2020");
        return "about";
    }

    @GetMapping("/developments")
    public String getDevelopments(@CookieValue(value = "theme", required = false) String themeCookie, Model model) {
        setTheme(themeCookie, model);
        model.addAttribute("currentPage", "developments");

        model.addAttribute("sporexUpdated", "28.11.2018");
        model.addAttribute("sporexCreated", "21.06.2018");
        model.addAttribute("mbfCreated", "21.11.2016");
        model.addAttribute("mbfUpdated", "05.01.2017");
        return "developments";
    }
}
