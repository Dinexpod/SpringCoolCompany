package mate.academy.spring.controller;

import lombok.extern.log4j.Log4j;
import mate.academy.spring.dto.UserLoginInput;
import mate.academy.spring.dto.UserRegistrationInput;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Log4j
@Controller
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg() {
        return "auth/reg";
    }

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public String showAuth() {
        return "developer/index1";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserLoginInput user) {
        return "redirect:/developer/index";
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String login(UserRegistrationInput userAuth) {
        log.info("LastName" + userAuth.getLastName());
        log.info("Email" + userAuth.getEmail());
        log.info("Username" + userAuth.getUsername());
        log.info("Password" + userAuth.getPassword());
        log.info("Name" + userAuth.getName());
        return "redirect:/developer/index";
    }
}
