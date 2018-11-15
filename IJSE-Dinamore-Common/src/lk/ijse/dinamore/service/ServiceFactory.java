/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service;

import java.rmi.Remote;

/**
 *
 * @author User
 */
public interface ServiceFactory extends Remote  {
    
    public enum ServiceTypes{
        CHEF, TELEOPERATOR, USER, ADMIN,
    }
    
    public SuperService getService(ServiceTypes serviceTypes) throws Exception;
    
}
