package mate.academy.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeveloperDto {
    private Long developerId;
    private String developerName;
    private Integer developerAge;
    private Integer developerSalary;
}
