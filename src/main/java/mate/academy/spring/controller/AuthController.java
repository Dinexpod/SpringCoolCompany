package mate.academy.spring.controller;

import lombok.extern.log4j.Log4j;
import mate.academy.spring.dto.UserLoginInput;
import mate.academy.spring.dto.UserRegistrationInput;
import mate.academy.spring.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Log4j
@Controller
@RequestMapping("/auth")
public class AuthController {

    private final SecurityService securityService;

    @Autowired
    public AuthController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg() {
        return "registration/registration";
    }

    @GetMapping(value = "/log")
    public String log(final Authentication authentication, final ModelMap model,
                      final HttpServletRequest request) {

        if (authentication != null) {
            return "redirect:/index";
        }

        if (request.getParameterMap().containsKey("error"))
            model.addAttribute("error", true);
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(UserLoginInput userLI) {
        System.out.println(userLI.getUsername());
        System.out.println(userLI.getPassword());
        securityService.doLogin(userLI);
        return "redirect:/auth/log";
    }

    @PostMapping(value = "/auth")
    public String auth(UserRegistrationInput userRI) {
        System.out.println(userRI.toString());
        return "redirect:/auth/reg";
    }
}
