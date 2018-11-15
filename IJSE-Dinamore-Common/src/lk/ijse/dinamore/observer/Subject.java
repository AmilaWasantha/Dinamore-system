/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.observer;

import java.rmi.Remote;
import lk.ijse.dinamore.service.SuperService;

/**
 *
 * @author user
 */
public interface Subject extends Remote{
    
    public void RegisterObserver(Observer observer)throws Exception;
    
    public void UnRegisterObserver(Observer observer)throws Exception;
    
    public void NotifyAllObservers()throws Exception;
    
}
