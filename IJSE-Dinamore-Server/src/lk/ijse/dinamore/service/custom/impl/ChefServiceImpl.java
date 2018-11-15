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
import lk.ijse.dinamore.business.custom.ChefBO;
import lk.ijse.dinamore.dto.ChefSummeryReportDTO;
import lk.ijse.dinamore.dto.OrderDTO;
import lk.ijse.dinamore.observer.Observer;
import lk.ijse.dinamore.observer.Subject;
import lk.ijse.dinamore.service.custom.ChefService;

/**
 *
 * @author User
 */
public class ChefServiceImpl extends UnicastRemoteObject implements ChefService ,Subject{
    private ChefBO chefBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    
    public ChefServiceImpl() throws RemoteException{
        chefBO=(ChefBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CHEF);
    }

    @Override
    public OrderDTO getOrderFromQueue() throws Exception {
        return chefBO.getOrderFromQueue();
        
    }

    @Override
    public boolean addNewOrder(OrderDTO orderDTO) throws Exception {
        return chefBO.addNewOrder(orderDTO);
    }

    @Override
    public void removeProcessing(String orderID) throws Exception {
        chefBO.removeProcessing(orderID);
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
                    Logger.getLogger(ChefServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public ChefSummeryReportDTO getChefSummery(OrderDTO orderDTO) throws Exception{
        return chefBO.getChefSummery(orderDTO);
    }
            
    
}
