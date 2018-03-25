package com.key.licence.Core.parsers;

import com.key.licence.Core.dtos.UserDto;
import com.key.licence.Dal.models.Usr;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Rafael Encinas.
 */
@Service
public class UserParser implements IParser<Usr, UserDto> {

    @Override
    public UserDto parserEntityToDto(Usr entity) {
        return null;
    }

    @Override
    public Usr parserDtoToEntity(UserDto dto) {
        Usr user = new Usr();
        user.setName(dto.getName());
        user.setLastName(dto.getLastName());
        user.setNickName(dto.getNickName());
        user.setPassword(dto.getPassword());
        user.setActive(Boolean.TRUE);
        user.setCreatedAtDate(new Date());
        user.setUpdatedAtDate(new Date());
        return  user;
    }
}
