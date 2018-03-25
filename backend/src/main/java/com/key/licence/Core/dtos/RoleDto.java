package com.key.licence.Core.dtos;

import com.key.licence.Dal.enums.AccessLevelType;

import javax.validation.constraints.NotNull;

/**
 * Created by Rafael Encinas.
 */
public class RoleDto {
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String accessLevelType;
    @NotNull
    private boolean enabledAtCreate;
    @NotNull
    private boolean enabledAtUpdate;
    @NotNull
    private boolean enabledAtDelete;
    @NotNull
    private boolean enabledAtPrint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccessLevelType() {
        return accessLevelType;
    }

    public void setAccessLevelType(String accessLevelType) {
        this.accessLevelType = accessLevelType;
    }

    public boolean isEnabledAtCreate() {
        return enabledAtCreate;
    }

    public void setEnabledAtCreate(boolean enabledAtCreate) {
        this.enabledAtCreate = enabledAtCreate;
    }

    public boolean isEnabledAtUpdate() {
        return enabledAtUpdate;
    }

    public void setEnabledAtUpdate(boolean enabledAtUpdate) {
        this.enabledAtUpdate = enabledAtUpdate;
    }

    public boolean isEnabledAtDelete() {
        return enabledAtDelete;
    }

    public void setEnabledAtDelete(boolean enabledAtDelete) {
        this.enabledAtDelete = enabledAtDelete;
    }

    public boolean isEnabledAtPrint() {
        return enabledAtPrint;
    }

    public void setEnabledAtPrint(boolean enabledAtPrint) {
        this.enabledAtPrint = enabledAtPrint;
    }
}
