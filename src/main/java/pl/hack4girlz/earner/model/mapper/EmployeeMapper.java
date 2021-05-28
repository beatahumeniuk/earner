package pl.hack4girlz.earner.model.mapper;

import org.mapstruct.Mapper;
import pl.hack4girlz.earner.model.dto.EmployeeDTO;
import pl.hack4girlz.earner.model.entity.Employee;

@Mapper(componentModel = "spring", uses = {ExperienceMapper.class, EducationMapper.class,
LocationMapper.class, SkillMapper.class, InterestMapper.class, LanguageMapper.class})
public interface EmployeeMapper  extends AbstractModelMapper<Employee, EmployeeDTO>{
}
