package pl.hack4girlz.earner.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hack4girlz.earner.model.entity.Experience;

@Repository
public interface ExperienceRepository  extends JpaRepository<Experience, Long>{
}
