package mate.academy.spring.service;

import mate.academy.spring.dto.DeveloperDto;
import mate.academy.spring.model.Developer;
import mate.academy.spring.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

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
    public Developer create(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    @Transactional(readOnly = true)
    public DeveloperDto getDeveloper(Long id) {
        Developer developer = developerRepository.getOne(id);
        return DeveloperDto.doDtoDev(developer);
}

    @Override
    public List<Developer> getAll() {
        return developerRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        developerRepository.deleteById(id);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("DeveloperServiceImpl is OK!");
        System.out.println("=============================================");
    }
}
