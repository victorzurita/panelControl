package com.key.licence.Core.parsers;

import com.key.licence.Core.dtos.UserDto;
import com.key.licence.Dal.models.Usr;
import org.springframework.stereotype.Service;

/**
 * Created by jrafa on 2/4/2018.
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
