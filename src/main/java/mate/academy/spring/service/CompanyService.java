package mate.academy.spring.service;

import mate.academy.spring.model.Company;
import mate.academy.spring.model.Developer;

public interface CompanyService {
    void create();

    Company getCompany(Long id);
}
