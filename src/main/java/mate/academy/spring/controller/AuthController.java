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

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String showAuth() {

        return "auth/reg";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserLoginInput user) {
        System.out.println("LOGIIIIIIIIIIIIIIIIIIIIN");
        System.out.println(user.getPassword());
        System.out.println(user.getUsername());
        return "redirect:/developer/index";
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String login(UserRegistrationInput user) {
        System.out.println("AUTHOOOOOOOOOOORIZATION");
        System.out.println(user.getPassword());
        System.out.println(user.getUsername());
        System.out.println(user.getEmail());
        System.out.println(user.getLastName());
        System.out.println(user.getName());
        return "redirect:/developer/index";
    }
}
