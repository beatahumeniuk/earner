package pl.hack4girlz.earner.model.mapper;

import org.mapstruct.Mapper;
import pl.hack4girlz.earner.model.dto.LanguageDTO;
import pl.hack4girlz.earner.model.entity.Language;

@Mapper(componentModel = "spring")
public interface LanguageMapper extends AbstractModelMapper<Language, LanguageDTO> {
}
