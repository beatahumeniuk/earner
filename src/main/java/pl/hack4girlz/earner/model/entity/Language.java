package pl.hack4girlz.earner.model.entity;

import lombok.Data;
import pl.hack4girlz.earner.model.dto.SkillLevel;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Data
public class Language {
    @Id
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private SkillLevel level;
}
