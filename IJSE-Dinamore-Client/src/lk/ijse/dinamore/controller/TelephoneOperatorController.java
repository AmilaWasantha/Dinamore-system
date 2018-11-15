/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.controller;

import java.util.ArrayList;

import lk.ijse.dinamore.dto.ItemDTO;
import lk.ijse.dinamore.dto.OrderDTO;
import lk.ijse.dinamore.observer.Observer;
import lk.ijse.dinamore.observer.Subject;
import lk.ijse.dinamore.proxy.ProxyHandler;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.SuperService;
import lk.ijse.dinamore.service.custom.TelephoneOperatorService;

/**
 *
 * @author User
 */
public class TelephoneOperatorController {
    
    public static ArrayList<ItemDTO> getAllItems() throws Exception{
        TelephoneOperatorService service=(TelephoneOperatorService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.TELEOPERATOR);
        return service.getAllItems();
        
    }
    
    public static ItemDTO findItemByID(String id) throws Exception{
        TelephoneOperatorService service=(TelephoneOperatorService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.TELEOPERATOR);
        return service.findItemByID(id);
    }
    
    public static boolean addOrderToQueue(OrderDTO orderDTO) throws Exception{
        TelephoneOperatorService service=(TelephoneOperatorService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.TELEOPERATOR);
        return service.addOrderToQueue(orderDTO);
    }
    
    public static String checkOrderStatus(String orderID) throws Exception{
        TelephoneOperatorService service=(TelephoneOperatorService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.TELEOPERATOR);
        return service.checkOrderStatus(orderID);
    }
    
    public static void RegisterObserver(Observer observer)throws Exception{
        Subject service = (Subject)ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.TELEOPERATOR);
        service.RegisterObserver(observer);
    }
    
    
    
}
