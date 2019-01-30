package mate.academy.spring.service;

import mate.academy.spring.model.Developer;
import mate.academy.spring.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("developerService")
public class DeveloperServiceImpl implements DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public void create() {
        Developer developer = new Developer();

        developer.setDeveloperName("Din");
        developer.setDeveloperSalary(234234);
        developer.setDeveloperAge(22);

        developerRepository.save(developer);
    }

    @Override
    public Developer getDeveloper(Long id) {
        return null;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("DeveloperServiceImpl is done");
        System.out.println("=============================================");
    }
}
