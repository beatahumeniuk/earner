package pl.hack4girlz.earner.model.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String login;
    private String password;
    private EmployeeDTO employee;
}
