/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.business.custom;

import lk.ijse.dinamore.business.SuperBO;
import lk.ijse.dinamore.dto.ChefSummeryReportDTO;
import lk.ijse.dinamore.dto.OrderDTO;
import lk.ijse.dinamore.entity.ChefSummeryReport;

/**
 *
 * @author User
 */
public interface ChefBO extends SuperBO{
    
     public OrderDTO getOrderFromQueue() throws Exception;
     
     public boolean addNewOrder(OrderDTO orderDTO) throws Exception;
     
     public void removeProcessing(String orderID) throws Exception;

    public ChefSummeryReportDTO getChefSummery(OrderDTO orderDTO)throws Exception;
    
}
