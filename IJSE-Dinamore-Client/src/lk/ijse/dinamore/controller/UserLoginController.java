/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.controller;

import java.rmi.RemoteException;
import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.TelephoneOperatorDTO;
import lk.ijse.dinamore.dto.UserDTO;
import lk.ijse.dinamore.proxy.ProxyHandler;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.custom.UserService;

/**
 *
 * @author User
 */
public class UserLoginController {
    
    public static boolean login(UserDTO userDTO) throws Exception{
        UserService userService=(UserService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USER);
        return userService.login(userDTO);
    }
    
    public static TelephoneOperatorDTO getTelephoneOperatorDetails(String name) throws Exception{
        UserService userService=(UserService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USER);
        return userService.getTelephoneOperatorDetails(name);
    }
    
    public static ChefDTO getChefDetails(String name) throws Exception{
        UserService userService=(UserService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.USER);
        return userService.getChefDetails(name);
    }
    
}
