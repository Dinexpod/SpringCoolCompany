package mate.academy.spring.controller;

import mate.academy.spring.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return "skill/skill";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String projectInfo() {
        return "skill/info";
    }
}
