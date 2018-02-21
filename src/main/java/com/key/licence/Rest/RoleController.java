package com.key.licence.Rest;

import com.key.licence.Core.dtos.RoleDto;
import com.key.licence.Core.services.RoleService;
import com.key.licence.Core.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jrafa on 2/5/2018.
 */
@RestController
@RequestMapping(path = "/api")
public class RoleController {
    @Autowired
    RoleService roleService;

    @RequestMapping(method = RequestMethod.POST, path = "/roles")
    public ResponseEntity<Response> roles(@RequestBody RoleDto roleDto) {
        Response response = roleService.createRol(roleDto);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
