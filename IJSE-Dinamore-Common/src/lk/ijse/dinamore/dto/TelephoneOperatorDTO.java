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
public class TelephoneOperatorDTO extends SuperDTO{
    
    private String teleOperatorID;
    private String name;

    public TelephoneOperatorDTO() {
    }

    public TelephoneOperatorDTO(String teleOperatorID, String name) {
        this.teleOperatorID = teleOperatorID;
        this.name = name;
    }

    /**
     * @return the teleOperatorID
     */
    public String getTeleOperatorID() {
        return teleOperatorID;
    }

    /**
     * @param teleOperatorID the teleOperatorID to set
     */
    public void setTeleOperatorID(String teleOperatorID) {
        this.teleOperatorID = teleOperatorID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
    
    
}
