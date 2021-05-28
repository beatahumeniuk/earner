package pl.hack4girlz.earner.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    private Long id;
    private String login;
    private String password;
    @OneToOne
    @JoinTable(
            name = "user_employee",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private Employee employee;
}
