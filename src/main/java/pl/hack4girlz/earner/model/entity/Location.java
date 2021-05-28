package pl.hack4girlz.earner.model.entity;

import lombok.Data;
import pl.hack4girlz.earner.model.dto.CityType;
import pl.hack4girlz.earner.model.dto.Voivodeship;

import javax.persistence.*;

@Entity
@Data
public class Location {

    @Id
    private Long id;
    private String city;
    @OneToOne
   private Coordinate coordinate;

    @Enumerated(EnumType.STRING)
    private CityType cityType;

    @Enumerated(EnumType.STRING)
    private Voivodeship voivodeship;
}
