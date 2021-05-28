package pl.hack4girlz.earner.model.entity;

import lombok.Data;
import pl.hack4girlz.earner.model.dto.BranchName;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Employee {
    @Id
    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private Date dateOfBirth;
    @OneToMany
    private List<Experience> experiences;
    @OneToMany
    private List<Education> educationList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;

    @Enumerated(EnumType.STRING)
    private BranchName professionalGroup;

    @ManyToMany
    @JoinTable(
            name = "employee_skills",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<Skill> skills;

    @ManyToMany
    @JoinTable(
            name = "employee_interests",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "interest_id"))
    private List<Interest> interests;

    @ManyToMany
    @JoinTable(
            name = "employee_language",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id"))
    private List<Language> languages;
}
