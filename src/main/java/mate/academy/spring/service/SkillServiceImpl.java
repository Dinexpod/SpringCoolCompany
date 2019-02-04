package mate.academy.spring.service;

import mate.academy.spring.model.Skill;
import mate.academy.spring.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("skillService")
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;

    @Autowired
    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public void create() {
        Skill skill = new Skill();

        skill.setSkillDegree(Skill.getDegreeJunior());
        skill.setSkillName(Skill.getNameJava());

        skillRepository.save(skill);
    }

    @Override
    public Skill getSkill(Long id) {
        return null;
    }
}
