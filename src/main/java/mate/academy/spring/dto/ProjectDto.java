package mate.academy.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
    private Long projectId;
    private String projectName;
    private String projectType;
    private double projectCost;
    private LocalDateTime projectDate;
//    private Set<Developer> projectDevelopers;

//    public void addDeveloper(Developer developer) {
//        projectDevelopers.add(developer);
//    }
}
