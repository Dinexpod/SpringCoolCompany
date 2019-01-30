package mate.academy.spring.service;

import mate.academy.spring.model.Company;
import mate.academy.spring.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("companyService")
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void create() {
        Company company = new Company();

        company.setCompanyName("Varteq");
        company.setCompanyType(Company.Type.OUTSOURCE);

        companyRepository.save(company);
    }

    @Override
    public Company getCompany(Long id) {
        return null;
    }
}
