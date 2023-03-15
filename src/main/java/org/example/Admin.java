package org.example;

public class Admin {
    private String username;
    private String password;
    private boolean logInStatus = false;

    public Admin(String username, String password)
    {
        this.username = username;
        this.password = password;
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
    public void changePassword(String pass)
    {
        this.password = pass;
    }

    public boolean getLogInStatus() {
        return logInStatus;
    }
    public void setLogInStatus(boolean logInStatus) {
        this.logInStatus = logInStatus;
    }
    public void changeLogInStatus(){
        this.logInStatus = !logInStatus;
    }

}
