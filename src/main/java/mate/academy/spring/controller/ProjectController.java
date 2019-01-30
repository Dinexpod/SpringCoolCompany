package mate.academy.spring.controller;

import mate.academy.spring.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String project() {
        System.out.println("controller: PROJECT");
//        developerService.create();
        return "project/project";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String projectInfo() {
        System.out.println("controller: PROJECT INFO");
        projectService.create();
        return "project/info";
    }

//    @RequestMapping(value = "/developer/{developerId}", method = RequestMethod.GET)
//    public String getDeveloperInfo(@PathVariable Long developerId, ModelMap view) {
//        Developer developer = developerService.getDeveloper(developerId);
//        view.put("developer", developer);
//        return "developer/info";
//    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PROJECT CONTROLLER is OK!");
        System.out.println("=============================================");
    }
}
