/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.business.custom;

import lk.ijse.dinamore.business.SuperBO;
import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.TelephoneOperatorDTO;

/**
 *
 * @author User
 */
public interface AdminBO extends SuperBO {
    
    public boolean registerNewTelephoneOperator(TelephoneOperatorDTO operatorDTO) throws Exception;
    
    public boolean registerNewChef(ChefDTO chefDTO) throws Exception;
}
