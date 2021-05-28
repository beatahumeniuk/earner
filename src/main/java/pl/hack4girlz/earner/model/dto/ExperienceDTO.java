package pl.hack4girlz.earner.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ExperienceDTO {
    private Long id;
    private Date startDate;
    private Date endDate;
    private String companyName;
    private String position;
    private BranchName professionalGroup;
}
