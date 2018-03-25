package com.key.licence.Core.dtos;

import javax.validation.constraints.NotNull;

/**
 * Created by Rafael Encinas.
 */
public class AuthenticationDto {
    @NotNull
    private String nickName;
    @NotNull
    private String password;

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
}
