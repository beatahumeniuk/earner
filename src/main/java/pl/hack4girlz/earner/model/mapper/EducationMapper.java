package pl.hack4girlz.earner.model.mapper;

import org.mapstruct.Mapper;
import pl.hack4girlz.earner.model.dto.EducationDTO;
import pl.hack4girlz.earner.model.entity.Education;

@Mapper(componentModel = "spring")
public interface EducationMapper extends AbstractModelMapper<Education, EducationDTO>{
}
