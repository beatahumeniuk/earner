package pl.hack4girlz.earner.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Skill {
    @Id
    private Long id;
    private String name;
    private int level;
}
