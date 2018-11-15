/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.SuperService;
import lk.ijse.dinamore.service.custom.impl.AdminServiceImpl;
import lk.ijse.dinamore.service.custom.impl.ChefServiceImpl;
import lk.ijse.dinamore.service.custom.impl.TelephoneOperatorServiceImpl;
import lk.ijse.dinamore.service.custom.impl.UserServiceImpl;

/**
 *
 * @author User
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory {
    
    public static ServiceFactory serviceFactory;
    
    private ServiceFactoryImpl() throws RemoteException{
        
    }
    
    public static ServiceFactory getInstance() throws RemoteException{
        if(serviceFactory==null){
            serviceFactory=new ServiceFactoryImpl();
        }
        return serviceFactory;
    }
    @Override
    public SuperService getService(ServiceTypes serviceTypes) throws Exception {
        switch(serviceTypes){
            case CHEF:
                return new ChefServiceImpl();
            case TELEOPERATOR:
                return new TelephoneOperatorServiceImpl();
            case USER:
                return new UserServiceImpl();
                
            case ADMIN:
                return new AdminServiceImpl();
            
           
                
            default:
                return null;
        }
    }
    
}
