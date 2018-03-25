package com.key.licence.Core.services;

import com.key.licence.Core.dtos.AuthenticationDto;
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
 * Created by jrafa on 3/10/2018.
 */
@Service
public class AuthService {
    @Autowired
    UserParser userParser;

    @Autowired
    IUserRepository userRepository;

    @Autowired
    IRoleRepository rolRepository;

    public Response authentication(AuthenticationDto authenticationDtoDto) {
        Response response = new Response(Boolean.TRUE, "Created sucessfully a Usr", null);
        Usr user = userRepository.authentication(authenticationDtoDto.getNickName(), authenticationDtoDto.getPassword());
        if(user != null){
            response.setData("Authentication successfully");
            return  response;
        }
        response.setData("Authentication failed");
        return  response;
    }
}