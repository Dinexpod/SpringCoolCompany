package mate.academy.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private Long customerId;
    private String customerName;
    private int customerAge;
//    private Set<Project> customerProjects;

//    public void addProject(Project project) {
//        customerProjects.add(project);
//    }
}
