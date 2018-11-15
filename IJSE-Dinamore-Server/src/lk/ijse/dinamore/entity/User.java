/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.entity;

/**
 *
 * @author User
 */
public class User {
    
    private String userName;
    private String password;
    private String type;

    public User() {
    }

    public User(String userName, String password, String type) {
        this.userName = userName;
        this.password = password;
        this.type = type;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", password=" + password + ", type=" + type + '}';
    }
    
    
    
}
