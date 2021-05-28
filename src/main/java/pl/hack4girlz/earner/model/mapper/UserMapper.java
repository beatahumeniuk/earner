package pl.hack4girlz.earner.model.mapper;

import org.mapstruct.Mapper;
import pl.hack4girlz.earner.model.dto.UserDTO;
import pl.hack4girlz.earner.model.entity.User;

@Mapper(componentModel = "spring", uses = {EmployeeMapper.class})
public interface UserMapper extends AbstractModelMapper<User, UserDTO> {
}
