package pl.hack4girlz.earner.model.mapper;

import org.mapstruct.Mapper;
import pl.hack4girlz.earner.model.dto.CoordinateDTO;
import pl.hack4girlz.earner.model.entity.Coordinate;

@Mapper
public interface CoordinateMapper extends AbstractModelMapper<Coordinate, CoordinateDTO>{
}
