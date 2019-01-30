package mate.academy.spring.service;

import mate.academy.spring.dto.DeveloperDto;
import mate.academy.spring.model.Developer;
import mate.academy.spring.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(readOnly = true)
    public Developer getDeveloper(Long id) {
        Developer developer = developerRepository.getOne(id);
        DeveloperDto devDto = new DeveloperDto();

        devDto.setDeveloperId(developer.getDeveloperId());
        devDto.setDeveloperAge(developer.getDeveloperAge());
        devDto.setDeveloperName(developer.getDeveloperName());
        devDto.setDeveloperSalary(developer.getDeveloperSalary());

        return developer;
}

    @PostConstruct
    public void postConstruct() {
        System.out.println("DeveloperServiceImpl is OK!");
        System.out.println("=============================================");
    }
}
