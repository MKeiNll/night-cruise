package io.nightcruise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    public static final String REDIRECT_PATH = "redirect:https://nightcruise.io";

    @RequestMapping("/error")
    public String handleError() {
        return REDIRECT_PATH;
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        return REDIRECT_PATH;
    }
}