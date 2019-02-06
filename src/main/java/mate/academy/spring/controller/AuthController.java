package mate.academy.spring.controller;

import lombok.extern.log4j.Log4j;
import mate.academy.spring.dto.UserLoginInput;
import mate.academy.spring.dto.UserRegistrationInput;
import mate.academy.spring.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return "registration/reg";
    }

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public String log() {
        return "registration/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserLoginInput userLI) {
        System.out.println(userLI.getUsername());
        System.out.println(userLI.getPassword());
        securityService.doLogin(userLI);
        return "redirect:/auth/log";
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String auth(UserRegistrationInput userRI) {
        System.out.println("Email - " + userRI.getEmail());
        System.out.println("Username - " + userRI.getUsername());
        System.out.println("Name - " + userRI.getName());
        System.out.println("LastName - " + userRI.getLastName());
        System.out.println("Password - " + userRI.getPassword());
        return "redirect:/auth/reg";
    }
}
