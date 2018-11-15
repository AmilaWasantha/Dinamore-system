/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.repository.custom;

import lk.ijse.dinamore.entity.TelephoneOperator;
import lk.ijse.dinamore.entity.User;
import lk.ijse.dinamore.repository.SuperRepository;

/**
 *
 * @author User
 */
public interface UserRepository  extends SuperRepository<User, String>{
    
    public boolean login(User user) throws Exception;
    
    
}
