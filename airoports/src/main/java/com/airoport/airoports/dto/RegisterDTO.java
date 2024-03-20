package com.airoport.airoports.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDTO {

    private String username;
    private String password;

    public RegisterDTO(){}

    public RegisterDTO(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String registrationInfo(){
        return "Зарегестрированный пользователь: " + this.username + " его пароль: " + this.password;
    }
}
