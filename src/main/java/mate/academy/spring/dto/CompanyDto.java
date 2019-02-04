package mate.academy.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    private Long companyId;
    private String companyName;
    private Type companyType;

    private enum Type {
        OUTSOURCE,
        INSOURCE
    }
}
