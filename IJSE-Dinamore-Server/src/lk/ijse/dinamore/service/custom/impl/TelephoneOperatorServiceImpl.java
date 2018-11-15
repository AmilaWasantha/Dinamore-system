/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.dinamore.business.BOFactory;
import lk.ijse.dinamore.business.custom.TelephoneOperatorBO;
import lk.ijse.dinamore.dto.ItemDTO;
import lk.ijse.dinamore.dto.OrderDTO;
import lk.ijse.dinamore.observer.Observer;
import lk.ijse.dinamore.observer.Subject;
import lk.ijse.dinamore.service.custom.TelephoneOperatorService;

/**
 *
 * @author User
 */
public class TelephoneOperatorServiceImpl extends UnicastRemoteObject  implements TelephoneOperatorService ,Subject{
    
    private TelephoneOperatorBO telephoneOperatorBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    
    public TelephoneOperatorServiceImpl()throws RemoteException{
        telephoneOperatorBO=(TelephoneOperatorBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.TELEPHONEOPERATOR);
        
        
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws Exception {
        return telephoneOperatorBO.getAllItems();
    }

    @Override
    public ItemDTO findItemByID(String id) throws Exception {
        return telephoneOperatorBO.findItemByID(id);
    }

    @Override
    public boolean addOrderToQueue(OrderDTO orderDTO) throws Exception {
        return telephoneOperatorBO.addOrderToQueue(orderDTO);
    }

    @Override
    public String checkOrderStatus(String orderID) throws Exception {
        return telephoneOperatorBO.checkOrderStatus(orderID);
    }

    @Override
    public void RegisterObserver(Observer observer) throws Exception {
        alObservers.add(observer);
    }

    @Override
    public void UnRegisterObserver(Observer observer) throws Exception {
        alObservers.remove(observer);
    }

    @Override
    public void NotifyAllObservers() throws Exception {
         new Thread(() -> {
            for (Observer observer : alObservers) {
                try {
                    observer.update();
                } catch (Exception ex) {
                    Logger.getLogger(TelephoneOperatorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }
    
}
