package pl.hack4girlz.earner.model.dto;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class EducationDTO {

    @Id
    private Long id;
    private Date startDate;
    private Date endDate;
    private String universityName;
    private String courseName;
    private boolean finished;
    private EducationDegree educationDegree;
}
