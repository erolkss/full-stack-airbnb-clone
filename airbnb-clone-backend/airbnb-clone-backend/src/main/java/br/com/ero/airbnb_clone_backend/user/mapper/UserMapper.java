package br.com.ero.airbnb_clone_backend.user.mapper;

import br.com.ero.airbnb_clone_backend.user.application.dto.ReadUserDTO;
import br.com.ero.airbnb_clone_backend.user.domain.Authority;
import br.com.ero.airbnb_clone_backend.user.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }
}