package com.key.licence.Core.parsers;

import com.key.licence.Core.dtos.RoleDto;
import com.key.licence.Dal.enums.AccessLevelType;
import com.key.licence.Dal.models.Role;
import org.apache.commons.lang3.EnumUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Rafael Encinas.
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
        rol.setDescription(dto.getDescription());

        if(EnumUtils.isValidEnum(AccessLevelType.class, dto.getAccessLevelType())) {
            rol.setAccessLevelType(AccessLevelType.valueOf(dto.getAccessLevelType()));
        }
        rol.setEnabledAtCreate(dto.isEnabledAtCreate());
        rol.setEnabledAtUpdate(dto.isEnabledAtUpdate());
        rol.setEnabledAtDelete(dto.isEnabledAtDelete());
        rol.setEnabledAtPrint(dto.isEnabledAtPrint());

        rol.setActive(Boolean.TRUE);
        rol.setCreatedAtDate(new Date());
        rol.setUpdatedAtDate(new Date());

        return rol;
    }
}
