package pl.hack4girlz.earner.model.dto;

import lombok.Data;
import pl.hack4girlz.earner.model.entity.Coordinate;

@Data
public class LocationDTO {

    private Long id;
    private String city;
    private Coordinate coordinate;
    private CityType cityType;
    private Voivodeship voivodeship;
}
