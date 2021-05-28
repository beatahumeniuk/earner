package pl.hack4girlz.earner.model.mapper;

import org.mapstruct.Mapper;
import pl.hack4girlz.earner.model.dto.LocationDTO;
import pl.hack4girlz.earner.model.entity.Location;

@Mapper(componentModel = "spring", uses = {CoordinateMapper.class})
public interface LocationMapper extends AbstractModelMapper<Location, LocationDTO>{
}
