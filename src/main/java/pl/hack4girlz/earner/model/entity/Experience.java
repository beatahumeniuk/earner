package pl.hack4girlz.earner.model.entity;

import lombok.Data;
import pl.hack4girlz.earner.model.dto.BranchName;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Experience {
    @Id
    private Long id;
    private Date startDate;
    private Date endDate;
    private String companyName;
    private String position;

    @Enumerated(EnumType.STRING)
    private BranchName professionalGroup;
}
