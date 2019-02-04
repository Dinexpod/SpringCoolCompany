package mate.academy.spring.controller;

import lombok.extern.log4j.Log4j;
import mate.academy.spring.dto.UserLoginInput;
import mate.academy.spring.dto.UserRegistrationInput;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        System.out.println("LOGIIIIIIIIIIIIIIIIIIIIN");
        System.out.println(user.getPassword());
        System.out.println(user.getUsername());
        return "redirect:/developer/index";
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String login(UserRegistrationInput userAuth) {
        System.out.println("AUTHOOOOOOOOOOORIZATION");
        System.out.println(userAuth.getPassword());
        System.out.println(userAuth.getUsername());
        System.out.println(userAuth.getEmail());
        System.out.println(userAuth.getLastName());
        System.out.println(userAuth.getName());
        return "redirect:/developer/index";
    }
}
