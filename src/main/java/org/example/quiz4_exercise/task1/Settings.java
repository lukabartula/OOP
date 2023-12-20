package org.example.quiz4_exercise.task1;

import java.lang.annotation.Retention;

public class Settings {

    @ConfigurableField
    private String username;
    @ConfigurableField
    private String password;
    private int timeout;

    public Settings(){

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

}
