package mate.academy.spring.controller;

import mate.academy.spring.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/developer")
public class DeveloperController {

    private final DeveloperService developerService;

    @Autowired
    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String developer() {
        System.out.println("controller: DEVELOPER");
        developerService.create();
        return "/developer/developer";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String developerInfo() {
        System.out.println("controller: INFO");
        developerService.create();
        return "developer/info";
    }

//    @RequestMapping(value = "/developer/{developerId}", method = RequestMethod.GET)
//    public String getDeveloperInfo(@PathVariable Long developerId, ModelMap view) {
//        Developer developer = developerService.getDeveloper(developerId);
//        view.put("developer", developer);
//        return "developer/info";
//    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("=============================================");
        System.out.println("DeveloperController is done");
    }
}
