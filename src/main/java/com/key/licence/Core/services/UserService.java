package com.key.licence.Core.services;

import com.key.licence.Core.dtos.UserDto;
import com.key.licence.Core.parsers.UserParser;
import com.key.licence.Core.utils.Response;
import com.key.licence.Dal.models.Role;
import com.key.licence.Dal.models.UserSauro;
import com.key.licence.Dal.repositories.interfaces.IRoleRepository;
import com.key.licence.Dal.repositories.interfaces.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Created by jrafa on 2/4/2018.
 */
@Service
public class UserService {
    @Autowired
    UserParser userParser;

    @Autowired
    IUserRepository userRepository;

    @Autowired
    IRoleRepository rolRepository;

    public Response createUser(UserDto userDto) {
        Response response = new Response(Boolean.TRUE, "Created sucessfully a ROLE", null);
        UserSauro user = userParser.parserDtoToEntity(userDto);
        Role rol = rolRepository.findOne(userDto.getIdRol());
        rol.getUsers().add(user);
        userRepository.save(user);
        rolRepository.save(rol);

        return response;
    }
}
