package pl.hack4girlz.earner.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Coordinate {
    @Id
    private Long id;
    private String latitude;
    private String longitude;
}
