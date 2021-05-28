package pl.hack4girlz.earner.model.mapper;

import org.mapstruct.Mapper;
import pl.hack4girlz.earner.model.dto.SkillDTO;
import pl.hack4girlz.earner.model.entity.Skill;

@Mapper(componentModel = "spring")
public interface SkillMapper extends AbstractModelMapper<Skill, SkillDTO> {
}
