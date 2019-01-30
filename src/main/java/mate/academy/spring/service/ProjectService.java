package mate.academy.spring.service;

import mate.academy.spring.model.Project;

public interface ProjectService {
    void create();
    Project getProject(Long id);
}
