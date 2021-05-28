package pl.hack4girlz.earner.model.mapper;

import org.mapstruct.Mapper;
import pl.hack4girlz.earner.model.dto.ExperienceDTO;
import pl.hack4girlz.earner.model.entity.Experience;

@Mapper(componentModel = "spring")
public interface ExperienceMapper extends AbstractModelMapper<Experience, ExperienceDTO> {
}
