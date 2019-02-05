package mate.academy.spring.controller;

import lombok.extern.log4j.Log4j;
import mate.academy.spring.dto.DeveloperDto;
import mate.academy.spring.model.Developer;
import mate.academy.spring.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Log4j
@Controller
@RequestMapping("/developer")
public class DeveloperController {

    private final DeveloperService developerService;

    @Autowired
    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        System.out.println("controller: INDEX");
        return "developer/index1";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String developer() {
        System.out.println("controller: DEVELOPER");
//        developerService.create();
        return "developer/developer";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String developerInfo() {
        return "developer/info";
    }

    @RequestMapping(value = "/delete/{developerId}", method = RequestMethod.POST)
    public String developerDelete(@PathVariable Long developerId) {
        developerService.delete(developerId);
        return "redirect:/developer/listDev";
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
        Developer dev = new Developer();

        dev.setDeveloperAge(devDto.getDeveloperAge());
        dev.setDeveloperSalary(devDto.getDeveloperSalary());
        dev.setDeveloperName(devDto.getDeveloperName());

        DeveloperDto developerDto = developerService
                .getDeveloper(developerService.create(dev).getDeveloperId());

        model.put("developer", developerDto);
        return "developer/showDev";
    }

    @RequestMapping(value = "/listDev", method = RequestMethod.GET)
    public String listDeveloper(ModelMap model) {
        System.out.println("controller: DEVELOPER LIST");

        List<DeveloperDto> developers = developerService.getAll()
                .stream()
                .map(DeveloperDto::doDtoDev)
                .collect(Collectors.toList());

        model.put("developers", developers);
        return "developer/listDeveloper";
    }

    @RequestMapping(value = "/jqueryDev", method = RequestMethod.GET)
    public String jQueryDev() {

        return "developer/jqueryDev";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("DEVELOPER CONTROLLER is OK!");
        System.out.println("=============================================");
    }
}
