package org.inheritaneEx;

public abstract class UserAccount {
    private String username;
    private String password;
    private String fullName;

    public UserAccount(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public boolean changePassword(String newPass, String confirmPass){
        return newPass.equals(confirmPass);
    }

    public abstract void accessWebsite();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
