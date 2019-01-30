package mate.academy.spring.controller;

import mate.academy.spring.dto.DeveloperDto;
import mate.academy.spring.model.Developer;
import mate.academy.spring.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
//        developerService.create();
        return "developer/developer";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String developerInfo() {
        System.out.println("controller: DEVELOPER INFO");
        return "developer/info";
    }

    @RequestMapping(value = "/{developerId}", method = RequestMethod.GET)
    public String getDeveloperInfo(@PathVariable Long developerId, ModelMap view) {
        DeveloperDto developerDto = developerService.getDeveloper(developerId);
        view.put("developer", developerDto);
        return "developer/info";
    }

    @RequestMapping(value = "/newDev", method = RequestMethod.GET)
    public ModelAndView newDeveloper() {
        return new ModelAndView("developer/createDeveloper", "developer", new Developer());
    }

    @RequestMapping(value = "/addDev", method = RequestMethod.POST)
    public String putDeveloper(DeveloperDto devDto, ModelMap model) {
        Developer dev = new  Developer();

        dev.setDeveloperAge(devDto.getDeveloperAge());
        dev.setDeveloperSalary(devDto.getDeveloperSalary());
        dev.setDeveloperName(devDto.getDeveloperName());

//        Long id = developerService.create(dev).getDeveloperId();
        DeveloperDto developerDto = developerService.getDeveloper(developerService.create(dev).getDeveloperId());
//        devDto.setDeveloperId(id);
        model.put("developer", developerDto);
        return "developer/showDev";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("DEVELOPER CONTROLLER is OK!");
        System.out.println("=============================================");
    }
}
