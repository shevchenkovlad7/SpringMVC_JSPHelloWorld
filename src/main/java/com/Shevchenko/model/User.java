package com.Shevchenko.model;

import org.springframework.stereotype.Component;


@Component
public class User {

    private String login;
    private String password;
    private Boolean truOrFalse=false;

    public boolean isTruOrFalse(){

        return truOrFalse;
    }

    public Boolean getTruOrFalse() {
        return truOrFalse;
    }

    public void setTruOrFalse(Boolean truOrFalse) {
        this.truOrFalse = truOrFalse;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
