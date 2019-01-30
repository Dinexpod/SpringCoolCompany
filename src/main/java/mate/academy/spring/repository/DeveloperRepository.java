package mate.academy.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mate.academy.spring.model.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {

}
