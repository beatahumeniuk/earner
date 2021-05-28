package pl.hack4girlz.earner.model.entity;

import lombok.Data;
import pl.hack4girlz.earner.model.dto.BranchName;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Interest {

    @Id
    private Long id;
    private BranchName professionalGroup;
}
