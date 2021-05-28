package pl.hack4girlz.earner.model.mapper;

import org.mapstruct.Mapper;
import pl.hack4girlz.earner.model.dto.InterestDTO;
import pl.hack4girlz.earner.model.entity.Interest;

@Mapper(componentModel = "spring")
public interface InterestMapper extends AbstractModelMapper<Interest, InterestDTO> {
}
