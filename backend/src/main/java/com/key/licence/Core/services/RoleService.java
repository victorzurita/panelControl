package com.key.licence.Core.services;

import com.key.licence.Core.dtos.RoleDto;
import com.key.licence.Core.parsers.RoleParser;
import com.key.licence.Core.utils.Response;
import com.key.licence.Dal.models.Role;
import com.key.licence.Dal.repositories.interfaces.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Created by jrafa on 2/4/2018.
 */
@Service
public class RoleService {
    @Autowired
    IRoleRepository rolRepository;

    @Autowired
    RoleParser rolParser;

    public Response createRol(RoleDto rolDto) {
        Response response = new Response(Boolean.TRUE, "Created sucessfully a ROLE", null);
        Role newRol = rolParser.parserDtoToEntity(rolDto);
        rolRepository.save(newRol);
        response.setData(newRol);

        return  response;
    }

    public ResponseEntity<String> getAllRoles() {
        return null;
    }
}
