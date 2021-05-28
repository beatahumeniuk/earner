package pl.hack4girlz.earner.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hack4girlz.earner.model.dto.EmployeeDTO;
import pl.hack4girlz.earner.model.mapper.EmployeeMapper;
import pl.hack4girlz.earner.model.repository.EmployeeRepository;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    public EmployeeDTO getEmployeeById(Long id){
        return employeeMapper.fromDO(employeeRepository.findById(id).get());
    }
}
