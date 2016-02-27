package com.khasang.javaquiz.javaquiz.Model.data;

import com.orm.SugarRecord;

/**
 * Created by pcuser on 26.02.2016.
 */
public class User extends SugarRecord {
    private String name;
    private String email;
    private String password;

    public User() {
    }

    public User(String name, String email, String password) {

        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
