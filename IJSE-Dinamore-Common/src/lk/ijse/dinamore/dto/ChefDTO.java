/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.dto;

/**
 *
 * @author User
 */
public class ChefDTO extends SuperDTO {
    
    private String chefID;
    private String chefName;

    public ChefDTO() {
    }

    public ChefDTO(String chefID, String chefName) {
        this.chefID = chefID;
        this.chefName = chefName;
    }

    /**
     * @return the chefID
     */
    public String getChefID() {
        return chefID;
    }

    /**
     * @param chefID the chefID to set
     */
    public void setChefID(String chefID) {
        this.chefID = chefID;
    }

    /**
     * @return the chefName
     */
    public String getChefName() {
        return chefName;
    }

    /**
     * @param chefName the chefName to set
     */
    public void setChefName(String chefName) {
        this.chefName = chefName;
    }
    
    
    
}
