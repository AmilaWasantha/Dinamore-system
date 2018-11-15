/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom;

import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.TelephoneOperatorDTO;
import lk.ijse.dinamore.service.SuperService;

/**
 *
 * @author User
 */
public interface AdminService extends SuperService {
    
    public boolean registerNewTelephoneOperator(TelephoneOperatorDTO operatorDTO) throws Exception;
    
    public boolean registerNewChef(ChefDTO chefDTO) throws Exception;
    
}
