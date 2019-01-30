package mate.academy.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mate.academy.spring.model.Skill;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillDto {
    private Long skillId;
    private Skill.Name skillName;
    private Skill.Degree skillDegree;

    public enum Name {
        JAVA,
        RUBY,
        PHYTON,
        JS
    }

    public enum Degree {
        JUNIOR,
        MIDDLE,
        SENIOR
    }
}
