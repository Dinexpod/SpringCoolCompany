package mate.academy.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;
    private Name skillName;
    private Degree skillDegree;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "developerSkills")
    private Set<Developer> skillDevelopers = new HashSet<>();

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
