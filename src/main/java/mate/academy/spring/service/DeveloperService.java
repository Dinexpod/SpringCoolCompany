package mate.academy.spring.service;

import mate.academy.spring.dto.DeveloperDto;
import mate.academy.spring.model.Developer;

public interface DeveloperService {
    void create();

    Developer create(Developer developer);

    DeveloperDto getDeveloper(Long id);
}
