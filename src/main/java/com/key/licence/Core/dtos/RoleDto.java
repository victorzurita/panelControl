package com.key.licence.Core.dtos;

/**
 * Created by jrafa on 2/4/2018.
 */
public class RoleDto {
    private String name;
    private String description;
    private String AccessLevel;
    private boolean isEnableToCreate;
    private boolean isEnableToUpdate;
    private boolean isEnableToDelete;
    private boolean isEnableToPrint;
    private int idUserCreator;

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

    public String getAccessLevel() {
        return AccessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        AccessLevel = accessLevel;
    }

    public boolean isEnableToCreate() {
        return isEnableToCreate;
    }

    public void setEnableToCreate(boolean enableToCreate) {
        isEnableToCreate = enableToCreate;
    }

    public boolean isEnableToUpdate() {
        return isEnableToUpdate;
    }

    public void setEnableToUpdate(boolean enableToUpdate) {
        isEnableToUpdate = enableToUpdate;
    }

    public boolean isEnableToDelete() {
        return isEnableToDelete;
    }

    public void setEnableToDelete(boolean enableToDelete) {
        isEnableToDelete = enableToDelete;
    }

    public boolean isEnableToPrint() {
        return isEnableToPrint;
    }

    public void setEnableToPrint(boolean enableToPrint) {
        isEnableToPrint = enableToPrint;
    }

    public int getIdUserCreator() {
        return idUserCreator;
    }

    public void setIdUserCreator(int idUserCreator) {
        this.idUserCreator = idUserCreator;
    }
}
