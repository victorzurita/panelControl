package com.key.licence.Core.parsers;

import com.key.licence.Core.dtos.UserDto;
import com.key.licence.Dal.models.UserSauro;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by jrafa on 2/4/2018.
 */
@Service
public class UserParser implements IParser<UserSauro, UserDto> {

    @Override
    public UserDto parserEntityToDto(UserSauro entity) {
        return null;
    }

    @Override
    public UserSauro parserDtoToEntity(UserDto dto) {
        UserSauro user = new UserSauro();
        user.setName(dto.getFullName());
        /*user.setFullName(dto.getFullName());
        user.setNickName(dto.getNickName());
        user.setPassword(dto.getPassword());
        user.setActive(Boolean.TRUE);
        user.setCreatedDate(new Date());
        user.setIdUserCreator(dto.getIdUserCreator());
*/
        return  user;
    }
}
