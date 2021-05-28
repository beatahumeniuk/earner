package pl.hack4girlz.earner.model.entity;

import lombok.Data;
import pl.hack4girlz.earner.model.dto.EducationDegree;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Education {

    @Id
    private Long id;
    private Date startDate;
    private Date endDate;
    private String universityName;
    private String courseName;
    private boolean finished;

    @Enumerated(EnumType.STRING)
    private EducationDegree educationDegree;
}
