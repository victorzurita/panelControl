package com.key.licence.Core.dtos;

import com.key.licence.Dal.enums.AccessLevel;

/**
 * Created by jrafa on 2/4/2018.
 */
public class RoleDto {
    private String name;
    private String code;
    private String description;
    private String access_level;
    private boolean enabled_at_create;
    private boolean enabled_at_update;
    private boolean enabled_at_delete;
    private boolean enabled_at_print;
    private boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccess_level() {
        return access_level;
    }

    public void setAccess_level(String access_level) {
        this.access_level = access_level;
    }

    public boolean isEnabled_at_create() {
        return enabled_at_create;
    }

    public void setEnabled_at_create(boolean enabled_at_create) {
        this.enabled_at_create = enabled_at_create;
    }

    public boolean isEnabled_at_update() {
        return enabled_at_update;
    }

    public void setEnabled_at_update(boolean enabled_at_update) {
        this.enabled_at_update = enabled_at_update;
    }

    public boolean isEnabled_at_delete() {
        return enabled_at_delete;
    }

    public void setEnabled_at_delete(boolean enabled_at_delete) {
        this.enabled_at_delete = enabled_at_delete;
    }

    public boolean isEnabled_at_print() {
        return enabled_at_print;
    }

    public void setEnabled_at_print(boolean enabled_at_print) {
        this.enabled_at_print = enabled_at_print;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
