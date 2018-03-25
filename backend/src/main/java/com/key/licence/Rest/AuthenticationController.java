package com.key.licence.Rest;

import com.key.licence.Core.dtos.AuthenticationDto;
import com.key.licence.Core.dtos.UserDto;
import com.key.licence.Core.services.AuthService;
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
 * Created by jrafa on 3/10/2018.
 */
@RestController
public class AuthenticationController {
    @Autowired
    AuthService authService;

    @RequestMapping(method = RequestMethod.POST, path = "/auth")
    public ResponseEntity<Response> users(@RequestBody AuthenticationDto authenticationDto) {
        Response response = authService.authentication(authenticationDto);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
