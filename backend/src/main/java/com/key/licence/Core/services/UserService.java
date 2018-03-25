package com.key.licence.Core.services;

import com.key.licence.Core.dtos.UserDto;
import com.key.licence.Core.parsers.UserParser;
import com.key.licence.Core.utils.Response;
import com.key.licence.Dal.models.Role;
import com.key.licence.Dal.models.Usr;
import com.key.licence.Dal.repositories.interfaces.IRoleRepository;
import com.key.licence.Dal.repositories.interfaces.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        Response response = new Response(Boolean.TRUE, "Created sucessfully a Usr", null);
        Usr user = userParser.parserDtoToEntity(userDto);
        Role rol = rolRepository.findOne(userDto.getRolId());
        rol.getUsers().add(user);
        userRepository.save(user);

        return response;
    }
}
