/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom;

import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.TelephoneOperatorDTO;
import lk.ijse.dinamore.dto.UserDTO;
import lk.ijse.dinamore.service.SuperService;

/**
 *
 * @author User
 */
public interface UserService extends SuperService {
    
    public boolean login(UserDTO userDTO) throws Exception;
    
    public TelephoneOperatorDTO getTelephoneOperatorDetails(String name) throws Exception;
    
    public ChefDTO getChefDetails(String name) throws Exception;
    
    
}
