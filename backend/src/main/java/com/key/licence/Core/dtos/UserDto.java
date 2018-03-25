package com.key.licence.Core.dtos;

import javax.validation.constraints.NotNull;

/**
 * Created by Rafael Encinas.
 */
public class UserDto {
    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private String nickName;
    @NotNull
    private String password;
    @NotNull
    private int rolId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }
}
