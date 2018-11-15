/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.controller;

import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.TelephoneOperatorDTO;
import lk.ijse.dinamore.proxy.ProxyHandler;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.custom.AdminService;

/**
 *
 * @author User
 */
public class AdminController {
    
    public static boolean registerNewTelephoneOperator(TelephoneOperatorDTO operatorDTO) throws Exception{
        AdminService adminService=(AdminService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADMIN);
        return adminService.registerNewTelephoneOperator(operatorDTO);
    }
    
    public static boolean registerNewChef(ChefDTO chefDTO) throws Exception{
        AdminService adminService=(AdminService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADMIN);
        return adminService.registerNewChef(chefDTO);
    }
    
}
