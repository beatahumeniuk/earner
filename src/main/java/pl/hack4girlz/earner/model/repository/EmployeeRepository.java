package pl.hack4girlz.earner.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hack4girlz.earner.model.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
}
