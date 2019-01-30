package mate.academy.spring.service;

import mate.academy.spring.model.Developer;

public interface DeveloperService {
    void create();

    Developer getDeveloper(Long id);
}
