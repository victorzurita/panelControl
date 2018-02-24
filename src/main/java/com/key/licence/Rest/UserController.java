package com.key.licence.Rest;

import com.key.licence.Core.dtos.UserDto;
import com.key.licence.Core.services.UserService;
import com.key.licence.Core.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jrafa on 2/5/2018.
 */
@RestController
@RequestMapping(path = "/api")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST, path = "/users")
    public ResponseEntity<Response> users(@RequestBody UserDto userDto) {
        Response response = userService.createUser(userDto);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
