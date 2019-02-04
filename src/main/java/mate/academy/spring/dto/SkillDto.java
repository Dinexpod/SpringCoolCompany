package mate.academy.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillDto {
    private Long skillId;
    private Name skillName;
    private Degree skillDegree;

    private enum Name {
        JAVA,
        RUBY,
        PHYTON,
        JS
    }

    private enum Degree {
        JUNIOR,
        MIDDLE,
        SENIOR
    }
}
