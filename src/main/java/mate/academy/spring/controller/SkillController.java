package mate.academy.spring.controller;

import mate.academy.spring.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/skill")
public class SkillController {

    private final SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String skill() {
        System.out.println("controller: SKILL");
//        skillService.create();
        return "skill/skill";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String projectInfo() {
        System.out.println("controller: SKILL INFO");
        return "skill/info";
    }

//    @RequestMapping(value = "/developer/{developerId}", method = RequestMethod.GET)
//    public String getDeveloperInfo(@PathVariable Long developerId, ModelMap view) {
//        Developer developer = developerService.getDeveloper(developerId);
//        view.put("developer", developer);
//        return "developer/info";
//    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("SKILL CONTROLLER is OK!");
        System.out.println("=============================================");
    }
}
