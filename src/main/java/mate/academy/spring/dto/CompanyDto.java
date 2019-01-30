package mate.academy.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mate.academy.spring.model.Company;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    private Long companyId;
    private String companyName;
    private Company.Type companyType;
//    private Set<Project> companyProjects;

//    public void addProject(Project project) {
//        companyProjects.add(project);
//    }

    public enum Type {
        OUTSOURCE,
        INSOURCE
    }
}
