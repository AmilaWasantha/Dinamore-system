/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.dinamore.business.BOFactory;
import lk.ijse.dinamore.business.custom.UserBO;
import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.TelephoneOperatorDTO;
import lk.ijse.dinamore.dto.UserDTO;
import lk.ijse.dinamore.service.custom.UserService;

/**
 *
 * @author User
 */
public class UserServiceImpl extends UnicastRemoteObject implements UserService{
    private UserBO userBO;
    
    public UserServiceImpl()throws RemoteException{
        userBO=(UserBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.USER);
    }

    @Override
    public boolean login(UserDTO userDTO) throws Exception {
        return userBO.login(userDTO);
    }

    @Override
    public TelephoneOperatorDTO getTelephoneOperatorDetails(String name) throws Exception {
        return userBO.getTelephoneOperatorDetails(name);
    }

    @Override
    public ChefDTO getChefDetails(String name) throws Exception {
        return userBO.getChefDetails(name);
    }
    
}
