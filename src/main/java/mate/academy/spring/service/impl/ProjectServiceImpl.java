package mate.academy.spring.service.impl;

import mate.academy.spring.model.Developer;
import mate.academy.spring.model.Project;
import mate.academy.spring.repository.ProjectRepository;
import mate.academy.spring.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component("projectService")
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    @Override
    public void create() {
        Project project = new Project();

        project.setProjectName("Project 1");
        project.setProjectCost(234);
        project.setProjectDate(LocalDateTime.now());
        project.setProjectType("Outsource");

        projectRepository.save(project);
    }

    @Override
    public Project getProject(Long id) {
        return null;
    }
}
