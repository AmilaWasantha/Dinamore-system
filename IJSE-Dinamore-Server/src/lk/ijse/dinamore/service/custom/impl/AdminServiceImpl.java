/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.dinamore.business.BOFactory;
import lk.ijse.dinamore.business.custom.AdminBO;
import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.TelephoneOperatorDTO;
import lk.ijse.dinamore.service.custom.AdminService;

/**
 *
 * @author User
 */
public class AdminServiceImpl extends UnicastRemoteObject implements AdminService {
    private AdminBO adminBO;
    
    public AdminServiceImpl() throws RemoteException{
        adminBO=(AdminBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ADMIN);
    }
    @Override
    public boolean registerNewTelephoneOperator(TelephoneOperatorDTO operatorDTO) throws Exception {
        return adminBO.registerNewTelephoneOperator(operatorDTO);
    }

    @Override
    public boolean registerNewChef(ChefDTO chefDTO) throws Exception {
        return adminBO.registerNewChef(chefDTO);
    }
    
}
