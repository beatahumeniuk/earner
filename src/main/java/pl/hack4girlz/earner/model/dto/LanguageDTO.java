package pl.hack4girlz.earner.model.dto;

import lombok.Data;


@Data
public class LanguageDTO {
    private Long id;
    private String name;
    private SkillLevel level;
}
