package com.key.licence.Core.parsers;

import com.key.licence.Core.dtos.RoleDto;
import com.key.licence.Dal.enums.AccessLevel;
import com.key.licence.Dal.models.Role;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by jrafa on 2/4/2018.
 */
@Service
public class RoleParser implements IParser<Role, RoleDto> {
    @Override
    public RoleDto parserEntityToDto(Role entity) {
        return null;
    }

    @Override
    public Role parserDtoToEntity(RoleDto dto) {
        Role rol = new Role();
        rol.setName(dto.getName());
        /*rol.setName(dto.getName());
        rol.setDescription(dto.getDescription());*/
        //rol.setAccessLevel(AccessLevel.valueOf(dto.getAccessLevel()));
        /*rol.setEnableToCreate(dto.isEnableToCreate());
        rol.setEnableToUpdate(dto.isEnableToUpdate());
        rol.setEnableToDelete(dto.isEnableToDelete());
        rol.setEnableToPrint(dto.isEnableToPrint());
        rol.setCreatedDate(new Date());
        rol.setActive(Boolean.TRUE);
        rol.setIdUserCreator(dto.getIdUserCreator());
*/
        return rol;
    }
}
