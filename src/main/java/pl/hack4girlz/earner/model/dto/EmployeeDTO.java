package pl.hack4girlz.earner.model.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class EmployeeDTO {
    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private Date dateOfBirth;
    private List<ExperienceDTO> experiences;
    private List<EducationDTO> educationList;
    private LocationDTO address;
    private BranchName professionalGroup;
    private List<SkillDTO> skills;
    private List<InterestDTO> interests;
    private List<LanguageDTO> languages;
}
