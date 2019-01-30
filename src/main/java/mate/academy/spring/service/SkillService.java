package mate.academy.spring.service;

import mate.academy.spring.model.Skill;

public interface SkillService {
    void create();

    Skill getSkill(Long id);
}
