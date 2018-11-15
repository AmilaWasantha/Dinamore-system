/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.controller;

import lk.ijse.dinamore.dto.ChefSummeryReportDTO;
import lk.ijse.dinamore.dto.OrderDTO;
import lk.ijse.dinamore.observer.Observer;
import lk.ijse.dinamore.observer.Subject;
import lk.ijse.dinamore.proxy.ProxyHandler;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.custom.ChefService;
import lk.ijse.dinamore.views.ChefManage;

/**
 *
 * @author User
 */
public class ChefController {
    
    public static OrderDTO getOrderFromQueue() throws Exception{
        ChefService chefService=(ChefService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CHEF);
        return chefService.getOrderFromQueue();
    }
     public static boolean addNewOrder(OrderDTO orderDTO) throws Exception{
         ChefService chefService=(ChefService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CHEF);
         return chefService.addNewOrder(orderDTO);
     }
     
     public static void removeProcessing(String orderID) throws Exception{
         ChefService chefService=(ChefService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CHEF);
         chefService.removeProcessing(orderID);
     }

    public static void registerObserver(Observer observer) throws Exception {
        Subject service=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CHEF);
        //service.RegisterObserver(observer);
    }

    public static ChefSummeryReportDTO getChefSummary(OrderDTO orderDTO) throws Exception {
        ChefService service=(ChefService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.CHEF);
        return service.getChefSummery(orderDTO);
    }
     
    
}
